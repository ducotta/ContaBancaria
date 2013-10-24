package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ContaBancaria.ContaCorrente;

public class ContaCorrenteTeste {
	
	ContaCorrente umaContaCorrente;

	@Before
	public void setUp() throws Exception {
		umaContaCorrente = new ContaCorrente("000-123-456-78", 1234);
	}
	
	@Test
	public void testNumeroContaBancaria(){
		assertEquals("000-123-456-78", umaContaCorrente.getNumeroContaBancaria());
	}

	@Test
	public void testValidaSenha() {
		assertEquals(1234, umaContaCorrente.getSenha());
	}
	
	@Test
	public void testNome(){
		umaContaCorrente.setNome("umNome");
		assertEquals("umNome", umaContaCorrente.getNome());
	}

	@Test
	public void testEndereco(){
		umaContaCorrente.setEndereco("umEndereco");
		assertEquals("umEndereco", umaContaCorrente.getEndereco());
	}
	
	@Test
	public void testOperacao(){
		umaContaCorrente.setOperacao("umaOperacao");
		assertEquals("umaOperacao", umaContaCorrente.getOperacao());
	}
	
	@Test
	public void testCpf(){
		umaContaCorrente.setCpf("umCPF");
		assertEquals("umCPF", umaContaCorrente.getCpf());
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
		umaContaCorrente.setSenhaEsperada(1234);
		umaContaCorrente.setSaldoInicial(100.00);
		umaContaCorrente.setSaque(10.50);
		umaContaCorrente.setDeposito(60.70);
		assertEquals(150.20, umaContaCorrente.calculaSaldoFinal(), 0.001);
	}
	
	@Test
	public void testAtualizaSaldo(){
		umaContaCorrente.setSaldoInicial(100.00);
		umaContaCorrente.setSaldoFinal(150.20);
		umaContaCorrente.setSaque(10.50);
		umaContaCorrente.setDeposito(60.70);
		assertEquals(150.20, umaContaCorrente.atualizaSaldo(), 0.001);		
	}

}
