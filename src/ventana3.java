
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ventana3 extends JFrame {
	private ButtonGroup botones = new ButtonGroup();
	private JPanel contentPane;
	private JTextField txtPesoCarga;
	private JTextField txtDireccion;
	private JTextField txtCiudadOrigen;
	private JTextField txtAlturaOrigen;
	private JTextField txtCpOrigen;
	private JTextField txtComentarioOrigen;
	private JTextField txtDireccionDestino;
	private JTextField txtCiudadDestino;
	private JTextField txtProvinciaDestino;
	private JTextField txtAlturaDestino;
	private JTextField txtCpDestino;
	private JTextField txtComentarioDestino;



	public ventana3() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ventana3.class.getResource("/imagen/LOGO.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1173, 961);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JComboBox txtTipoCarga = new JComboBox();
		txtTipoCarga.setModel(new DefaultComboBoxModel(new String[] {"Granos", "Liquidos", "Contenedores"}));
		txtTipoCarga.setBounds(195, 86, 170, 26);
		contentPane.add(txtTipoCarga);
		
		JLabel nada = new JLabel("Tipo de carga");
		nada.setBounds(34, 89, 146, 20);
		contentPane.add(nada);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(15, 40, 54, -1);
		contentPane.add(lblNewLabel);
		
		JLabel lblCuit = new JLabel("CUIT/CUIL");
		lblCuit.setBounds(34, 43, 105, 20);
		contentPane.add(lblCuit);
		
		JLabel lblPesoCarga = new JLabel("Peso carga");
		lblPesoCarga.setBounds(37, 136, 111, 20);
		contentPane.add(lblPesoCarga);
		
		txtPesoCarga = new JTextField();
		txtPesoCarga.setBounds(195, 133, 170, 26);
		contentPane.add(txtPesoCarga);
		txtPesoCarga.setColumns(10);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSalir.setBounds(806, 814, 115, 29);
		contentPane.add(btnSalir);
		
	
		
		JLabel lblCustodiaSatelital = new JLabel("Custodia satelital");
		lblCustodiaSatelital.setBounds(37, 198, 143, 20);
		contentPane.add(lblCustodiaSatelital);
		
		final JRadioButton rdbtnSi = new JRadioButton("SI");
		rdbtnSi.setBounds(195, 194, 69, 29);
		contentPane.add(rdbtnSi);
		
		final JRadioButton rdbtnNo = new JRadioButton("NO");
		rdbtnNo.setBounds(295, 194, 155, 29);
		contentPane.add(rdbtnNo);
		botones.add(rdbtnNo);
		botones.add(rdbtnSi);
		JLabel lblPaisDestino = new JLabel("Altura:");
		lblPaisDestino.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPaisDestino.setBounds(437, 271, 127, 20);
		contentPane.add(lblPaisDestino);
		
		
		
		JComboBox txtPaisDestino = new JComboBox();
		txtPaisDestino.setModel(new DefaultComboBoxModel(new String[] {"ARGENTINA", "BRASIL", "URUGUAY", "CHILE", "PARAGUAY"}));
		txtPaisDestino.setBounds(151, 489, 170, 26);
		contentPane.add(txtPaisDestino);
		
		JLabel lblDireccionOrigen = new JLabel("Informacion origen");
		lblDireccionOrigen.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDireccionOrigen.setBounds(250, 235, 278, 20);
		contentPane.add(lblDireccionOrigen);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDireccion.setBounds(34, 277, 163, 20);
		contentPane.add(lblDireccion);
		
		JLabel lblCiudad = new JLabel("Ciudad:");
		lblCiudad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCiudad.setBounds(44, 325, 163, 20);
		contentPane.add(lblCiudad);
		
		JLabel lblCodigoPostal = new JLabel("Codigo postal:");
		lblCodigoPostal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCodigoPostal.setBounds(409, 328, 143, 20);
		contentPane.add(lblCodigoPostal);
		
		JLabel lblProvincia = new JLabel("Provincia:");
		lblProvincia.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblProvincia.setBounds(29, 364, 88, 20);
		contentPane.add(lblProvincia);
		
		txtDireccion = new JTextField();
		txtDireccion.setBounds(151, 274, 146, 26);
		contentPane.add(txtDireccion);
		txtDireccion.setColumns(10);
		
		txtCiudadOrigen = new JTextField();
		txtCiudadOrigen.setBounds(151, 322, 146, 26);
		contentPane.add(txtCiudadOrigen);
		txtCiudadOrigen.setColumns(10);
		
		txtAlturaOrigen = new JTextField();
		txtAlturaOrigen.setBounds(567, 269, 146, 26);
		contentPane.add(txtAlturaOrigen);
		txtAlturaOrigen.setColumns(10);
		
		txtCpOrigen = new JTextField();
		txtCpOrigen.setBounds(567, 322, 146, 26);
		contentPane.add(txtCpOrigen);
		txtCpOrigen.setColumns(10);
		
		txtComentarioOrigen = new JTextField();
		txtComentarioOrigen.setBounds(567, 361, 146, 26);
		contentPane.add(txtComentarioOrigen);
		txtComentarioOrigen.setColumns(10);
		
		JLabel lblComentarioAdicional = new JLabel("Comentario adicional:");
		lblComentarioAdicional.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblComentarioAdicional.setBounds(372, 364, 180, 20);
		contentPane.add(lblComentarioAdicional);
		
		JLabel lblInformacionDestino = new JLabel("Informacion destino");
		lblInformacionDestino.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblInformacionDestino.setBounds(340, 453, 278, 20);
		contentPane.add(lblInformacionDestino);
		
		JLabel lblPais = new JLabel("Pais:");
		lblPais.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPais.setBounds(48, 492, 69, 20);
		contentPane.add(lblPais);
		
		JLabel label = new JLabel("Direccion:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label.setBounds(34, 543, 163, 20);
		contentPane.add(label);
		
		txtDireccionDestino = new JTextField();
		txtDireccionDestino.setColumns(10);
		txtDireccionDestino.setBounds(161, 540, 146, 26);
		contentPane.add(txtDireccionDestino);
		
		txtCiudadDestino = new JTextField();
		txtCiudadDestino.setColumns(10);
		txtCiudadDestino.setBounds(161, 593, 146, 26);
		contentPane.add(txtCiudadDestino);
		
		txtProvinciaDestino = new JTextField();
		txtProvinciaDestino.setColumns(10);
		txtProvinciaDestino.setBounds(161, 647, 146, 26);
		contentPane.add(txtProvinciaDestino);
		
		JLabel label_1 = new JLabel("Ciudad:");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_1.setBounds(34, 596, 163, 20);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Provincia:");
		label_2.setBounds(34, 650, 105, 20);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Altura:");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_3.setBounds(437, 543, 127, 20);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("Codigo postal:");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_4.setBounds(409, 596, 143, 20);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("Comentario adicional:");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_5.setBounds(394, 650, 180, 20);
		contentPane.add(label_5);
		
		txtAlturaDestino = new JTextField();
		txtAlturaDestino.setColumns(10);
		txtAlturaDestino.setBounds(567, 540, 146, 26);
		contentPane.add(txtAlturaDestino);
		
		txtCpDestino = new JTextField();
		txtCpDestino.setColumns(10);
		txtCpDestino.setBounds(567, 593, 146, 26);
		contentPane.add(txtCpDestino);
		
		txtComentarioDestino = new JTextField();
		txtComentarioDestino.setColumns(10);
		txtComentarioDestino.setBounds(567, 647, 146, 26);
		contentPane.add(txtComentarioDestino);
		
		JComboBox txtProvinciaOrigen = new JComboBox();
		txtProvinciaOrigen.setModel(new DefaultComboBoxModel(new String[] {"Buenos Aires", "Catamarca", "Chaco", "Chubut", "C\u00F3rdoba", "Corrientes", "Entre R\u00EDos", "Formosa", "Jujuy", "La Pampa", "La Rioja", "Mendoza", "Misiones", "Neuqu\u00E9n", "R\u00EDo Negro", "Salta", "San Juan", "San Luis", "Santa Cruz", "Santa Fe", "Santiago del Estero", "Tierra del Fuego", "Tucum\u00E1n"}));
		txtProvinciaOrigen.setBounds(161, 364, 136, 26);
		contentPane.add(txtProvinciaOrigen);
		JButton btnEnviar = new JButton("ENVIAR");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean custodia;
				double pesoCarga;
				int origenAltura;
				String origenDireccion;
				String origenCiudad;
				int origenCP;
				String tipoCarga;
				
				tipoCarga = (String) txtTipoCarga.getSelectedItem();
				System.out.println("hola    "+tipoCarga);
				origenAltura = Integer.parseInt(txtAlturaOrigen.getText());
				pesoCarga = Double.parseDouble(txtPesoCarga.getText());
				System.out.println(pesoCarga);
				if(rdbtnSi.isSelected()){
					custodia = true;
					System.out.println(custodia);
				}else{
					custodia = false;
				}
				
				
				
				
				
			}
		});
		btnEnviar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnEnviar.setBounds(201, 814, 115, 29);
		contentPane.add(btnEnviar);
		
	}
	
}
