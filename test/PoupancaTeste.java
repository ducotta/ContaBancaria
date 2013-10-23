package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PoupancaTeste {
	
	Poupanca umaPoupanca;

	@Before
	public void setUp() throws Exception {
		umaPoupanca = new Poupanca(000-123-456-78, 1234);
	}

	@Test
	public void testNumeroContaBancaria(){
		assertEquals(000-123-456-78, umaPoupanca.getNumeroContaBancaria());
	}

	@Test
	public void testValidaSenha() {
		assertEquals(1234, umaPoupanca.getSenha());
	}
	
	@Test
	public void testDadosPessoais(){
		umaPoupanca.setNome("umNome");
		umaPoupanca.setEndereco("umEndereco");
		umaPoupanca.setTelefone("umTelefone");
		umaPoupanca.setCPF("umCPF");
		assertEquals("umNome", umaPoupanca.getNome());
		assertEquals("UmEndereco", umaPoupanca.getEndereco());
		assertEquals("umTelefone", umaPoupanca.getTelefone());
		assertEquals("umCPF", umaPoupanca.getCPF());
	}
	
	@Test
	public void testSaldoInicial(){
		umaPoupanca.setSaldoInicial(100.00);
		assertEquals(100.00, umaPoupanca.getSaldoInicial(),0.001);
	}
	
	@Test
	public void testRendimento(){
		umaPoupanca.setRendimento(0.50);
		assertEquals(0.50, umaPoupanca.getrendimento(), 0.001);
	}
	
	@Test
	public void testSaque(){
		umaPoupanca.setSaque(10.50);
		assertEquals(10.50, umaPoupanca.getSaque(),0.001);
	}
	
	@Test
	public void testDeposito(){
		umaPoupanca.setDeposito(60.70);
		assertEquals(60.70, umaPoupanca.getDeposito(), 0.001);
	}
	
	
	
	@Test
	public void testSaldoFinal(){
		assertEquals(150.70, umaPoupanca.calculaSaldoFinal(100.00, 10.50, 60.70), 0.001);
	}

}
