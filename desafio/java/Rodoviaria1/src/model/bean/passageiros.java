package model.bean;

public class passageiros {
	private int Id_Passageiro;
	private String Nome;
	private boolean Genero;
	private String Rg;
	private String Cpf;
	private String Endereco;
	private String Email;
	private String Telefone;
	private int setId_Passageiro;

	
	public int getId_Passageiro() {
		return Id_Passageiro;
	}
	public void setId_Passageiro(int id_Passageiro) {
		Id_Passageiro = id_Passageiro;
	}
	public int getSetId_Passageiro() {
		return setId_Passageiro;
	}
	public void setSetId_Passageiro(int setId_Passageiro) {
		this.setId_Passageiro = setId_Passageiro;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public boolean isGenero() {
		return Genero;
	}
	public void setGenero(boolean genero) {
		Genero = genero;
	}
	public String getRg() {
		return Rg;
	}
	public void setRg(String rg) {
		Rg = rg;
	}
	public String getCpf() {
		return Cpf;
	}
	public void setCpf(String cpf) {
		Cpf = cpf;
	}
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getTelefone() {
		return Telefone;
	}
	public void setTelefone(String telefone) {
		Telefone = telefone;
	}
	public boolean getGenero() {
		// TODO Auto-generated method stub
		return false;
	}
}
