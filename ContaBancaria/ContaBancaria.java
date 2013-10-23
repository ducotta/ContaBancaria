package ContaBancaria;

public class ContaBancaria {
	
	private String nome;
	private String endereco;
	private String telefone;
	private String cpf;
	private String numeroContaBancaria;
	private int senha;
	
	public ContaBancaria(String numeroContaBancaria, int senha){
		this.numeroContaBancaria = numeroContaBancaria;
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNumeroContaBancaria() {
		return numeroContaBancaria;
	}

	public void setNumeroContaBancaria(String numerocontaBancaria) {
		this.numeroContaBancaria = numerocontaBancaria;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	
	

}
