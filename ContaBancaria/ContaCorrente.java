package ContaBancaria;

public class ContaCorrente extends ContaBancaria {
	
	public Double saldoInicial = 0.0;
	public Double saque = 0.0;
	public Double deposito = 0.0;
	public Double saldoFinal;
	
	public ContaCorrente(String numeroContaBancaria, int senha){
		super(numeroContaBancaria, senha);
	}

	public Double getSaldoInicial() {
		return saldoInicial;
	}

	public void setSaldoInicial(Double saldoInicial) {
		this.saldoInicial = saldoInicial;
	}

	public Double getSaque() {
		return saque;
	}

	public void setSaque(Double saque) {
		this.saque = saque;
	}

	public Double getDeposito() {
		return deposito;
	}

	public void setDeposito(Double deposito) {
		this.deposito = deposito;
	}

	public Double getSaldoFinal() {
		return saldoFinal;
	}

	public void setSaldoFinal(Double saldoFinal) {
		this.saldoFinal = saldoFinal;
	}

	public void imprimeSaldo(){
		if (getSenha() == getSenhaEsperada())
			System.out.println("Saldo disponivel: " + saldoInicial );		
	}
	
	public Double calculaSaldoFinal(){
		if (getSenha() == getSenhaEsperada())
			saldoFinal = saldoInicial+deposito-saque;
		System.out.println("Saldo disponivel: " + saldoInicial );
		return saldoFinal;
		
	}
	
	public Double atualizaSaldo(){
		if (getDeposito() != 0.0) || (getSaque() != 0.0)
			
	}
	
	
	

	


	
	

}
