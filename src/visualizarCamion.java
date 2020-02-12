
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JButton;

public class visualizarCamion extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
	}

	/**
	 * Create the frame.
	 */
	public visualizarCamion() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(visualizarCamion.class.getResource("/imagen/LOGO.png")));
		setTitle("LOGISTICS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 598, 392);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese la PATENTE del camion:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(97, 60, 342, 20);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(197, 113, 146, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("BUSCAR");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(197, 179, 134, 26);
		contentPane.add(btnNewButton);
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnVolver.setBounds(446, 291, 115, 29);
		contentPane.add(btnVolver);
	}

}
