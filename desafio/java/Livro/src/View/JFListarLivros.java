package View;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Model.bean.Livro;
import Model.dao.LivroDAO;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JFListarLivros extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable TableLivro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFListarLivros frame = new JFListarLivros();
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
	public JFListarLivros() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				readTablelivro();
			}
		});
		setTitle("Listar Livros");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblListarLivros = new JLabel("Listar Livros");
		lblListarLivros.setBounds(37, 24, 177, 14);
		contentPane.add(lblListarLivros);
		
		TableLivro = new JTable();
		TableLivro.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Id Livro", "Titulo", "Autor", "Editora", "Edi\u00E7\u00E3o", "Ano", "Valor", "Estoque"
			}
		));
		TableLivro.setBounds(50, 76, 322, 116);
		contentPane.add(TableLivro);
		
		JButton btnCadastrarL = new JButton("Cadastrar Livro");
		btnCadastrarL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastrarLivro cl = new CadastrarLivro();
				cl.setVisible(true);
			}
		});
		btnCadastrarL.setBounds(10, 227, 149, 23);
		contentPane.add(btnCadastrarL);
		
		JButton btnAlterar = new JButton("Alterar Livro");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(TableLivro.getSelectedRow()!= -1) {
				JFAtualizarLivro al = new JFAtualizarLivro((int) TableLivro.getValueAt(TableLivro.getSelectedRow(),0));
				al.setVisible(true);
				
			}else {
				JOptionPane.showMessageDialog(null, "Selecione Livro");	
			}
			readTablelivro();
			}
		});
		btnAlterar.setBounds(169, 227, 124, 23);
		contentPane.add(btnAlterar);
		
		JButton btnExcluir = new JButton("Excluir Livro");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(TableLivro.getSelectedRow()!= -1) {
					
				
				int opcao = JOptionPane.showConfirmDialog(null,"Deseja Excluir o filme selecionado?", "Exclusão", JOptionPane.YES_NO_OPTION);
			if(opcao == 0) {
				LivroDAO dao = new LivroDAO();
				Livro l = new Livro();
				l.setIdLivro((int)TableLivro.getValueAt(TableLivro.getSelectedRow(), 0));
				dao.delete(l);
			}
			}else {
				JOptionPane.showMessageDialog(null, "Selecione um Livro!");
				
			}
				readTablelivro();
			}
		});
		btnExcluir.setBounds(300, 227, 89, 23);
		contentPane.add(btnExcluir);
		
		readTablelivro();
		
	}
	
	public void readTablelivro() {
		DefaultTableModel modelo = (DefaultTableModel) TableLivro.getModel();
		modelo.setNumRows(0);
		LivroDAO ldao = new LivroDAO();
		
		for(Livro l : ldao.read()) {
			modelo.addRow(new Object[] {
			l.getIdLivro(),
			l.getTítulo(),
			l.getAutor(),
			l.getEditora(),
			l.getEdição(),
			l.getAno(),
			l.getValor(),
			l.isEstoque()
			});
		}
			
	}
}
