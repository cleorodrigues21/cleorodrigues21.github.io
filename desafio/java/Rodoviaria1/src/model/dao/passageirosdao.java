package model.dao;

	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.ArrayList;
	import java.util.List;

	import javax.swing.JOptionPane;

	import connection.connectionfactory;
	import model.bean.passageiros;
	
public class passageirosdao {

		public void create(passageiros f) {
			Connection con = connectionfactory.getConnection(); 
			PreparedStatement stmt = null;
			
			try {
				stmt = con.prepareStatement("INSERT INTO passageiro (Nome, Genero, Rg, Cpf, Endereco, Email, Telefone) VALUES (?, ?, ?, ?, ?, ?, ?)");
				stmt.setString(1, f.getNome());
				stmt.setBoolean(2, f.getGenero());
				stmt.setString(3, f.getRg());
				stmt.setString(4, f.getCpf());
				stmt.setString(5, f.getEndereco());
				stmt.setString(6, f.getEmail());
				stmt.setString(7, f.getTelefone());
				
				stmt.executeUpdate();
				JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
			}
			catch (SQLException e) {
				JOptionPane.showMessageDialog(null, "Erro ao salvar" + e);
			}
			
			finally {
				connectionfactory.closeConnection(con, stmt);
			}
		}
			
		public List<passageiros> read() {
			
			Connection con = connectionfactory.getConnection();
			PreparedStatement stmt = null;
			ResultSet rs = null;
			List<passageiros> passageiros = new ArrayList<>();
			
			try {
				stmt = con.prepareStatement("SELECT * FROM  passageiro");
				rs = stmt.executeQuery();
				
				while(rs.next()) {
					passageiros f = new passageiros();
					f.setId_Passageiro(rs.getInt("Id_Passageiro"));
					f.setNome(rs.getString("Nome"));
					f.setGenero(rs.getBoolean("Genero"));
					f.setRg(rs.getString("Rg"));
					f.setCpf(rs.getString("Cpf"));
					f.setEndereco(rs.getString("Endereo"));
					f.setEmail(rs.getString("Email"));
					f.setTelefone(rs.getString("Telefone"));
					passageiros.add(f);
				}
				
			}
			
			catch (SQLException e) {
				JOptionPane.showMessageDialog(null, "Erro ao exibir as informaes do BD" + e);
				e.printStackTrace();
			}
			
			finally {
				connectionfactory.closeConnection(con, stmt, rs);
			}
			
			return passageiros;
		}
		
		public void delete(passageiros f) {
			
			Connection con = connectionfactory.getConnection();
			PreparedStatement stmt = null;
			
			try {
				stmt = con.prepareStatement("DELETE  FROM passageiro WHERE Id_Passageiro=?");
				stmt.setInt(1, f.getId_Passageiro()); 
				stmt.executeUpdate();
				
				JOptionPane.showMessageDialog(null, "Passageiro excuido com sucesso!");
			}
			
			catch (SQLException e){			
				JOptionPane.showMessageDialog(null, "Erro ao excluir: "+ e);
			}
			
			finally {
				connectionfactory.closeConnection(con, stmt);
			}
			
		}
		
		
		public passageiros read(int id) {
			
			Connection con = connectionfactory.getConnection();
			PreparedStatement stmt = null;
			ResultSet rs = null;
			passageiros f = new passageiros();
			
			try {
				stmt = con.prepareStatement("SELECT * FROM passageiro WHERE Id_Passageiro=? LIMIT 1;");
				stmt.setInt(1, id);
				rs = stmt.executeQuery();
				
				if(rs != null && rs.next()) {   
					f.setId_Passageiro(rs.getInt("Id_Passageiro"));
					f.setNome(rs.getString("Nome"));
					f.setGenero(rs.getBoolean("Genero"));
					f.setRg(rs.getString("Rg"));
					f.setCpf(rs.getString("Cpf"));
					f.setEndereco(rs.getString("Endereco"));
					f.setEmail(rs.getString("Email"));
					f.setTelefone(rs.getString("Telefone"));
				}
			}
			
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			finally {
				connectionfactory.closeConnection(con, stmt, rs);
			}
			return f;
		}
		
		public void update(passageiros f) {
			
			Connection con = connectionfactory.getConnection(); 
			PreparedStatement stmt = null;
			
			try {
				stmt = con.prepareStatement("UPDATE passageiro SET Nome=?, Genero=?, Rg=?, Cpf=?, Endereco=?, Email=?, Telefone=? WHERE Id_Passageiro=?;");
				stmt.setString(1, f.getNome());
				stmt.setBoolean(2, f.getGenero());
				stmt.setString(3, f.getRg());
				stmt.setString(4, f.getCpf());
				stmt.setString(5, f.getEndereco());
				stmt.setString(6, f.getEmail());
				stmt.setString(7, f.getTelefone());
				stmt.setInt(8, f.getId_Passageiro());
				
				stmt.executeUpdate();
				JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
			}
			
			catch (SQLException e) {
				JOptionPane.showMessageDialog(null, "Erro ao alterar" + e);
			} 
			
			finally {
				connectionfactory.closeConnection(con, stmt);
			}
		}	
}