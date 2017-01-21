package estructuraDeDatos;
import java.util.ArrayList;
import java.util.Date;


public class Persona {

	/*BD PERSONA contiene todos estos datos*/
	/*se busca por apellidoyNombre o cedula segun sea el caso*/
	
	public String apellidoyNombre;
	public String cedula;
	public String codigoDeUbicacion;
	public String direccion;
	public Date fechaDeNacimiento;
	public char sexo;
	public char educacion;
	public char completa;
	public char estadoCivil;
	public char cantidadDeVeces;
	public String codigoDeOcupacion;
	public String nombreDeProfesion;
	public String telefono;
	public String celular;
	public String nombreDelConyugue;
	public char nacionalidad;
	public String apodo;
	
	
	/*BD OPERACION contiene mas de una, arraylist*/
	public ArrayList<Operaciones> operaciones;


	public String getApellidoyNombre() {
		return apellidoyNombre;
	}


	public void setApellidoyNombre(String apellidoyNombre) {
		this.apellidoyNombre = apellidoyNombre;
	}


	public String getCedula() {
		return cedula;
	}


	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	public String getCodigoDeUbicacion() {
		return codigoDeUbicacion;
	}


	public void setCodigoDeUbicacion(String codigoDeUbicacion) {
		this.codigoDeUbicacion = codigoDeUbicacion;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}


	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}


	public char getSexo() {
		return sexo;
	}


	public void setSexo(char sexo) {
		this.sexo = sexo;
	}


	public char getEducacion() {
		return educacion;
	}


	public void setEducacion(char educacion) {
		this.educacion = educacion;
	}


	public char getCompleta() {
		return completa;
	}


	public void setCompleta(char completa) {
		this.completa = completa;
	}


	public char getEstadoCivil() {
		return estadoCivil;
	}


	public void setEstadoCivil(char estadoCivil) {
		this.estadoCivil = estadoCivil;
	}


	public char getCantidadDeVeces() {
		return cantidadDeVeces;
	}


	public void setCantidadDeVeces(char cantidadDeVeces) {
		this.cantidadDeVeces = cantidadDeVeces;
	}


	public String getCodigoDeOcupacion() {
		return codigoDeOcupacion;
	}


	public void setCodigoDeOcupacion(String codigoDeOcupacion) {
		this.codigoDeOcupacion = codigoDeOcupacion;
	}


	public String getNombreDeProfesion() {
		return nombreDeProfesion;
	}


	public void setNombreDeProfesion(String nombreDeProfesion) {
		this.nombreDeProfesion = nombreDeProfesion;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getCelular() {
		return celular;
	}


	public void setCelular(String celular) {
		this.celular = celular;
	}


	public String getNombreDelConyugue() {
		return nombreDelConyugue;
	}


	public void setNombreDelConyugue(String nombreDelConyugue) {
		this.nombreDelConyugue = nombreDelConyugue;
	}


	public char getNacionalidad() {
		return nacionalidad;
	}


	public void setNacionalidad(char nacionalidad) {
		this.nacionalidad = nacionalidad;
	}


	public String getApodo() {
		return apodo;
	}


	public void setApodo(String apodo) {
		this.apodo = apodo;
	}


	public ArrayList<Operaciones> getOperaciones() {
		return operaciones;
	}


	public void setOperaciones(ArrayList<Operaciones> operaciones) {
		this.operaciones = operaciones;
	}
	
	
	
	
	
}/*fin de clase*/
