package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AplicacaoFundoTeste {
	
	AplicacaoFundo umaAplicacao;

	@Before
	public void setUp() throws Exception {
		umaAplicacao = new AplicacaoFundo(000-123-456-78, 1234);
	}

	@Test
	public void testNumeroContaBancaria(){
		assertEquals(000-123-456-78, umaAplicacao.getNumeroContaBancaria());
	}

	@Test
	public void testValidaSenha() {
		assertEquals(1234, umaAplicacao.getSenha());
	}
	
	@Test
	public void testDadosPessoais(){
		umaAplicacao.setNome("umNome");
		umaAplicacao.setEndereco("umEndereco");
		umaAplicacao.setTelefone("umTelefone");
		umaAplicacao.setCPF("umCPF");
		assertEquals("umNome", umaAplicacao.getNome());
		assertEquals("UmEndereco", umaAplicacao.getEndereco());
		assertEquals("umTelefone", umaAplicacao.getTelefone());
		assertEquals("umCPF", umaAplicacao.getCPF());
	}
	
	@test
	public void testInvestimento(){
		umaAplicacao.setInvestimento(8000.00);
		assertEquals(8000.00, umaAplicacao.getInvestimento(), 0.001);
	}
	
	@Test
	public void testRendimento(){
		umaAplicacao.setRendimento(80.00);
		assertEquals(80.00, umaAplicacao.getRendimento(), 0.001);
	}

}
