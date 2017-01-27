package Gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import conexionesBD.conexionSQL;
import estructuraDeDatos.*;
import impresion.ImpresionDeRecibos;

public class Main implements ActionListener {
	
	JFrame VentanaMain = new JFrame("CEMPRODECA");
	
	JMenuItem jmiAgregarUnCliente, jmiAgregarUnaOperacion, jmiConsultaDeClientes,
	jmiConsultaPorCedula, jmiConsultaDeRecibos, jmiSalir;
	
	conexionSQL con;
	GuiConsultaCliente GCC;
	ImpresionDeRecibos impresion;
	private static Main jfPrincipal;
	
	public static void main(String[] args) {
		jfPrincipal = new Main();
	}/*fin de main*/
	
	public Main(){
	EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {	
					jfPrincipal.CreaVentana();
					VentanaMain.repaint();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void CreaVentana(){
		con = new conexionSQL();
		GCC = new GuiConsultaCliente(jfPrincipal, con);
		
		VentanaMain.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);/*cierre manual de ventana controlado por el evento*/
		
		VentanaMain.setBounds(100, 100, 800, 400);
		VentanaMain.setVisible(true);
		VentanaMain.addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent e) {
					/*se debe cerrar el Stream hacia la database aqui por si le dan a la x*/
					int op = JOptionPane.showConfirmDialog(null, "Desea Salir?", "Verificacion de cierre",JOptionPane.YES_NO_OPTION);
						if(op == JOptionPane.YES_OPTION){
							System.exit(0);
						}/*fin de verificacion de salida*/
				   }/*fin de windowClosing*/
			});/*cierre personalizado para presion de X*/
		
		JMenuBar jmbPrincipal = new JMenuBar();
		jmbPrincipal.setBounds(0,0,800,10);
		VentanaMain.setJMenuBar(jmbPrincipal);
		jmbPrincipal.repaint();
		
		JMenu jmNuevo = new JMenu("Nuevo");
		jmbPrincipal.add(jmNuevo);
		
		jmiAgregarUnCliente = new JMenuItem("Agregar un Cliente");
		jmiAgregarUnCliente.addActionListener(this);
		jmNuevo.add(jmiAgregarUnCliente);
		
		jmiAgregarUnaOperacion = new JMenuItem("Agregar una Operacion");
		jmiAgregarUnaOperacion.addActionListener(this);
		jmNuevo.add(jmiAgregarUnaOperacion);
		
		jmiSalir = new JMenuItem("Salir");
		jmiSalir.setToolTipText("Cierra el programa");
		jmiSalir.addActionListener(this);
		jmNuevo.add(jmiSalir);
		
		JMenu Catalogos = new JMenu("Catalogos");
		jmbPrincipal.add(Catalogos);
		
		jmiConsultaDeClientes = new JMenuItem("Consulta de Clientes");
		jmiConsultaDeClientes.setToolTipText("Consultar un cliente por su nombre");
		jmiConsultaDeClientes.addActionListener(this);
		Catalogos.add(jmiConsultaDeClientes);
		
		jmiConsultaPorCedula = new JMenuItem("Consulta por Cedula");
		jmiConsultaPorCedula.setToolTipText("Buscar un cliente por numero de cedula");
		jmiConsultaPorCedula.addActionListener(this);
		Catalogos.add(jmiConsultaPorCedula);
		
		jmiConsultaDeRecibos = new JMenuItem("Consulta de Recibos");
		jmiConsultaDeRecibos.setToolTipText("Consultar un recibo por numero consecutivo");
		jmiConsultaDeClientes.addActionListener(this);
		Catalogos.add(jmiConsultaDeRecibos);
		
	}/*fin de creacion de ventana*/
	
	public void QuitarPanel(JPanel p){
		VentanaMain.remove(p);
	}/*fin de quitar panel*/
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		VentanaMain.repaint();
		if(evento.getSource() == jmiAgregarUnCliente){
			
		}/*fin de agregar un cliente*/
		
		if(evento.getSource() == jmiAgregarUnaOperacion){
			
		}/*fin de agregar una opecion*/
		
		if(evento.getSource() == jmiConsultaDeClientes){
			
		}/*fin de consultar clientes*/
		
		if(evento.getSource() == jmiConsultaDeRecibos){
			
		}/*fin de consultar recibos*/
		
		if(evento.getSource() == jmiConsultaPorCedula){
			GCC.GeneraVentana();
			VentanaMain.add(GCC.panelConsultaCliente);
			VentanaMain.repaint();
		}/*fin de consultar por cedula*/
		
		if(evento.getSource() == jmiSalir){
			int op = JOptionPane.showConfirmDialog(null, "Desea Salir?", "Verificacion de cierre",JOptionPane.YES_NO_OPTION);
			if(op == JOptionPane.YES_OPTION){
				System.exit(0);
			}/*fin de verificacion de salida*/
		}/*fin de boton de salida*/
		
	}/*fin de eventos*/

}/*fin de clase*/
