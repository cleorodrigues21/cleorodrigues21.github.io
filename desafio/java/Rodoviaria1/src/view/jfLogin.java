package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class jfLogin extends JFrame {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jfLogin frame = new jfLogin();
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
	public jfLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Usuario = new JLabel("Usuario:");
		Usuario.setBounds(56, 125, 71, 14);
		contentPane.add(Usuario);
		
		JLabel Password = new JLabel("Password:");
		Password.setBounds(56, 150, 71, 14);
		contentPane.add(Password);
		
		JButton Acessar = new JButton("Acessar");
		Acessar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Acessar.setBounds(38, 197, 89, 23);
		contentPane.add(Acessar);
		
		JButton Cancelar = new JButton("Cancelar");
		Cancelar.setBounds(137, 197, 89, 23);
		contentPane.add(Cancelar);
		
		JButton Cadastrar_se = new JButton("Cadastrar-se");
		Cadastrar_se.setBounds(38, 231, 124, 23);
		contentPane.add(Cadastrar_se);
		
		JButton Recuperar_Senha = new JButton("Recuperar Senha");
		Recuperar_Senha.setBounds(174, 231, 151, 23);
		contentPane.add(Recuperar_Senha);
		
		textField = new JTextField();
		textField.setBounds(120, 122, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(120, 147, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel bvr = new JLabel("Bem Vindo - Rodoviaria");
		bvr.setFont(new Font("Arial", Font.PLAIN, 16));
		bvr.setBounds(87, 28, 216, 14);
		contentPane.add(bvr);
		
		JLabel ica = new JLabel("Informe suas credenciais abaixo:");
		ica.setBounds(56, 84, 187, 14);
		contentPane.add(ica);
	}
}
