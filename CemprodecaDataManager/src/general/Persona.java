package general;
import java.util.ArrayList;
import java.util.Date;


public class Persona {

	/*BD PERSONA contiene todos estos datos*/
	/*se busca por apellidoyNombre o cedula seg�n sea el caso*/
	String apellidoyNombre;
	String cedula;
	String codigoDeUbicacion;
	String direccion;
	Date fechaDeNacimiento;
	char sexo;
	char educacion;
	char completa;
	char estadoCivil;
	char cantidadDeVeces;
	String codigoDeOcupacion;
	String nombreDeProfesion;
	String telefono;
	String celular;
	String nombreDelConyugue;
	char nacionalidad;
	String apodo;
	
	
	/*BD OPERACION contiene mas de una, arraylist*/
	ArrayList<Operaciones> numeroDeOperacion;
	
}/*fin de clase*/
