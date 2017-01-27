package Gui;

import java.awt.BorderLayout;
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
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import conexionesBD.conexionSQL;
import estructuraDeDatos.Persona;

public class GuiConsultaCliente implements ActionListener{
	/*Atributos de clase*/
	public JPanel panelConsultaCliente;
	
	private JTextField tfApellidoYNombre, tfCedula;
	
	private JTable jtOperaciones, jtTablaDeRecibos, jtTablaDePagos;
	
	private JButton btnNuevaConsulta, btnRegresar, btnEmitirRecibo, btnImprimirTablas;
	
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
		panelConsultaCliente.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelConsultaCliente.setLayout(null);
		
		JPanel jpDatosCliente = new JPanel();
		jpDatosCliente.setBounds(12, 0, 774, 124);
		panelConsultaCliente.add(jpDatosCliente);
		jpDatosCliente.setLayout(null);
		
		JLabel lblCliente = new JLabel("Cliente:");
		lblCliente.setBounds(12, 12, 51, 17);
		jpDatosCliente.add(lblCliente);
		
		tfApellidoYNombre = new JTextField();
		tfApellidoYNombre.setBounds(70, 10, 254, 21);
		jpDatosCliente.add(tfApellidoYNombre);
		tfApellidoYNombre.setColumns(10);
		
		JLabel lblCedula = new JLabel("Cedula:");
		lblCedula.setBounds(339, 12, 51, 17);
		jpDatosCliente.add(lblCedula);
		
		tfCedula = new JTextField();
		tfCedula.setBounds(399, 10, 149, 21);
		jpDatosCliente.add(tfCedula);
		tfCedula.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 35, 755, 80);
		jpDatosCliente.add(scrollPane);
		
		jtOperaciones = new JTable();
		jtOperaciones.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Activa", "Numero de operacion", "Fecha de formalizacion", "Fecha de cancelacion", "Cuota", "Periodicidad de interes", "Periodicidad de amortizacion", "Saldo"
			}
		) {
			Class[] columnTypes = new Class[] {
				Boolean.class, String.class, String.class, String.class, Double.class, Integer.class, Integer.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				true, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		jtOperaciones.getColumnModel().getColumn(1).setPreferredWidth(132);
		jtOperaciones.getColumnModel().getColumn(2).setPreferredWidth(142);
		jtOperaciones.getColumnModel().getColumn(3).setPreferredWidth(150);
		jtOperaciones.getColumnModel().getColumn(4).setPreferredWidth(130);
		jtOperaciones.getColumnModel().getColumn(5).setPreferredWidth(150);
		jtOperaciones.getColumnModel().getColumn(6).setPreferredWidth(165);
		jtOperaciones.getColumnModel().getColumn(7).setPreferredWidth(150);
		scrollPane.setViewportView(jtOperaciones);
		
		JPanel jpTablas = new JPanel();
		jpTablas.setBounds(12, 124, 774, 203);
		panelConsultaCliente.add(jpTablas);
		jpTablas.setLayout(new CardLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		jpTablas.add(tabbedPane, "name_2620496115606");
		
		JPanel jpTablaDeRecibos = new JPanel();
		tabbedPane.addTab("Tabla de recibos", null, jpTablaDeRecibos, null);
		jpTablaDeRecibos.setLayout(new BorderLayout(0, 0));
		
		JScrollPane spTablaDeRecibos = new JScrollPane();
		spTablaDeRecibos.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		spTablaDeRecibos.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		jpTablaDeRecibos.add(spTablaDeRecibos, BorderLayout.CENTER);
		
		jtTablaDeRecibos = new JTable();
		jtTablaDeRecibos.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Numero de recibo", "Fecha de pago", "Numero de cuota", "Cuota", "Monto cancelado", "Interes", "Amortizacion", "Saldo restante"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, Double.class, Double.class, Double.class, Double.class, Double.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		jtTablaDeRecibos.getColumnModel().getColumn(0).setPreferredWidth(107);
		jtTablaDeRecibos.getColumnModel().getColumn(1).setPreferredWidth(110);
		jtTablaDeRecibos.getColumnModel().getColumn(2).setPreferredWidth(105);
		jtTablaDeRecibos.getColumnModel().getColumn(3).setPreferredWidth(130);
		jtTablaDeRecibos.getColumnModel().getColumn(4).setPreferredWidth(123);
		jtTablaDeRecibos.getColumnModel().getColumn(5).setPreferredWidth(140);
		jtTablaDeRecibos.getColumnModel().getColumn(6).setPreferredWidth(130);
		jtTablaDeRecibos.getColumnModel().getColumn(7).setPreferredWidth(200);
		spTablaDeRecibos.setViewportView(jtTablaDeRecibos);
		
		JPanel jpTablaDePagos = new JPanel();
		tabbedPane.addTab("Tabla de pagos", null, jpTablaDePagos, null);
		jpTablaDePagos.setLayout(new BorderLayout(0, 0));
		
		JScrollPane spTablaDePagos = new JScrollPane();
		jpTablaDePagos.add(spTablaDePagos, BorderLayout.CENTER);
		
		jtTablaDePagos = new JTable();
		jtTablaDePagos.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Numero de cuota", "Fecha de vencimiento", "Interes", "Amortizacion", "Cuota", "Saldo", "Cancelada"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, Double.class, Double.class, Double.class, Double.class, Boolean.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		jtTablaDePagos.getColumnModel().getColumn(0).setPreferredWidth(110);
		jtTablaDePagos.getColumnModel().getColumn(1).setPreferredWidth(130);
		jtTablaDePagos.getColumnModel().getColumn(1).setMinWidth(130);
		jtTablaDePagos.getColumnModel().getColumn(2).setPreferredWidth(130);
		jtTablaDePagos.getColumnModel().getColumn(3).setPreferredWidth(130);
		jtTablaDePagos.getColumnModel().getColumn(4).setPreferredWidth(130);
		jtTablaDePagos.getColumnModel().getColumn(5).setPreferredWidth(130);
		spTablaDePagos.setViewportView(jtTablaDePagos);
		
		JPanel jpBotonera = new JPanel();
		jpBotonera.setBounds(12, 327, 774, 44);
		panelConsultaCliente.add(jpBotonera);
		
		JButton btnNuevaConsulta = new JButton("Nueva Consulta");
		btnNuevaConsulta.setToolTipText("Busca un nuevo cliente por cedula");
		btnNuevaConsulta.addActionListener(this);
		jpBotonera.add(btnNuevaConsulta);
		
		btnRegresar = new JButton("Regresar");
		btnRegresar.setToolTipText("Retorna al menu principal");
		btnRegresar.addActionListener(this);
		jpBotonera.add(btnRegresar);
		
		btnEmitirRecibo = new JButton("Emitir recibo");
		btnEmitirRecibo.setToolTipText("Crea un recibo/factura");
		btnEmitirRecibo.addActionListener(this);
		jpBotonera.add(btnEmitirRecibo);
		
		btnImprimirTablas = new JButton("Imprimir Tablas");
		btnImprimirTablas.setToolTipText("Se imprimen las tablas de pago y de recibos");
		btnImprimirTablas.addActionListener(this);
		jpBotonera.add(btnImprimirTablas);
		
	}/*fin de genera ventana*/

	@Override
	public void actionPerformed(ActionEvent event) {
		
		
		if(event.getSource() == btnRegresar){
			jfPrincipal.QuitarPanel(panelConsultaCliente);
			panelConsultaCliente = null;
		}/*fin de evento regresar*/
		
	jfPrincipal.VentanaMain.repaint();/*actualizacion constante de la ventana*/
	}/*fin de actionPerformed*/
	
}/*fin de clase*/
