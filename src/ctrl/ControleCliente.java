package ctrl;
import java.util.ArrayList;
import java.util.HashMap;

public class ControleCliente {
	private HashMap<String, Cliente> clientesCadastrados;
	private ArrayList<Cliente> clientesNaCasa;
	
	public HashMap<String, Cliente> getClientesCadastrados() {
		return clientesCadastrados;
	}
	
	public ArrayList<Cliente> getClientesNaCasa() {
		return clientesNaCasa;
	}
	public ControleCliente(){
		clientesCadastrados = new HashMap<>();
		clientesNaCasa = new ArrayList<>();
	}
	
	public void cadastraCliente(Cliente cliente){
		
	}
	
	public void liberaSaidaCliente(String cpf){
		
	}

	public void liberaAcessoCliente(int i) {
		
	}

	public void liberaAcessoClienteSemCadastro(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}
	
	public Cliente buscaClienteCadastrado(int cpf){
		return clientesCadastrados.get(cpf);
	}
	
}
