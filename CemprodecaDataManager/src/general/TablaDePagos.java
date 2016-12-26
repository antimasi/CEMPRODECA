package general;

import java.util.Calendar;

public class TablaDePagos {

	String numeroDeOperacion;/*obtenido de la operacion como tal*/

	int numeroDeCuota;/*id auto generado por la db*/
	double saldo;/*monto total que se va reduciendo segun se avanza en la tabla*/
	double cuotaEfectivo;/*Cuanto debe pagar mensualmente*/
	double intereses;/**/
	double amortizacion;
	double poliza;
	Calendar fechaDePagoMensual;

public TablaDePagos(double saldo, double cuotaEfectivo, double intereses,
		double amortizacion, double poliza, Calendar fechaDePagoMensual) {
	
	this.saldo = saldo;
	this.cuotaEfectivo = cuotaEfectivo;
	this.intereses = intereses;
	this.amortizacion = amortizacion;
	this.poliza = poliza;
	this.fechaDePagoMensual = fechaDePagoMensual;
}/*fin de tabla de pagos*/

public void CargarDeLaBD(int numeroDeCuota, double saldo, double cuotaEfectivo, 
	double intereses, double amortizacion, double poliza, Calendar fechaDePagoMensual){
	
	this.numeroDeCuota = numeroDeCuota;
	this.saldo = saldo;
	this.cuotaEfectivo = cuotaEfectivo;
	this.intereses = intereses;
	this.amortizacion = amortizacion;
	this.poliza = poliza;
	
}/*fin del metodo cargar de la db*/



}/*fin de tabla de pagos*/
