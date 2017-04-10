package ctrl;
import java.util.HashMap;

import utils.Mensagem;

public class ControleCliente {
	private HashMap<String, ClienteDTO> clientesCadastrados;
	private HashMap<String, ClienteDTO> clientesNaCasa;
	
	public HashMap<String, ClienteDTO> getClientesCadastrados() {
		return clientesCadastrados;
	}
	
	public HashMap<String, ClienteDTO> getClientesNaCasa() {
		return clientesNaCasa;
	}
	public ControleCliente(){
		clientesCadastrados = new HashMap<>();
		clientesNaCasa = new HashMap<>();
	}
	
	public void cadastraCliente(ClienteDTO cliente){
		if (buscaClienteCadastrado(cliente.getCpf()) == null){
			clientesCadastrados.put(cliente.getCpf(), cliente);
			liberaAcessoCliente(cliente);
		} else {
			liberaAcessoCliente(cliente);
		}
	}
	
	public void liberaSaidaCliente(String cpf){
		ClienteDTO c = clientesNaCasa.remove(cpf);
		if (c == null){
			Mensagem.avisoMensagemCPFNaoEncontrado();
		} 
	}

	public void liberaAcessoCliente(ClienteDTO cliente) {
		clientesNaCasa.put(cliente.getCpf(), cliente);
	}
	
	public ClienteDTO buscaClienteCadastrado(String cpf){
		return clientesCadastrados.get(cpf);
	}

	public int qtdClientesMasc() {
		int cont = 0;
		for (ClienteDTO clienteDTO : clientesNaCasa.values()) {
			if(clienteDTO.getGenero().equals(Genero.M)){
				cont++;
			}
		}
		return cont;
	}

	public int qtdClientesSocios() {
		int cont = 0;
		for (ClienteDTO clienteDTO : clientesNaCasa.values()) {
			if(clientesCadastrados.containsKey(clienteDTO.getCpf())){
					cont++;
				}
			}
			return cont;
	}
	
}
