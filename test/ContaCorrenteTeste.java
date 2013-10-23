package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ContaCorrenteTeste {
	
	ContaCorrente umaContaCorrente;

	@Before
	public void setUp() throws Exception {
		umaContaCorrente = new ContaCorrente(000-123-456-78, 1234);
	}
	
	@Test
	public void testNumeroContaBancaria(){
		assertEquals(000-123-456-78, umaContaCorrente.getNumeroContaBancaria());
	}

	@Test
	public void testValidaSenha() {
		assertEquals(1234, umaContaCorrente.getSenha());
	}
	
	@Test
	public void testDadosPessoais(){
		umaContaCorrente.setNome("umNome");
		umaContaCorrente.setEndereco("umEndereco");
		umaContaCorrente.setTelefone("umTelefone");
		umaContaCorrente.setCPF("umCPF");
		assertEquals("umNome", umaContaCorrente.getNome());
		assertEquals("UmEndereco", umaContaCorrente.getEndereco());
		assertEquals("umTelefone", umaContaCorrente.getTelefone());
		assertEquals("umCPF", umaContaCorrente.getCPF());
	}
	
	@Test
	public void testSaldoInicial(){
		umaContaCorrente.setSaldoInicial(100.00);
		assertEquals(100.00, umaContaCorrente.getSaldoInicial(),0.001);
	}
	
	@Test
	public void testSaque(){
		umaContaCorrente.setSaque(10.50);
		assertEquals(10.50, umaContaCorrente.getSaque(),0.001);
	}
	
	@Test
	public void testDeposito(){
		umaContaCorrente.setDeposito(60.70);
		assertEquals(60.70, umaContaCorrente.getDeposito(), 0.001);
	}
	
	@Test
	public void testSaldoFinal(){
		assertEquals(150.70, umaContaCorrente.calculaSaldoFinal(100.00, 10.50, 60.70), 0.001);
	}

}
