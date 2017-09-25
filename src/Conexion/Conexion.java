/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import dto.estudiante;
import dto.usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author giovanny
 */
public class Conexion 
{
    Connection con=null;
    
    public Connection getConexion()
    {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con= DriverManager.getConnection("jdbc:derby://localhost:1527/parque");
            
            JOptionPane.showMessageDialog(null, "Conexion en linea");
        } catch (Exception ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;
    }
    
    public ResultSet consultaGeneral(String consulta)
    {
        ResultSet rs=null;
        
        try {
            PreparedStatement ps= con.prepareStatement(consulta);
            
            rs= ps.executeQuery();
        } catch (Exception ex) {
            //Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            ex.getMessage();
        }
        return rs;
    }
    
    public void insertar(estudiante est) throws SQLException
    {
        try 
        {
//            Statement st = con.createStatement();
//            st.executeUpdate("INSERT INTO estudiantes VALUES(1,'265','ana maria','ana@','modelage','5','ciencias','Si','5673265','antioquia','4.56/20172','espera','espera','medellin','IEJMC','58','20171')");
           //Para insertar todos los campos
            PreparedStatement ps = con.prepareStatement("INSERT INTO estudiantes VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            //se envia los datos a la base de datos
            ps.setInt(1, est.getDocumento());
            ps.setString(2, est.getCodigo());
            ps.setString(3, est.getNombres());
            ps.setString(4, est.getCorreo());
            ps.setString(5, est.getUniversidad());
            ps.setString(6, est.getCarrera());
            ps.setString(7, est.getSemestre());
            ps.setString(8, est.getFacultad());
            ps.setString(9, est.getCarnet());
            ps.setString(10, est.getTelefono());
            ps.setString(11, est.getPromedio_año());
            ps.setString(12, est.getEstado());
            ps.setString(13, est.getTipo_subsidio());
            ps.setString(14, est.getCiudad());
            ps.setString(15, est.getInstitucion_graduado());
            ps.setString(16, est.getSisben());
            ps.setString(17, est.getAño_ingreso_programa());
            //System.out.println("get: "+getCurrentTimeStamp());
            ps.setTimestamp(18, getCurrentTimeStamp());
            //System.out.println("id conexion: "+est.getUsuarios_id());
            ps.setInt(19, est.getUsuarios_id());
            ps.setString(20, est.getModifico());
            
            ps.executeUpdate();
            ps.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Se inserto correctamente");
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            //JOptionPane.showMessageDialog(null, "Error: El estudiante ya existe");
        }
         
    }
    
    private static java.sql.Timestamp getCurrentTimeStamp() {

	java.util.Date today = new java.util.Date();
	return new java.sql.Timestamp(today.getTime());

    }
    
    
    public void actualizar(estudiante est,int prDocumento)
    {
        
        try {
        PreparedStatement ps = con.prepareStatement("update estudiantes set DOCUMENTO=?,codigo=?,nombres=?,correo=?,carrera=?,semestre=?,facultad=?,carnet=?,telefono=?,"
                    + "universidad=?,promedio_año=?,estado=?,tipo_subsidio=?,ciudad=?,institucion_graduado=?,sisben=?,año_ingreso_programa=?,fecha=?,usuarios_id=?,modifico=? where documento=" + prDocumento);
            ps.setInt(1, est.getDocumento());
            ps.setString(2, est.getCodigo());
            ps.setString(3, est.getNombres());
            ps.setString(4, est.getCorreo());
            ps.setString(5, est.getCarrera());
            ps.setString(6, est.getSemestre());
            ps.setString(7, est.getFacultad());
            ps.setString(8, est.getCarnet());
            ps.setString(9, est.getTelefono());
            ps.setString(10, est.getUniversidad());
            ps.setString(11, est.getPromedio_año());
            ps.setString(12, est.getEstado());
            ps.setString(13, est.getTipo_subsidio());
            ps.setString(14, est.getCiudad());
            ps.setString(15, est.getInstitucion_graduado());
            ps.setString(16, est.getSisben());
            ps.setString(17, est.getAño_ingreso_programa());
            ps.setTimestamp(18, getCurrentTimeStamp());
            ps.setInt(19, est.getUsuarios_id());
            ps.setString(20, est.getModifico());
            ps.executeUpdate();
            ps.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Se actualizo correctamente");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
    
    public void borrar(estudiante id) throws SQLException
    {
        PreparedStatement ps = con.prepareStatement("delete from estudiantes where documento= ?");
        ps.setInt(1, id.getDocumento());
        ps.executeUpdate();
        ps.close();
        con.close();
    }
    
    public static void main(String[]args)
    {
        Conexion c= new Conexion();
        c.getConexion();
    }
}
