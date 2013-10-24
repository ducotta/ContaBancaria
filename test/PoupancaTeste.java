package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ContaBancaria.Poupanca;

public class PoupancaTeste {
	
	Poupanca umaPoupanca;

	@Before
	public void setUp() throws Exception {
		umaPoupanca = new Poupanca("000-123-456-78", 1234);
	}

	@Test
	public void testNumeroContaBancaria(){
		assertEquals("000-123-456-78", umaPoupanca.getNumeroContaBancaria());
	}

	@Test
	public void testValidaSenha() {
		assertEquals(1234, umaPoupanca.getSenha());
	}
	
	@Test
	public void testNome(){
		umaPoupanca.setNome("umNome");
		assertEquals("umNome", umaPoupanca.getNome());
	}

	@Test
	public void testEndereco(){
		umaPoupanca.setEndereco("umEndereco");
		assertEquals("umEndereco", umaPoupanca.getEndereco());
	}
	
	@Test
	public void testOperacao(){
		umaPoupanca.setOperacao("umaOperacao");
		assertEquals("umaOperacao", umaPoupanca.getOperacao());
	}
	
	@Test
	public void testCpf(){
		umaPoupanca.setCpf("umCPF");
		assertEquals("umCPF", umaPoupanca.getCpf());
	}
	
	@Test
	public void testSaldoInicial(){
		umaPoupanca.setSaldoInicial(100.00);
		assertEquals(100.00, umaPoupanca.getSaldoInicial(),0.001);
	}
	
	@Test
	public void testRendimento(){
		umaPoupanca.setRendimento(0.50);
		assertEquals(0.50, umaPoupanca.getRendimento(), 0.001);
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
		umaPoupanca.setSenhaEsperada(1234);
		umaPoupanca.setSaldoInicial(100.00);
		umaPoupanca.setSaque(10.50);
		umaPoupanca.setDeposito(60.70);
		assertEquals(150.20, umaPoupanca.calculaSaldoFinal(), 0.001);
	}
	
	@Test
	public void testAtualizaSaldo(){
		umaPoupanca.setSaldoInicial(100.00);
		umaPoupanca.setSaldoFinal(150.20);
		umaPoupanca.setSaque(10.50);
		umaPoupanca.setDeposito(60.70);
		assertEquals(150.20, umaPoupanca.atualizaSaldo(), 0.001);		
	}

}
