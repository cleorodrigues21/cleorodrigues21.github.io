package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.bean.passageiros;
import model.dao.passageirosdao;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class jfListarpassageiros extends JFrame {

	private JPanel contentPane;
	private JTable jtpassageiros;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jfListarpassageiros frame = new jfListarpassageiros();
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
	public jfListarpassageiros() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 661, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Listar Passageiros");
		lblNewLabel.setBounds(156, 10, 122, 18);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 15));
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(26, 62, 592, 160);
		contentPane.add(scrollPane);
		
		jtpassageiros = new JTable();
		jtpassageiros.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Id_Passageiro", "Nome", "Genero", "RG", "CPF", "Enderec", "Email", "Telefone"
			}
		));
		jtpassageiros.getColumnModel().getColumn(0).setPreferredWidth(96);
		scrollPane.setViewportView(jtpassageiros);
		
		JButton btnNewButton = new JButton("Cadastrar Passageiro");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(54, 238, 165, 23);
		contentPane.add(btnNewButton);
		
		JButton btnAlterar = new JButton("Alterar Passageiro");
		btnAlterar.addActionListener(new ActionListener);
		
		public void actionPerformed(ActionEvente arg0) {
			
			if(jfpassageiros.getSelectRow()!= -1) {
			jfatualizarpassageiro af = new jfatulizarpassageiro((int jfpassageiro.getvalue(jfpassageiro.getSelectRow(), 0)));	
			af.setVisible(true);
			}else {
				JOptionPane.showMessageDialog(null, "Selecione um passageiro");
			}
			
			readJTable();
		}
		
		
		JButton btnNewButton_2 = new JButton("Excluir Passageiro");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jtpassageiros.getSelectedRow() != -1) {
						int opcao = JOptionPane.showConfirmDialog(null,"Deseja excluir o passageiro selecionado?","Exclusão", JOptionPane.YES_NO_OPTION);
						if(opcao == 0) {
							passageirosdao dao = new passageirosdao();
							passageiros f = new passageiros();
							f.setId_Passageiro(opcao);jtpassageiros.getValueAt(jtpassageiros.getSelectedRow(), 0);
							dao.delete(f);
						}
				}else {
					JOptionPane.showMessageDialog(null, "Selecione um passageiro");
				}
				readJTable();
			}
			});
		btnNewButton_2.setBounds(390, 238, 151, 23);
		contentPane.add(btnNewButton_2);
		
		readJTable();
	}
	public void readJTable() {
	 DefaultTableModel modelo = (DefaultTableModel) jtpassageiros.getModel();	
	modelo.setNumRows(0);
	passageirosdao fdao = new passageirosdao();
	for(passageiros f: fdao.read()) {
		modelo.addRow(new Object [] {
				f.getId_Passageiro(),
				f.getNome(),
				f.getGenero(),
				f.getRg(),
				f.getCpf(),
				f.getEndereco(),
				f.getEmail(),
				f.getTelefone()	
		});
	}
	}
	
}
