package View;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Model.bean.Livro;
import Model.dao.LivroDAO;

public class JFAtualizarLivro extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTitulo;
	private JTextField txtAutor;
	private JTextField txtEditora;
	protected ButtonGroup estoque = null;
	private static int id;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFAtualizarLivro frame = new JFAtualizarLivro(id);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param id 
	 */
	public JFAtualizarLivro(int id) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		LivroDAO ldao = new LivroDAO();
		Livro l = ldao.read(id);
		
		JLabel lblid = new JLabel("ID Livro:");
		lblid.setBounds(322, 11, 46, 14);
		contentPane.add(lblid);
		
		JLabel lblId = new JLabel("New label");
		lblId.setBounds(378, 11, 46, 14);
		contentPane.add(lblId);
		
		JLabel lblAtualizarlivro = new JLabel("Atulizar Livro");
		lblAtualizarlivro.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAtualizarlivro.setBounds(27, 26, 113, 14);
		contentPane.add(lblAtualizarlivro);
		
		JLabel lblTitulo = new JLabel("T\u00EDtulo:");
		lblTitulo.setBounds(27, 64, 54, 14);
		contentPane.add(lblTitulo);
		
		txtTitulo = new JTextField();
		txtTitulo.setBounds(27, 77, 139, 20);
		contentPane.add(txtTitulo);
		txtTitulo.setColumns(10);
		
		JLabel lblAutor = new JLabel("Autor:");
		lblAutor.setBounds(27, 105, 46, 14);
		contentPane.add(lblAutor);
		
		txtAutor = new JTextField();
		txtAutor.setBounds(27, 117, 139, 20);
		contentPane.add(txtAutor);
		txtAutor.setColumns(10);
		
		JLabel lblEditora = new JLabel("Editora:");
		lblEditora.setBounds(27, 148, 46, 14);
		contentPane.add(lblEditora);
		
		JLabel lblEdicao = new JLabel("Edi\u00E7\u00E3o:");
		lblEdicao.setBounds(27, 186, 46, 14);
		contentPane.add(lblEdicao);
		
		txtEditora = new JTextField();
		txtEditora.setBounds(27, 162, 139, 20);
		contentPane.add(txtEditora);
		txtEditora.setColumns(10);
		
		JLabel lblAno = new JLabel("Ano:");
		lblAno.setBounds(208, 64, 46, 14);
		contentPane.add(lblAno);
		
		JLabel lblValor = new JLabel("Valor:");
		lblValor.setBounds(208, 105, 46, 14);
		contentPane.add(lblValor);
		
		JLabel lblEstoque = new JLabel("Em Estoque:");
		lblEstoque.setBounds(208, 148, 70, 14);
		contentPane.add(lblEstoque);
		
		JRadioButton rdbtnSim = new JRadioButton("SIM");
		rdbtnSim.setBounds(208, 161, 109, 23);
		contentPane.add(rdbtnSim);
		
		JRadioButton rdbtnNao = new JRadioButton("NAO");
		rdbtnNao.setBounds(208, 182, 109, 23);
		contentPane.add(rdbtnNao);
		
		JSpinner spEdi��o = new JSpinner();
		spEdi��o.setBounds(27, 204, 54, 20);
		contentPane.add(spEdi��o);
		
		JSpinner spAno = new JSpinner();
		spAno.setBounds(208, 77, 70, 20);
		contentPane.add(spAno);
		
		JSpinner spValor = new JSpinner();
		spValor.setBounds(208, 117, 70, 20);
		contentPane.add(spValor);
		ButtonGroup funcao = new ButtonGroup();
		funcao.add(rdbtnSim);
		funcao.add(rdbtnNao);
		
		lblId.setText(String.valueOf(l.getIdLivro()));
		txtTitulo.setText(l.getT�tulo());
		txtAutor.setText(l.getAutor());
		txtEditora.setText(l.getEditora());
		spEdi��o.setValue(l.getEdi��o());
		spAno.setValue(l.getAno());
		spValor.setValue(l.getValor());
		if(l.isEstoque() == true) {
			rdbtnSim.setSelected(true);
		}else if(l.isEstoque() == false) {
			rdbtnNao.setSelected(true);
		}
		
		
		
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Livro l = new Livro();
				LivroDAO dao = new LivroDAO();
				
				l.setIdLivro(Integer.parseInt(lblId.getText()));
				l.setT�tulo(txtTitulo.getText());
				l.setAutor(txtAutor.getText());
				l.setEditora(txtEditora.getText());
				l.setEdi��o(Integer.parseInt(spEdi��o.getValue().toString()));
				l.setAno(Integer.parseInt(spAno.getValue().toString()));
				l.setValor(Integer.parseInt(spValor.getValue().toString()));
				if(rdbtnSim.isSelected()) {
					l.setEstoque(true);
				}else if (rdbtnNao.isSelected()) {
					l.setEstoque(false);
				}
				
				dao.update(l);
				dispose();
			}	
		});
		btnAlterar.setBounds(10, 235, 106, 23);
		contentPane.add(btnAlterar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtTitulo.setText(null);
				txtAutor.setText(null);
				txtEditora.setText(null);
				spEdi��o.setValue(0);
				spAno.setValue(0);
				spValor.setValue(0);
				estoque.clearSelection();
			}
		});
		btnLimpar.setBounds(126, 235, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(228, 235, 89, 23);
		contentPane.add(btnCancelar);
	}

}
