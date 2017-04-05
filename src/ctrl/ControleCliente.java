package ctrl;
import java.util.ArrayList;
import java.util.HashMap;

public class ControleCliente {
	private HashMap<String, Cliente> clientesCadastrados;
	public HashMap<String, Cliente> getClientesCadastrados() {
		return clientesCadastrados;
	}

	public ArrayList<Cliente> getClientesNaCasa() {
		return clientesNaCasa;
	}

	private ArrayList<Cliente> clientesNaCasa;
	
	public ControleCliente(){
		clientesCadastrados = new HashMap<>();
		clientesNaCasa = new ArrayList<>();
	}
	
	public void cadastraCliente(Cliente cliente){
		
	}
	
	public void liberaSaidaCliente(String cpf){
		
	}

	public void liberaAcessoCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}
	
}
