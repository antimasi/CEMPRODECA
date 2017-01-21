package LogicaDeNegocio;

import conexionesBD.ConexionConPersonas;
import estructuraDeDatos.Persona;

public class LogicaDeNegocioDePersona 

    {

	Persona LaPersona;
	ConexionConPersonas GestorDePersonas;
	public Persona BuscarPersonaPorCedula(String Cedula)
	{
	Persona laPersonaBuscada;
	GestorDePersonas=new ConexionConPersonas();
	laPersonaBuscada=GestorDePersonas.ObtenerPersonaDeLaBaseDeDatos(Cedula);
		
	return laPersonaBuscada;	
		
	}
	
	public void IngresarPersonaAlSistema(Persona LaNuevaPersona)
	{
		GestorDePersonas=new ConexionConPersonas();
		GestorDePersonas.IngresarPersona(LaNuevaPersona);
		
		
	}
	
	
	
	
	
	
	
	

}
