import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JTable;

public class interfazCliente extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfazCliente frame = new interfazCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public interfazCliente() {
		setTitle("Logistics  Interfaz cliente");
		setIconImage(Toolkit.getDefaultToolkit().getImage(interfazCliente.class.getResource("/imagen/LOGO.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 782, 524);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnVisualizarMisDatos = new JButton("Visualizar mis datos");
		btnVisualizarMisDatos.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnVisualizarMisDatos.setBounds(194, 151, 304, 41);
		contentPane.add(btnVisualizarMisDatos);
		
		JButton btnCambiarContrasena = new JButton("Cambiar contrasena");
		btnCambiarContrasena.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnCambiarContrasena.setBounds(194, 232, 304, 46);
		contentPane.add(btnCambiarContrasena);
		
		JButton btnVisualizarMisPedidos = new JButton("Visualizar mis pedidos ");
		btnVisualizarMisPedidos.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnVisualizarMisPedidos.setBounds(194, 68, 304, 46);
		contentPane.add(btnVisualizarMisPedidos);
		
		JButton btnBuscarPedidoPor = new JButton("Buscar pedido por idPedido");
		btnBuscarPedidoPor.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnBuscarPedidoPor.setBounds(194, 318, 304, 41);
		contentPane.add(btnBuscarPedidoPor);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setForeground(Color.RED);
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSalir.setBounds(580, 397, 130, 41);
		contentPane.add(btnSalir);
	}
}
