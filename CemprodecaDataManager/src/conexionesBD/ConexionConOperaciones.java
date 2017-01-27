package conexionesBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import javax.swing.JOptionPane;

import estructuraDeDatos.Operaciones;

public class ConexionConOperaciones {
	
	conexionSQL Conexion;	
	public List<Operaciones> ObtenerLasOperacionesDeUnaPersona(String Cedula)
	{
		List<Operaciones> laListaDeOperaciones=null;
		Operaciones laOperacion;
	      
      
        try {
           Connection accesoABaseDeDatos= Conexion.ObtenerConexion();
        PreparedStatement consulta= accesoABaseDeDatos.prepareStatement("Select `numerooperacion`,"
        		+ "`fec_form`, `fec_canc`, `monto`, `tasainteres`, `cuotamensual` from operaciones where `cedula_persona`="+Cedula);
            ResultSet resultadoDeLaConsulta=consulta.executeQuery();
            
            while (resultadoDeLaConsulta.next()) {
            	laOperacion= new Operaciones();
            	laOperacion.setCedula(Cedula);
            	laOperacion.setNumeroDeOperacion(resultadoDeLaConsulta.getString(1));
            	laOperacion.setFechaDeFormalizacion(resultadoDeLaConsulta.getTimestamp(2));
            	laOperacion.setFechaDeCancelacion(resultadoDeLaConsulta.getTimestamp(3));
            	laOperacion.setMontoDelPrestmo(Double.parseDouble(resultadoDeLaConsulta.getString(4)));
            	laOperacion.setTaza(Double.parseDouble(resultadoDeLaConsulta.getString(5)));
            	laOperacion.setPagoMensual(Double.parseDouble(resultadoDeLaConsulta.getString(6)));
            	         
               
            	laListaDeOperaciones.add(laOperacion);
            }
           
        } catch (Exception e) {
        	JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
        }
		
		
		
		return laListaDeOperaciones;
	}
	
	

}
