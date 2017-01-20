package conexionesBD;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import estructuraDeDatos.Persona;

public class ConexionConPersonas {

	conexionSQL Conexion=new conexionSQL();
	
	public Persona ObtenerPersonaDeLaBaseDeDatos(String Cedula)
	{
		Persona laPersonaBuscada=null;
		 Connection accesoABaseDeDatos= Conexion.ObtenerConexion();
	        String registro=null;
	      
	        try {
	            String consulta="Select from Personas where cedula="+Cedula;
	            PreparedStatement pstm = accesoABaseDeDatos.prepareStatement(consulta);
	            //en esta parte de debe poner los datos que se van a traer de la BD, una por una
	    //      pstm.setString(1,laCarrera.getCarrera());
	    //      pstm.setInt(2,laCarrera.getIdcoordinacion());
	            pstm.execute();
	            pstm.close();
	                  
	        } catch (Exception e) {
	             JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
	           
	        }	
		return laPersonaBuscada;
	}

}
