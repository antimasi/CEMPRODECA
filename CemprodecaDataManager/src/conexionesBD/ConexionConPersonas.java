package conexionesBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import estructuraDeDatos.Persona;

public class ConexionConPersonas {

	conexionSQL Conexion;	
	
	public void IngresarPersona(Persona LaNuevaPersona)
	{
		Conexion=new conexionSQL();
	    Connection accesoABaseDeDatos= Conexion.ObtenerConexion();
       
        
        try {
            
             String consultadeinsercion="INSERT INTO Personas () VALUES ()" ; // hay q poner lo campos a llenar
             PreparedStatement consulta = accesoABaseDeDatos.prepareStatement(consultadeinsercion);
             //falta poner los campos 
           //  pstm.setString(1,elTelefono.getTelefono());
           //  pstm.setInt(2,elTelefono.getIdcontacto());
             consulta.execute();
             consulta.close();
                  
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
           
        }
		
		
		
	}
	
	
	public Persona ObtenerPersonaDeLaBaseDeDatos(String Cedula)
	{
		Conexion=new conexionSQL();
		Persona laPersonaBuscada=null;
		 Connection accesoABaseDeDatos= Conexion.ObtenerConexion();
	        String registro=null;
	      
	        try {
	        	 PreparedStatement consulta= accesoABaseDeDatos.prepareStatement("Select from Personas where cedula="+Cedula);
	             ResultSet resultadoDeLaConsulta=consulta.executeQuery();

	laPersonaBuscada.setApellidoyNombre(resultadoDeLaConsulta.getString(1));
	laPersonaBuscada.setApodo(resultadoDeLaConsulta.getString(2));
	//laPersonaBuscada.setCantidadDeVeces(resultadoDeLaConsulta.getString(3)); falta pasar esto de string a char
	laPersonaBuscada.setCedula(resultadoDeLaConsulta.getString(4));
	laPersonaBuscada.setCelular(resultadoDeLaConsulta.getString(5));
	laPersonaBuscada.setCodigoDeOcupacion(resultadoDeLaConsulta.getString(6));
	laPersonaBuscada.setCodigoDeUbicacion(resultadoDeLaConsulta.getString(7));
	//laPersonaBuscada.setCompleta(completa);  pasar de string a char
	laPersonaBuscada.setDireccion(resultadoDeLaConsulta.getString(9));
	//LaPersonaBuscada.setEducacion(resultadoDeLaConsulta.getString(10)); pasar de string a char
	//laPersonaBuscada.setEstadoCivil(resultadoDeLaConsulta.getString(11)); pasar de string a char
	laPersonaBuscada.setFechaDeNacimiento(resultadoDeLaConsulta.getDate(12));
	//laPersonaBuscada.setNacionalidad(resultadoDeLaConsulta.getCharacterStream(13));pasar de string a char
	laPersonaBuscada.setNombreDelConyugue(resultadoDeLaConsulta.getString(14));
	laPersonaBuscada.setNombreDeProfesion(resultadoDeLaConsulta.getString(15));
	//laPersonaBuscada.setSexo(resultadoDeLaConsulta.getString(16)); pasar de string a char
	laPersonaBuscada.setTelefono(resultadoDeLaConsulta.getString(17));
	
	
	
	
	        } catch (Exception e) {
	             JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
	           
	        }	
		return laPersonaBuscada;
	}

}
