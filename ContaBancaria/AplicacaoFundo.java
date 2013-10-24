package ContaBancaria;

public class AplicacaoFundo extends ContaCorrente {
	
	public Double investimento;
	public Double porcentagemRendimento;
	public Double rendimentoAplicacao;
	
	public AplicacaoFundo(String numeroContaBancaria, int senha){
		super(numeroContaBancaria, senha);
	}

	public Double getInvestimento() {
		return investimento;
	}

	public void setInvestimento(Double investimento) {
		this.investimento = investimento;
	}

	public Double getPorcentagemRendimento() {
		return porcentagemRendimento;
	}

	public void setPorcentagemRendimento(Double porcentagemRendimento) {
		this.porcentagemRendimento = porcentagemRendimento;
	}

	public Double getRendimentoAplicacao() {
		return rendimentoAplicacao;
	}

	public void setRendimentoAplicacao(Double rendimentoAplicacao) {
		this.rendimentoAplicacao = rendimentoAplicacao;
	}

	public Double calculaRendimento(){
		rendimentoAplicacao = porcentagemRendimento * investimento;
		System.out.println("Rendimento: " + rendimentoAplicacao);
		return rendimentoAplicacao;
	}
}
