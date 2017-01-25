package impresion;

import java.awt.Graphics;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

import estructuraDeDatos.Operaciones;
import estructuraDeDatos.Persona;

public class ImpresionDeRecibos implements Printable {

	public boolean EntradaRecibos(Persona cliente){
		
		return true;/*cambia si se ha podido encolar la impresion o no*/
	}

	@Override
	public int print(Graphics grafico, PageFormat formato, int indiceDePagina) throws PrinterException {
		return 0;
	}
	
}/*fin de clase*/
