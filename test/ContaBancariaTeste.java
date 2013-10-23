package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ContaBancariaTeste {
	
	ContaBancaria umaConta;

	@Before
	public void setUp() throws Exception {
	umaConta = new ContaBancaria(000-123-456-78, 1234);
	}

	@Test
	public void testNumeroContaBancaria(){
		assertEquals(000-123-456-78, umaConta.getNumeroContaBancaria());
	}

	@Test
	public void testValidaSenha() {
		assertEquals(1234, umaConta.getSenha());
	}
	
	@Test
	public void testDadosPessoais(){
		umaConta.setNome("umNome");
		umaConta.setEndereco("umEndereco");
		umaConta.setTelefone("umTelefone");
		umaConta.setCPF("umCPF");
		assertEquals("umNome", umaConta.getNome());
		assertEquals("UmEndereco", umaConta.getEndereco());
		assertEquals("umTelefone", umaConta.getTelefone());
		assertEquals("umCPF", umaConta.getCPF());
	}

}
