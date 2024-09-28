/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

/**
 *
 * @author Beto_
 */
public class Reporte {
    public void generarReporte1(String rutaPDF, String[] nombresSucursales, String[] dias) throws BadElementException, IOException {
        ConexionBD conexionBD = new ConexionBD();

        try (Connection conexion = conexionBD.crearConexion()) {
            String consulta = """
                                     SELECT DISTINCT c.nombre, s.nombre, COUNT(f.id) AS totalBoletos, SUM(co.costo) AS totalVentas
                                     FROM ciudad AS c
                                     INNER JOIN sucursal AS s ON c.id = s.id_ciudad
                                     INNER JOIN sala AS sa ON s.nombre = sa.nombre_sucursal
                                     INNER JOIN funcion AS f ON sa.id = f.id_sala
                                     INNER JOIN compras AS co ON f.id = co.id_funcion
                                     WHERE s.nombre IN (?) AND f.dia IN (?)
                                     GROUP BY s.nombre;""";
            
            // Crear un PreparedStatement con marcadores de posición para las listas
            PreparedStatement statement = conexion.prepareStatement(consulta);

            // Convertir los arreglos de nombres de sucursales y días en cadenas con formato IN
            String nombresSucursalesString = String.join(",", Arrays.asList(nombresSucursales));
            String diasString = String.join(",", Arrays.asList(dias));

            // Establecer los parámetros
            statement.setString(1, nombresSucursalesString);
            statement.setString(2, diasString);

            Document documento = new Document();
            PdfWriter.getInstance(documento, new FileOutputStream(rutaPDF));
            documento.open();

            Image imagen = Image.getInstance("cinepolis_logo.png");
            imagen.scaleToFit(150, 150);
            documento.add(imagen);

            documento.add(new Paragraph("Boleto de Cinépolis"));

            try (ResultSet result = statement.executeQuery()) {

                while (result.next()) {
                    PdfPTable tabla = new PdfPTable(2);
                    tabla.setWidthPercentage(100);
                    tabla.setSpacingBefore(10f);
                    tabla.setSpacingAfter(10f);

                    agregarCelda(tabla, "Ciudad", result.getString("c.nombre"));
                    agregarCelda(tabla, "Sucursal", nombresSucursalesString);
                    agregarCelda(tabla, "dias", diasString);
                    agregarCelda(tabla, "total de Boletos", String.valueOf(result.getDouble("totalBoletos")));
                    agregarCelda(tabla, "total de Ventas", String.valueOf(result.getDouble("totalVentas")));
                    
                    // Agregar una descripción en negrita antes de la tabla
                    Paragraph descripcion = new Paragraph("Reporte de ganancias por sucursales\n " 
                                                    +"Sucursales: " + nombresSucursalesString +"\n"
                                                    +"Dias: " + diasString + "\n");
                    descripcion.setFont(FontFactory.getFont(FontFactory.HELVETICA_BOLD));
                    documento.add(descripcion);
                    documento.add(tabla);

//                    Image qrCode = Image.getInstance("qr_code.png");
//                    qrCode.scaleToFit(100, 100);
//                    qrCode.setAlignment(Element.ALIGN_CENTER);
//                    documento.add(qrCode);

                    documento.add(new Paragraph("\n\n"));
                    documento.newPage();
                }
            }

            documento.close();
        } catch (SQLException | DocumentException | FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    
    public void generarReporte3(String rutaPDF, Date fechaInicio, Date fechaFin) throws BadElementException, IOException {
        ConexionBD conexionBD = new ConexionBD();

        try (Connection conexion = conexionBD.crearConexion()) {
            String consulta = """
                                    SELECT DISTINCT su.nombre, c.metodoPago, SUM(c.costo) AS totalVentas
                                    FROM compras AS c
                                    INNER JOIN funcion AS f ON c.id_funcion = f.id
                                    INNER JOIN sala AS s ON f.id_sala = s.id
                                    INNER JOIN sucursal AS su ON s.nombre_sucursal = su.nombre
                                    WHERE DATE(c.fechaHora) BETWEEN (?) AND (?)
                                    GROUP BY su.nombre, c.metodoPago;""";
            
            // Crear un PreparedStatement con marcadores de posición para las listas
            PreparedStatement statement = conexion.prepareStatement(consulta);

            // Establecer los parámetros
            statement.setDate(1, fechaInicio);
            statement.setDate(2, fechaFin);

            Document documento = new Document();
            PdfWriter.getInstance(documento, new FileOutputStream(rutaPDF));
            documento.open();

            Image imagen = Image.getInstance("cinepolis_logo.png");
            imagen.scaleToFit(150, 150);
            documento.add(imagen);

            documento.add(new Paragraph("Boleto de Cinépolis"));

            try (ResultSet result = statement.executeQuery()) {

                while (result.next()) {
                    PdfPTable tabla = new PdfPTable(2);
                    tabla.setWidthPercentage(100);
                    tabla.setSpacingBefore(10f);
                    tabla.setSpacingAfter(10f);

                    agregarCelda(tabla, "Sucursal", result.getString("s.nombre"));
                    agregarCelda(tabla, "metodo de pago", result.getString("metodoPago"));
                    agregarCelda(tabla, "total de Ventas", String.valueOf(result.getDouble("totalVentas")));
                    
                    // Agregar una descripción en negrita antes de la tabla
                    Paragraph descripcion = new Paragraph("Reporte de ganancias por tipos de pagos\n " 
                                                    +"De: " + fechaInicio.toString()
                                                    +" hasta: " + fechaFin.toString());
                    descripcion.setFont(FontFactory.getFont(FontFactory.HELVETICA_BOLD));
                    documento.add(descripcion);
                    documento.add(tabla);

//                    Image qrCode = Image.getInstance("qr_code.png");
//                    qrCode.scaleToFit(100, 100);
//                    qrCode.setAlignment(Element.ALIGN_CENTER);
//                    documento.add(qrCode);

                    documento.add(new Paragraph("\n\n"));
                    documento.newPage();
                }
            }

            documento.close();
        } catch (SQLException | DocumentException | FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    
    public void generarTicket(String rutaPDF)throws BadElementException, IOException {
        ConexionBD conexionBD = new ConexionBD();

        try (Connection conexion = conexionBD.crearConexion()) {
            String consulta = """
                              SELECT cm.id, cm.fechaHora, c.nombres, c.apellidoPat, c.apellidoMat
                              "p.titulo, su.nombre AS sucursal, s.nombre AS nombreSala, f.dia, f.horaInicio, f.horaFin
                              "FROM compras AS cm
                              "INNER JOIN funcion f ON cm.id_funcion = f.id
                              "INNER JOIN pelicula p ON f.id_Pelicula = p.id
                              "INNER JOIN sala s ON f.id_sala = s.id
                              "INNER JOIN sucursal su ON su.nombre = s.nombre_sucursal
                              "INNER JOIN cliente c ON cm.id_cliente = c.id;""";

            Document documento = new Document();
            PdfWriter.getInstance(documento, new FileOutputStream(rutaPDF));
            documento.open();

            Image imagen = Image.getInstance("cinepolis_logo.png");
            imagen.scaleToFit(150, 150);
            documento.add(imagen);

            documento.add(new Paragraph("Boleto de Cinépolis"));

            try (PreparedStatement ps = conexion.prepareStatement(consulta); ResultSet rs = ps.executeQuery()) {

                while (rs.next()) {
                    PdfPTable tabla = new PdfPTable(2);
                    tabla.setWidthPercentage(100);
                    tabla.setSpacingBefore(10f);
                    tabla.setSpacingAfter(10f);

                    agregarCelda(tabla, "id boleto", String.valueOf(rs.getInt("cm.id")));
                    agregarCelda(tabla, "fecha y Hora", rs.getTimestamp("cm.fechaHora").toString());
                    agregarCelda(tabla, "Nombres", rs.getString("c.nombres"));
                    agregarCelda(tabla, "apellido Paterno", rs.getString("c.apellidoPat"));
                    agregarCelda(tabla, "Apellido Materno", rs.getString("c.apellidoMat"));
                    agregarCelda(tabla, "Pelicula", rs.getString("p.titulo"));
                    agregarCelda(tabla, "Sucursal", rs.getString("sucursal"));
                    agregarCelda(tabla, "sala", rs.getString("nombreSala"));
                    agregarCelda(tabla, "Dia", rs.getString("f.dia"));
                    agregarCelda(tabla, "Hora de Inicio", rs.getTime("HoraInicio").toString());
                    agregarCelda(tabla, "Hora de Fin", rs.getTime("HoraFin").toString());

                    documento.add(tabla);

                    Image qrCode = Image.getInstance("qr_code.png");
                    qrCode.scaleToFit(100, 100);
                    qrCode.setAlignment(Element.ALIGN_CENTER);
                    documento.add(qrCode);

                    documento.add(new Paragraph("\n\n"));
                    documento.newPage();
                }
            }

            documento.close();
        } catch (SQLException | DocumentException | FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    private void agregarCelda(PdfPTable tabla, String etiqueta, String valor) {
        PdfPCell celdaEtiqueta = new PdfPCell(new Paragraph(etiqueta));
        PdfPCell celdaValor = new PdfPCell(new Paragraph(valor));
        tabla.addCell(celdaEtiqueta);
        tabla.addCell(celdaValor);
    }
}
