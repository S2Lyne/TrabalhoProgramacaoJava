package TrabalhoProgramacao;

public class Pessoa {

	private String nome;
	private String dataNascimento;
	private String telefone;
	private String email;

	// Constructor	
	public Pessoa (String nome, String dataNascimento, String telefone, String email) {
    	this.nome = nome;
    	this.dataNascimento = dataNascimento;
    	this.telefone = telefone;
    	this.email = email;
	}
	public Pessoa() {
		
	}

	public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}

public String getDataNascimento() {
	return dataNascimento;
}

public void setDataNascimento(String dataNascimento) {
	this.dataNascimento = dataNascimento;
}
public String getTelefone() {
	return telefone;
}

public void setTelefone(String telefone) {
	this.telefone = telefone;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

}
