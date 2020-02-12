

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.Toolkit;

public class altaCliente extends JFrame {

	private JPanel contentPane;
	public JTextField txtRazonSocial;
	public  JTextField txtCui;
	public  JTextField txtTelefono;
	public  JTextField txtDireccion;
	public  JTextField txtAltura;
	public  JTextField txtcP;
	public  JTextField txtCiudad;
	public  JTextField txtEmail;


	public altaCliente() {
		setFont(new Font("Arial Unicode MS", Font.PLAIN, 17));
		setIconImage(Toolkit.getDefaultToolkit().getImage(altaCliente.class.getResource("/imagen/LOGO.png")));
		setTitle("LOGISTICS");
		setIconImage(Toolkit.getDefaultToolkit().getImage(altaCliente.class.getResource("/imagen/LOGO.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 803, 520);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Razon social:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel.setBounds(32, 76, 153, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblCuitcuil = new JLabel("Cuit/Cuil: ");
		lblCuitcuil.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblCuitcuil.setBounds(32, 112, 98, 20);
		contentPane.add(lblCuitcuil);
		
		JLabel lblSituacionTributaria = new JLabel("Condicion fiscal:");
		lblSituacionTributaria.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSituacionTributaria.setBounds(32, 148, 153, 20);
		contentPane.add(lblSituacionTributaria);
		
		txtRazonSocial = new JTextField();
		txtRazonSocial.setBounds(187, 74, 146, 26);
		contentPane.add(txtRazonSocial);
		txtRazonSocial.setColumns(10);
		
		txtCui = new JTextField();
		txtCui.setBounds(187, 111, 146, 26);
		contentPane.add(txtCui);
		txtCui.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTelefono.setBounds(420, 113, 140, 20);
		contentPane.add(lblTelefono);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(547, 111, 146, 26);
		contentPane.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		txtDireccion = new JTextField();
		txtDireccion.setBounds(187, 237, 146, 26);
		contentPane.add(txtDireccion);
		txtDireccion.setColumns(10);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(547, 237, 146, 26);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);
		
		txtcP = new JTextField();
		txtcP.setBounds(547, 286, 146, 26);
		contentPane.add(txtcP);
		txtcP.setColumns(10);
		
		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAltura.setBounds(420, 240, 69, 20);
		contentPane.add(lblAltura);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDireccion.setBounds(32, 240, 98, 20);
		contentPane.add(lblDireccion);
		
		JLabel lblProvincia = new JLabel("Provincia:");
		lblProvincia.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblProvincia.setBounds(32, 289, 123, 20);
		contentPane.add(lblProvincia);
		
		txtCiudad = new JTextField();
		txtCiudad.setBounds(187, 328, 146, 26);
		contentPane.add(txtCiudad);
		txtCiudad.setColumns(10);
		
		JLabel lblCiudad = new JLabel("Ciudad:");
		lblCiudad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCiudad.setBounds(32, 334, 69, 20);
		contentPane.add(lblCiudad);
		
		JLabel lblCodigoPostal = new JLabel("Codigo postal:");
		lblCodigoPostal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCodigoPostal.setBounds(420, 292, 140, 20);
		contentPane.add(lblCodigoPostal);
		
		JButton btnAceptar = new JButton("ACEPTAR");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String razonSocial = txtRazonSocial.getText();
				
			}
		});
		btnAceptar.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAceptar.setBounds(161, 397, 158, 29);
		contentPane.add(btnAceptar);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(486, 397, 163, 29);
		contentPane.add(btnCancelar);
		
		JComboBox txtCondicionFiscal = new JComboBox();
		txtCondicionFiscal.setModel(new DefaultComboBoxModel(new String[] {"monotributista", "consumidor final", "responsable inscripto"}));
		txtCondicionFiscal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtCondicionFiscal.setBounds(187, 146, 146, 26);
		contentPane.add(txtCondicionFiscal);
		
		JLabel lblPais = new JLabel("Pais:");
		lblPais.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPais.setBounds(420, 334, 69, 20);
		contentPane.add(lblPais);
		
		JComboBox txtProvincia = new JComboBox();
		txtProvincia.setModel(new DefaultComboBoxModel(new String[] {"Buenos Aires", "Catamarca", "Chaco", "Chubut", "C\u00F3rdoba", "Corrientes", "Entre R\u00EDos", "Formosa", "Jujuy", "La Pampa", "La Rioja", "Mendoza", "Misiones", "Neuqu\u00E9n", "R\u00EDo Negro", "Salta"}));
		txtProvincia.setBounds(187, 286, 146, 26);
		contentPane.add(txtProvincia);
		
		JComboBox txtPais = new JComboBox();
		txtPais.setModel(new DefaultComboBoxModel(new String[] {"ARGENTINA", "BRASIL", "BOLIVIA", "CHILE", "URUGUAY PARAGAY"}));
		txtPais.setBounds(547, 328, 146, 26);
		contentPane.add(txtPais);
		
		JLabel lblCorreoElectronico = new JLabel("Email:");
		lblCorreoElectronico.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCorreoElectronico.setBounds(436, 77, 106, 20);
		contentPane.add(lblCorreoElectronico);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(547, 75, 146, 26);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblDomicilioPrincipal = new JLabel("domicilio principal");
		lblDomicilioPrincipal.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDomicilioPrincipal.setBounds(284, 201, 187, 20);
		contentPane.add(lblDomicilioPrincipal);
		
		JLabel lblInformacionObligatoria = new JLabel("Informacion Obligatoria");
		lblInformacionObligatoria.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblInformacionObligatoria.setBounds(256, 38, 263, 20);
		contentPane.add(lblInformacionObligatoria);
	}
}
