package general;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Main {
	
	JFrame VentanaMain = new JFrame("CEMPRODECA");
	
	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		Main m = new Main();
		
	}
	
	public Main(){
		
		VentanaMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		VentanaMain.setBounds(100, 100, 800, 400);
		VentanaMain.setVisible(true);
		JMenuBar menuBar = new JMenuBar();
		VentanaMain.setJMenuBar(menuBar);
		
		JMenu mnNuevo = new JMenu("Nuevo");
		menuBar.add(mnNuevo);
		
		JMenuItem mntmAgregarUnCliente = new JMenuItem("Agregar un Cliente");
		mnNuevo.add(mntmAgregarUnCliente);
		
		JMenuItem mntmAgregarUnaOperacion = new JMenuItem("Agregar una Operacion");
		mnNuevo.add(mntmAgregarUnaOperacion);
		
		JMenu Catalogos = new JMenu("Catalogos");
		menuBar.add(Catalogos);
		
		JMenuItem mntmConsultaDeClientes = new JMenuItem("Consulta de Clientes");
		mntmConsultaDeClientes.setToolTipText("Consultar un cliente por su nombre");
		Catalogos.add(mntmConsultaDeClientes);
		
		JMenuItem mntmConsultaPorCedula = new JMenuItem("Consulta por Cedula");
		mntmConsultaPorCedula.setToolTipText("Buscar un cliente por numero de cedula");
		Catalogos.add(mntmConsultaPorCedula);
		
		JMenuItem mntmConsultaDeRecibos = new JMenuItem("Consulta de Recibos");
		mntmConsultaDeRecibos.setToolTipText("Consultar un recibo por numero consecutivo");
		Catalogos.add(mntmConsultaDeRecibos);
		
		VentanaMain.repaint();
	}/*fin de constructor*/
	
}
