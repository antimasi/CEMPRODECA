package Gui;

import java.awt.CardLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

import conexionesBD.conexionSQL;
import estructuraDeDatos.Persona;

public class GuiConsultaCliente implements ActionListener{
	/*Atributos de clase*/
	public JPanel panelConsultaCliente;
	
	private JTextField tfCedula, tfNombre, tfPlazo, tfTasa, tfPeriodicidadDeInteres, tfPerdiodicidadDeAmortizacion;
	
	private JTable jtTablaDePagos, jtTablaRecibos, jtDatosDeOperaciones;
	
	private JButton btnNuevaConsulta, btnRegresar, btnEmisionDeRecibo, btnImprimirTablas;
	
	/*Relaciones entre clases*/
	Persona persona;
	conexionSQL con;
	Main jfPrincipal;
	
	public GuiConsultaCliente(Main jfPrincipal, conexionSQL con){
		this.con = con;
		this.jfPrincipal = jfPrincipal;
	}
	
	public void GeneraVentana() {
		panelConsultaCliente = new JPanel();
		
		panelConsultaCliente.setLayout(null);
		
		JPanel jpDatosCliente = new JPanel();
		jpDatosCliente.setBounds(0, 0, 800, 400);
		panelConsultaCliente.add(jpDatosCliente);
		jpDatosCliente.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre: ");
		lblNombre.setBounds(12, 7, 48, 17);
		jpDatosCliente.add(lblNombre);
		
		tfNombre = new JTextField();
		tfNombre.setBounds(60, 5, 224, 21);
		jpDatosCliente.add(tfNombre);
		tfNombre.setColumns(20);
		
		JLabel lblCedula = new JLabel("Cedula: ");
		lblCedula.setBounds(288, 7, 43, 17);
		jpDatosCliente.add(lblCedula);
		
		tfCedula = new JTextField();
		tfCedula.setBounds(333, 5, 169, 21);
		jpDatosCliente.add(tfCedula);
		tfCedula.setColumns(15);
		
		JLabel lblPlazo = new JLabel("Meses Plazo");
		lblPlazo.setBounds(12, 36, 68, 17);
		jpDatosCliente.add(lblPlazo);
		
		tfPlazo = new JTextField();
		tfPlazo.setBounds(85, 34, 59, 21);
		jpDatosCliente.add(tfPlazo);
		tfPlazo.setColumns(5);
		
		JLabel lblTasaDeInteres = new JLabel("Tasa:");
		lblTasaDeInteres.setBounds(162, 36, 28, 17);
		jpDatosCliente.add(lblTasaDeInteres);
		
		tfTasa = new JTextField();
		tfTasa.setBounds(196, 34, 37, 21);
		jpDatosCliente.add(tfTasa);
		tfTasa.setColumns(3);
		
		JLabel lblPeriodicidadDeInteres = new JLabel("Periodicidad de Interes: ");
		lblPeriodicidadDeInteres.setBounds(12, 65, 129, 17);
		jpDatosCliente.add(lblPeriodicidadDeInteres);
		
		tfPeriodicidadDeInteres = new JTextField();
		tfPeriodicidadDeInteres.setBounds(141, 63, 37, 21);
		jpDatosCliente.add(tfPeriodicidadDeInteres);
		tfPeriodicidadDeInteres.setColumns(3);
		
		JLabel lblPeriodicidadDeAmortizacion = new JLabel("Periodicidad de Amortizacion: ");
		lblPeriodicidadDeAmortizacion.setBounds(248, 38, 163, 17);
		jpDatosCliente.add(lblPeriodicidadDeAmortizacion);
		
		tfPerdiodicidadDeAmortizacion = new JTextField();
		tfPerdiodicidadDeAmortizacion.setBounds(416, 34, 37, 21);
		jpDatosCliente.add(tfPerdiodicidadDeAmortizacion);
		tfPerdiodicidadDeAmortizacion.setColumns(3);
		
		JScrollPane spDatosDeOperacion = new JScrollPane();
		spDatosDeOperacion.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		spDatosDeOperacion.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		spDatosDeOperacion.setBounds(505, 8, 270, 85);
		jpDatosCliente.add(spDatosDeOperacion);
		
		jtDatosDeOperaciones = new JTable();
		jtDatosDeOperaciones.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Activa", "Operacion", "Monto Inicial", "Fecha de cancelacion"
			}
		) {
			Class[] columnTypes = new Class[] {
				Boolean.class, String.class, Double.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				true, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		jtDatosDeOperaciones.getColumnModel().getColumn(1).setPreferredWidth(100);
		jtDatosDeOperaciones.getColumnModel().getColumn(1).setMinWidth(100);
		jtDatosDeOperaciones.getColumnModel().getColumn(2).setPreferredWidth(200);
		jtDatosDeOperaciones.getColumnModel().getColumn(2).setMinWidth(200);
		jtDatosDeOperaciones.getColumnModel().getColumn(3).setPreferredWidth(150);
		jtDatosDeOperaciones.getColumnModel().getColumn(3).setMinWidth(150);
		spDatosDeOperacion.setViewportView(jtDatosDeOperaciones);
		
		JPanel jpTablasDelCliente = new JPanel();
		jpTablasDelCliente.setBounds(10, 107, 780, 244);
		panelConsultaCliente.add(jpTablasDelCliente);
		jpTablasDelCliente.setLayout(new CardLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		jpTablasDelCliente.add(tabbedPane, "PanelDeTablas");
		
		JPanel jpTablaDePagos = new JPanel();
		tabbedPane.addTab("Tabla de pagos", null, jpTablaDePagos, null);
		jpTablaDePagos.setLayout(null);
		
		JScrollPane spTablaDePagos = new JScrollPane();
		spTablaDePagos.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		spTablaDePagos.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		spTablaDePagos.setBounds(new Rectangle(10, 5, 755, 222));
		jpTablaDePagos.add(spTablaDePagos);
		
		jtTablaDePagos = new JTable();
		jtTablaDePagos.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Cuota", "OPD", "Fecha de vencimiento", "Amortizacion", "Amortizacion pendiente", "Intereses", "Intereses pendientes", "Mora", "Tasa", "Numero de cedula", "Fecha de calculo", "Numero de operacion", "Monto original", "Numero de recibo"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Integer.class, String.class, Double.class, Double.class, Double.class, Double.class, Double.class, Double.class, String.class, String.class, String.class, Double.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		jtTablaDePagos.getColumnModel().getColumn(0).setMinWidth(75);
		jtTablaDePagos.getColumnModel().getColumn(1).setMinWidth(75);
		jtTablaDePagos.getColumnModel().getColumn(2).setPreferredWidth(150);
		jtTablaDePagos.getColumnModel().getColumn(2).setMinWidth(150);
		jtTablaDePagos.getColumnModel().getColumn(3).setPreferredWidth(150);
		jtTablaDePagos.getColumnModel().getColumn(3).setMinWidth(150);
		jtTablaDePagos.getColumnModel().getColumn(4).setPreferredWidth(150);
		jtTablaDePagos.getColumnModel().getColumn(4).setMinWidth(150);
		jtTablaDePagos.getColumnModel().getColumn(5).setPreferredWidth(150);
		jtTablaDePagos.getColumnModel().getColumn(5).setMinWidth(150);
		jtTablaDePagos.getColumnModel().getColumn(6).setPreferredWidth(150);
		jtTablaDePagos.getColumnModel().getColumn(6).setMinWidth(150);
		jtTablaDePagos.getColumnModel().getColumn(7).setPreferredWidth(120);
		jtTablaDePagos.getColumnModel().getColumn(7).setMinWidth(120);
		jtTablaDePagos.getColumnModel().getColumn(8).setPreferredWidth(40);
		jtTablaDePagos.getColumnModel().getColumn(8).setMinWidth(40);
		jtTablaDePagos.getColumnModel().getColumn(9).setPreferredWidth(120);
		jtTablaDePagos.getColumnModel().getColumn(9).setMinWidth(120);
		jtTablaDePagos.getColumnModel().getColumn(10).setPreferredWidth(100);
		jtTablaDePagos.getColumnModel().getColumn(10).setMinWidth(100);
		jtTablaDePagos.getColumnModel().getColumn(11).setPreferredWidth(150);
		jtTablaDePagos.getColumnModel().getColumn(11).setMinWidth(150);
		jtTablaDePagos.getColumnModel().getColumn(12).setPreferredWidth(180);
		jtTablaDePagos.getColumnModel().getColumn(12).setMinWidth(180);
		jtTablaDePagos.getColumnModel().getColumn(13).setPreferredWidth(110);
		jtTablaDePagos.getColumnModel().getColumn(13).setMinWidth(110);
		spTablaDePagos.setViewportView(jtTablaDePagos);
		
		JPanel jpTablaDeRecibos = new JPanel();
		tabbedPane.addTab("Tabla de recibos", null, jpTablaDeRecibos, null);
		jpTablaDeRecibos.setLayout(null);
		
		JScrollPane spTablaDeRecibos = new JScrollPane();
		spTablaDeRecibos.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		spTablaDeRecibos.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		spTablaDeRecibos.setBounds(0, 0, 775, 238);
		jpTablaDeRecibos.add(spTablaDeRecibos);
		
		jtTablaRecibos = new JTable();
		jtTablaRecibos.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"OPD", "Numero de operacion", "Numero de recibo", "Numero de cedula", "Fecha de vencimiento", "Amortizacion", "Amortizacion Atrasada", "Morosidad", "Poliza", "Intereses desde", "Intereses hasta", "Pagado en", "Saldo actual", "Tasa", "Dias de atraso", "Efectivo", "Usuario"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Object.class, Integer.class, Object.class, String.class, Double.class, Object.class, Double.class, Double.class, Object.class, String.class, String.class, Object.class, Double.class, Integer.class, Double.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		jtTablaRecibos.getColumnModel().getColumn(1).setPreferredWidth(150);
		jtTablaRecibos.getColumnModel().getColumn(1).setMinWidth(150);
		jtTablaRecibos.getColumnModel().getColumn(2).setPreferredWidth(100);
		jtTablaRecibos.getColumnModel().getColumn(2).setMinWidth(100);
		jtTablaRecibos.getColumnModel().getColumn(3).setPreferredWidth(100);
		jtTablaRecibos.getColumnModel().getColumn(3).setMinWidth(100);
		jtTablaRecibos.getColumnModel().getColumn(4).setPreferredWidth(130);
		jtTablaRecibos.getColumnModel().getColumn(4).setMinWidth(130);
		jtTablaRecibos.getColumnModel().getColumn(5).setPreferredWidth(200);
		jtTablaRecibos.getColumnModel().getColumn(5).setMinWidth(200);
		jtTablaRecibos.getColumnModel().getColumn(6).setPreferredWidth(200);
		jtTablaRecibos.getColumnModel().getColumn(6).setMinWidth(200);
		jtTablaRecibos.getColumnModel().getColumn(7).setPreferredWidth(100);
		jtTablaRecibos.getColumnModel().getColumn(7).setMinWidth(100);
		jtTablaRecibos.getColumnModel().getColumn(8).setPreferredWidth(100);
		jtTablaRecibos.getColumnModel().getColumn(8).setMinWidth(100);
		jtTablaRecibos.getColumnModel().getColumn(9).setPreferredWidth(100);
		jtTablaRecibos.getColumnModel().getColumn(9).setMinWidth(100);
		jtTablaRecibos.getColumnModel().getColumn(10).setPreferredWidth(100);
		jtTablaRecibos.getColumnModel().getColumn(10).setMinWidth(100);
		jtTablaRecibos.getColumnModel().getColumn(11).setPreferredWidth(100);
		jtTablaRecibos.getColumnModel().getColumn(11).setMinWidth(100);
		jtTablaRecibos.getColumnModel().getColumn(12).setPreferredWidth(200);
		jtTablaRecibos.getColumnModel().getColumn(12).setMinWidth(200);
		jtTablaRecibos.getColumnModel().getColumn(13).setPreferredWidth(50);
		jtTablaRecibos.getColumnModel().getColumn(13).setMinWidth(50);
		jtTablaRecibos.getColumnModel().getColumn(14).setPreferredWidth(100);
		jtTablaRecibos.getColumnModel().getColumn(15).setPreferredWidth(200);
		jtTablaRecibos.getColumnModel().getColumn(15).setMinWidth(200);
		jtTablaRecibos.getColumnModel().getColumn(16).setPreferredWidth(150);
		jtTablaRecibos.getColumnModel().getColumn(16).setMinWidth(150);
		spTablaDeRecibos.setViewportView(jtTablaRecibos);
		
		JPanel jpBotonesDeOpcion = new JPanel();
		jpBotonesDeOpcion.setBounds(10, 350, 780, 39);
		panelConsultaCliente.add(jpBotonesDeOpcion);
		
		btnNuevaConsulta = new JButton("Nueva Consulta");
		jpBotonesDeOpcion.add(btnNuevaConsulta);
		
		btnRegresar = new JButton("Regresar");
		btnRegresar.setToolTipText("Volver al menu principal");
		jpBotonesDeOpcion.add(btnRegresar);
		
		btnEmisionDeRecibo = new JButton("Emision de Recibo");
		btnEmisionDeRecibo.setToolTipText("Facturar un recibo al cliente consultado");
		jpBotonesDeOpcion.add(btnEmisionDeRecibo);
		
		btnImprimirTablas = new JButton("Imprimir Tablas");
		btnImprimirTablas.setToolTipText("Se imprimen la tabla de recibos y la tabla de pagos");
		jpBotonesDeOpcion.add(btnImprimirTablas);
		
	}/*fin de genera ventana*/

	@Override
	public void actionPerformed(ActionEvent event) {
		
		
		if(event.getSource() == btnRegresar){
			jfPrincipal.QuitarPanel(panelConsultaCliente);
			panelConsultaCliente = null;
		}/*fin de evento regresar*/
		
	jfPrincipal.VentanaMain.repaint();/*actualizacion constante de la ventana*/
	}/*fin de actionPerformed*/
	
}
