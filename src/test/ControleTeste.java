package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ctrl.*;

public class ControleTeste {

	private ControleCliente controle;
	
	@Before
	public void set(){
		controle = new ControleCliente();
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void cadastraNovoUsuario(){
		Cliente cliente = new Cliente("João", "99999999930", 1111111, 20);
		controle.cadastraCliente(cliente);
		assertEquals(1, controle.getClientesNaCasa().size());
		assertEquals(1, controle.getClientesCadastrados().size());
	}
	
	@Test
	public void liberarAcessoSemCadastrar(){
		Cliente cliente = new Cliente("João", "99999999930", 1111111, 20);
		controle.cadastraCliente(cliente);
		assertEquals(1, controle.getClientesNaCasa().size());
		assertEquals(0, controle.getClientesCadastrados().size());
	}
	
	@Test
	public void liberarSaidaCliente(){
		Cliente cliente = new Cliente("João", "99999999930", 1111111, 20);
		controle.cadastraCliente(cliente);
		assertEquals(1, controle.getClientesNaCasa().size());
		assertEquals(1, controle.getClientesCadastrados().size());
		controle.liberaSaidaCliente("99999999930");
		assertEquals(0, controle.getClientesNaCasa().size());
		assertEquals(0, controle.getClientesCadastrados().size());
	}
	
	@Test
	public void liberarSaidaClienteNaoCadastrado(){
		Cliente cliente = new Cliente("João", "99999999930", 1111111, 20);
		controle.liberaAcessoCliente(cliente);
		assertEquals(1, controle.getClientesNaCasa().size());
		assertEquals(1, controle.getClientesCadastrados().size());
		controle.liberaSaidaCliente("99999999930");
		assertEquals(0, controle.getClientesNaCasa().size());
		assertEquals(0, controle.getClientesCadastrados().size());
	}
	
	@Test
	public void liberarEntradaClienteViaNumero(){
		Cliente cliente = new Cliente("João", "99999999930", 1111111, 20);
		controle.cadastraCliente(cliente);
		assertEquals(1, controle.getClientesNaCasa().size());
		assertEquals(1, controle.getClientesCadastrados().size());
		controle.liberaSaidaCliente("99999999930");
		assertEquals(0, controle.getClientesNaCasa().size());
		assertEquals(0, controle.getClientesCadastrados().size());
		controle.liberaAcessoCliente(1111111);
		assertEquals(1, controle.getClientesNaCasa().size());
		assertEquals(1, controle.getClientesCadastrados().size());
	}
	
}
