package Model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Connection.ConnectionFactory;
import Model.bean.Livro;

public class LivroDAO {
	
	public void create(Livro l) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		try {
			stmt = con.prepareStatement("INSERT INTO livro (titulo, autor,	editora, edição, ano, valor, estoque) VALUES (?, ?, ?, ?, ?, ?, ?)");
			stmt.setString(1, l.getTítulo());
			stmt.setString(2, l.getAutor());
			stmt.setString(3, l.getEditora());
			stmt.setInt(4, l.getEdição());
			stmt.setInt(5, l.getAno());
			stmt.setDouble(6, l.getValor());
			stmt.setBoolean(7, l.isEstoque());
			
			stmt.executeUpdate();
			JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
		} 
		catch(SQLException e) {
			JOptionPane.showMessageDialog(null, "erro ao salvar" + e);
		}
		
		finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
	}
	
	public List<Livro> read(){
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		List<Livro> livro = new ArrayList<>();
		try {
				stmt = con.prepareStatement("SELECT *FROM livro");
				rs = stmt.executeQuery();
				
				while(rs.next()) {
					Livro l = new Livro();
					l.setIdLivro(rs.getInt("Id_Livro"));
					l.setTítulo(rs.getString("titulo"));
					l.setAutor(rs.getString("autor"));
					l.setEditora(rs.getString("editora"));
					l.setEdição(rs.getInt("edição"));
					l.setAno(rs.getInt("ano"));
					l.setValor(rs.getInt("valor"));
					l.setEstoque(rs.getBoolean("estoque"));	
					livro.add(l);
				}
		
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "erro ao exibir informações do DB" + e);
		}
		finally {
			 ConnectionFactory.closeConnection(con, stmt, rs);

		}
		return livro;
	}
	
	public void delete(Livro l) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		try {
			stmt = con.prepareStatement("DELETE FROM livro WHERE Id_Livro=?");
			stmt.setInt(1, l.getIdLivro());
			stmt.executeUpdate();
			JOptionPane.showMessageDialog(null, "Excluido com Sucesso");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "erro ao excluir:" + e);
		}
		finally {
			 ConnectionFactory.closeConnection(con, stmt);

		}	
	}
	
	public  Livro read(int id) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		Livro l = new Livro();
		try {
		stmt = con.prepareStatement("SELECT * FROM livro WHERE Id_Livro=? LIMIT 1;");
		stmt.setInt(1, id);
		rs = stmt.executeQuery();
		
			if(rs != null && rs.next()) {
				l.setIdLivro(rs.getInt("Id_Livro"));
				l.setTítulo(rs.getString("titulo"));
				l.setAutor(rs.getString("autor"));
				l.setEditora(rs.getString("editora"));
				l.setEdição(rs.getInt("edição"));
				l.setAno(rs.getInt("ano"));
				l.setValor(rs.getInt("valor"));
				l.setEstoque(rs.getBoolean("estoque"));
			}
		}catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "erro ao excluir:" + e);
		}
		finally {
			 ConnectionFactory.closeConnection(con, stmt, rs);
	}
		return l;
	}
	
	public void update(Livro l) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		try {
			stmt = con.prepareStatement("UPDATE livro SET titulo=?, autor=?, editora=?, edição=?, ano=?, valor=?, estoque=? WHERE Id_Livro=?;");
			stmt.setString(1, l.getTítulo());
			stmt.setString(2, l.getAutor());
			stmt.setString(3, l.getEditora());
			stmt.setInt(4, l.getEdição());
			stmt.setInt(5, l.getAno());
			stmt.setDouble(6, l.getValor());
			stmt.setBoolean(7, l.isEstoque());
			stmt.setInt(8, l.getIdLivro());
			
			stmt.executeUpdate();
			JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
		} 
		catch(SQLException e) {
			JOptionPane.showMessageDialog(null, "erro ao salvar" + e);
		}
		
		finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
	}

}
