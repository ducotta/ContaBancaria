package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ContaBancaria.AplicacaoFundo;

public class AplicacaoFundoTeste {
	
	AplicacaoFundo umaAplicacao;

	@Before
	public void setUp() throws Exception {
		umaAplicacao = new AplicacaoFundo("000-123-456-78", 1234);
	}

	@Test
	public void testNumeroContaBancaria(){
		assertEquals("000-123-456-78", umaAplicacao.getNumeroContaBancaria());
	}

	@Test
	public void testValidaSenha() {
		assertEquals(1234, umaAplicacao.getSenha());
	}
	
	@Test
	public void testNome(){
		umaAplicacao.setNome("umNome");
		assertEquals("umNome", umaAplicacao.getNome());
	}

	@Test
	public void testEndereco(){
		umaAplicacao.setEndereco("umEndereco");
		assertEquals("umEndereco", umaAplicacao.getEndereco());
	}
	
	@Test
	public void testOperacao(){
		umaAplicacao.setOperacao("umaOperacao");
		assertEquals("umaOperacao", umaAplicacao.getOperacao());
	}
	
	@Test
	public void testCpf(){
		umaAplicacao.setCpf("umCPF");
		assertEquals("umCPF", umaAplicacao.getCpf());
	}
	
	@Test
	public void testInvestimento(){
		umaAplicacao.setInvestimento(8000.00);
		assertEquals(8000.00, umaAplicacao.getInvestimento(), 0.001);
	}
	
	@Test
	public void testCalculaRendimento(){
		umaAplicacao.setInvestimento(100000.0);
		umaAplicacao.setPorcentagemRendimento(0.08);
		assertEquals(8000, umaAplicacao.calculaRendimento(), 0.001);
	}

}
