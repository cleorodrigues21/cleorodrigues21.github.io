package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import model.bean.passageiros;
import model.dao.passageirosdao;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class jfatulizarpassageiro extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textRG;
	private JTextField textCPF;
	private JTextField textEndereco;
	private JTextField textEmail;
	private JTextField textTelefone;
	private static int id;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jfatulizarpassageiro frame = new jfatulizarpassageiro(id);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param id2 
	 */
	public jfatulizarpassageiro(int id) {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				readJTable();
			}
		});
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		passageirosdao dao = new passageirosdao();
		passageiros f =  fdao.read(id);
		
		JLabel lblid = new JLabel("ID:");
		lblid.setBounds(322, 24, 46, 14);
		contentPane.add(lblid);
		
		JLabel lblNewLabel = new JLabel("Passageiro");
		lblNewLabel.setBounds(351, 24, 73, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblCadastrar_Passageiro = new JLabel("Atualizar Passageiro");
		lblCadastrar_Passageiro.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCadastrar_Passageiro.setBounds(18, 34, 205, 28);
		contentPane.add(lblCadastrar_Passageiro);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 73, 46, 14);
		contentPane.add(lblNome);
		
		textNome = new JTextField();
		textNome.setBounds(66, 72, 86, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		JLabel lblGenero = new JLabel("Genero:");
		lblGenero.setBounds(10, 100, 46, 14);
		contentPane.add(lblGenero);
		
		JLabel lblRG = new JLabel("RG:");
		lblRG.setBounds(10, 125, 46, 14);
		contentPane.add(lblRG);
		
		textRG = new JTextField();
		textRG.setBounds(66, 122, 86, 20);
		contentPane.add(textRG);
		textRG.setColumns(10);
		
		JLabel lblCPF = new JLabel("CPF:");
		lblCPF.setBounds(10, 154, 46, 14);
		contentPane.add(lblCPF);
		
		textCPF = new JTextField();
		textCPF.setBounds(66, 153, 86, 20);
		contentPane.add(textCPF);
		textCPF.setColumns(10);
		
		JLabel lblEndereco = new JLabel("Endereco:");
		lblEndereco.setBounds(215, 154, 86, 14);
		contentPane.add(lblEndereco);
		
		textEndereco = new JTextField();
		textEndereco.setBounds(276, 151, 86, 20);
		contentPane.add(textEndereco);
		textEndereco.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(215, 100, 46, 14);
		contentPane.add(lblEmail);
		
		textEmail = new JTextField();
		textEmail.setBounds(264, 97, 86, 20);
		contentPane.add(textEmail);
		textEmail.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(215, 73, 57, 14);
		contentPane.add(lblTelefone);
		
		textTelefone = new JTextField();
		textTelefone.setBounds(276, 70, 86, 20);
		contentPane.add(textTelefone);
		textTelefone.setColumns(10);
		
		JRadioButton rdbtnM = new JRadioButton("M");
		rdbtnM.setBounds(66, 99, 40, 23);
		contentPane.add(rdbtnM);
		
		JRadioButton rdbtnF = new JRadioButton("F");
		rdbtnF.setBounds(110, 99, 46, 23);
		contentPane.add(rdbtnF);
		
		lblid.setText(String.valueOf(f.getId_Passageiro()));
		textNome.setText(f.getNome());
		textRG.setText(f.getRg());
		textCPF.setText(f.getCpf());
		textEndereco.setText(f.getEndereco());
		textEmail.setText(f.getEmail());
		textTelefone.setText(f.getTelefone());
		if(f.isGenero() == true) {
			rdbtnM.setSelected(true);
		}else if (f.isGenero() == false) {
			rdbtnF.setSelected(true);
		}
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				passageiros f = new passageiros();
				passageirosdao dao = new passageirosdao();
				
				f.setId_Passageiro(Integer.parseInt(lblid.getText()));
				f.setNome(lblNome.getText());
				
				if(rdbtnM.isSelected()) {
					f.setGenero(false);
				}else if(rdbtnF.isSelected()) {
					f.setGenero(true);
				}
				f.setRg(lblRG.getText());
				f.setCpf(lblCPF.getText());
				f.setEndereco(lblEndereco.getText());
				f.setEmail(lblEmail.getText());
				f.setTelefone(lblTelefone.getText());
				
				
				dao.update(f);
				dispose();

			}
		});
		btnAlterar.setBounds(26, 211, 98, 23);
		contentPane.add(btnAlterar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLimpar.setBounds(134, 211, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancelar.setBounds(233, 211, 89, 23);
		contentPane.add(btnCancelar);
		
	}
}
