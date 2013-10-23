package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ContaBancaria.ContaBancaria;

public class ContaBancariaTeste {
	
	ContaBancaria umaConta;

	@Before
	public void setUp() throws Exception {
	umaConta = new ContaBancaria("000-123-456-78", 1234);
	}

	@Test
	public void testNumeroContaBancaria(){
		assertEquals("000-123-456-78", umaConta.getNumeroContaBancaria());
	}

	@Test
	public void testValidaSenha() {
		assertEquals(1234, umaConta.getSenha());
	}
	
	@Test
	public void testNome(){
		umaConta.setNome("umNome");
		assertEquals("umNome", umaConta.getNome());
	}

	@Test
	public void testEndereco(){
		umaConta.setEndereco("umEndereco");
		assertEquals("umEndereco", umaConta.getEndereco());
	}
	
	@Test
	public void testOperacao(){
		umaConta.setOperacao("umaOperacao");
		assertEquals("umaOperacao", umaConta.getOperacao());
	}
	
	@Test
	public void testCpf(){
		umaConta.setCpf("umCPF");
		assertEquals("umCPF", umaConta.getCpf());
	}
	
	@Test
	public void testImprimeDados(){
		umaConta.setNome("umNome");
		umaConta.setCpf("umCPF");
		umaConta.setOperacao("umaOperacao");
		assertEquals("Nome: umNome	CPF: umCPF	Conta: 000-123-456-78	Operacao: umaOperacao",umaConta.imprimeDados());
	}
		
}
