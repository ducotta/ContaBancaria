package ContaBancaria;

public class ContaBancaria {
	
	private String nome;
	private String endereco;
	private String cpf;
	private String numeroContaBancaria;
	private String operacao;
	private int senhaEsperada;
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
	
	public String getOperacao() {
		return operacao;
	}

	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public int getSenhaEsperada() {
		return senhaEsperada;
	}

	public void setSenhaEsperada(int senhaEsperada) {
		this.senhaEsperada = senhaEsperada;
	}
	
	public String imprimeDados(){
		String dados;
		dados = "Nome: " + nome + "\tCPF: " + cpf + "\tConta: " + numeroContaBancaria + "\tOperacao: " + operacao;
		System.out.println(dados);
		return dados;
	}
	
	
	

}
