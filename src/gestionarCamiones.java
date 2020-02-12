import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class gestionarCamiones extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gestionarCamiones frame = new gestionarCamiones();
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
	public gestionarCamiones() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(gestionarCamiones.class.getResource("/imagen/LOGO.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 599, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Seleccione la opcion deseada");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(136, 66, 340, 20);
		contentPane.add(lblNewLabel);
		final altaCamion altaCamionn = new altaCamion();
		JButton btnAgregarNuevoCamion = new JButton("Agregar nuevo camion");
		btnAgregarNuevoCamion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				altaCamionn.setVisible(true);
			}
		});
		btnAgregarNuevoCamion.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnAgregarNuevoCamion.setBounds(136, 123, 315, 46);
		contentPane.add(btnAgregarNuevoCamion);
		
		final visualizarCamion visualizarCamionn = new visualizarCamion();
		JButton btnNewButton = new JButton("Consultar camion existente");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				visualizarCamionn.setVisible(true);
			}
		});
		btnNewButton.setBounds(136, 185, 315, 46);
		contentPane.add(btnNewButton);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnVolver.setBounds(447, 314, 115, 29);
		contentPane.add(btnVolver);
	}

}
