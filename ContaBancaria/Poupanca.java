package ContaBancaria;

public class Poupanca extends ContaBancaria { 
	
	public Double saldo = 0.0;
	public Double saque = 0.0;
	public Double deposito = 0.0;
	public Double rendimento = 0.0;
	public Double saldoFinal;
	
	public Poupanca(String numeroContaBancaria, int senha){
		super(numeroContaBancaria, senha);
	}

	public Double getSaldoInicial() {
		return saldo;
	}

	public void setSaldoInicial(Double saldoInicial) {
		this.saldo = saldoInicial;
	}
	
	public Double getRendimento(){
		return rendimento;
	}

	public void setRendimento(Double rendimento) {
		this.rendimento = rendimento;
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

	public Double calculaSaldo(){
		if (getSenha() == getSenhaEsperada()){
			saldo = saldo + rendimento;
			System.out.println("Rendimento: " + rendimento);
			System.out.println("Saldo disponivel: " + saldo );
		}
		return saldo;
	}
	
	public Double calculaSaldoFinal(){
		if (getSenha() == getSenhaEsperada()){
			saldoFinal = saldo + deposito - saque;
			System.out.println("Saldo disponivel: " + saldo );
		}
		return saldoFinal;
		
	}
	
	public Double atualizaSaldo(){
		if ((getDeposito() != 0.0)||(getSaque() != 0.0))
			saldo = saldoFinal;
		return saldo;
	}

}
