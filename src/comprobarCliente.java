import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class comprobarCliente extends JFrame {

	private JPanel contentPane;
	public static JTextField txtCuit;
	public usuario user1;
	public boolean irGenerarReserva;
	public comprobarCliente() throws InstantiationException, IllegalAccessException, SQLException {
		this.setLocationRelativeTo(null);
		setTitle("LOGISTICS- comprobar cliente");
		setIconImage(Toolkit.getDefaultToolkit().getImage(comprobarCliente.class.getResource("/imagen/LOGO.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 628);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIngreseElCuit = new JLabel("Ingrese el cuit/ cuil del cliente:");
		lblIngreseElCuit.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblIngreseElCuit.setBounds(56, 138, 408, 44);
		contentPane.add(lblIngreseElCuit);
		
		JLabel lblNoUtiliceGuines = new JLabel("No utilice guines ni espacios");
		lblNoUtiliceGuines.setBounds(548, 183, 242, 20);
		contentPane.add(lblNoUtiliceGuines);
		
		txtCuit = new JTextField();
		txtCuit.setFont(new Font("Tahoma", Font.BOLD, 19));
		txtCuit.setBounds(518, 144, 272, 37);
		contentPane.add(txtCuit);
		txtCuit.setColumns(10);
		posibilidadAgregarUsuario window4 = new posibilidadAgregarUsuario();
		final usuario cliente1= new usuario();
		final ventana3 window3 = new ventana3();
		final MyDataAcces conexion = new MyDataAcces();

		
		JButton btnAceptar = new JButton("ACEPTAR");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent args0) {
				
				try {
					 
					boolean encontrado =false;
					ResultSet resultado;
					resultado = conexion.GetQuery("Select * from cliente ");
					//resultado1 = conexion.GetQuery("Select * from persona");
					System.out.println(irGenerarReserva);
					while(encontrado ==false && resultado.next() ){
						persona person1= new persona();
						System.out.println("nombre2");//borrar
						
						System.out.println("nombre3");//borrar
						if(txtCuit.getText().equals(resultado.getString("nroCui"))){
							System.out.println("prueba 222");//borrar
								if(irGenerarReserva == true){
									window3.setVisible(true);
									encontrado=true;
									dispose();
								}else{
									informacionCliente window5= new informacionCliente(txtCuit.getText());
									
									System.out.println("prueba 3 3 3");//borrar
									window5.setUser(user1);
									
									window5.setVisible(true);
									encontrado=true;
									dispose();
								}
						}
					}
					System.out.println(encontrado);
					if(encontrado == false){
						JOptionPane.showMessageDialog(null, "Este usuario no existe en el sistema");
						window4.setVisible(true);
						dispose();
					}
				} catch (SQLException | InstantiationException | IllegalAccessException e) {
					System.out.println(e.getMessage());
					
					
				}
			
					
			}
		});
		btnAceptar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnAceptar.setBounds(375, 321, 175, 29);
		contentPane.add(btnAceptar);
		JButton btnVolverAlMenu = new JButton("VOLVER AL MENU");
		btnVolverAlMenu.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnVolverAlMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent args0) {
				dispose();
			}
		});
		btnVolverAlMenu.setBounds(641, 495, 212, 29);
		contentPane.add(btnVolverAlMenu);
	}

	public usuario getUser1() {
		return user1;
	}

	public void setUser1(usuario user1) {
		this.user1 = user1;
	}

	public boolean isIrGenerarReserva() {
		return irGenerarReserva;
	}

	public void setIrGenerarReserva(boolean irGenerarReserva) {
		this.irGenerarReserva = irGenerarReserva;
	}


}
