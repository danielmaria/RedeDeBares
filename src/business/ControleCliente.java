package business;
import java.util.HashMap;

import persistence.ClienteDTO;
import persistence.Conexao;
import utils.Genero;
import utils.Mensagem;

public class ControleCliente {
	private HashMap<String, ClienteDTO> clientesCadastrados;
	private HashMap<String, ClienteDTO> clientesNaCasa;
	private Conexao conexao = new Conexao();

	
	public HashMap<String, ClienteDTO> getClientesCadastrados() {
		return clientesCadastrados;
	}
	
	public HashMap<String, ClienteDTO> getClientesNaCasa() {
		return clientesNaCasa;
	}
	public ControleCliente(){
		setClientesCadastrados(new HashMap<>());
		clientesNaCasa = new HashMap<>();
	}
	
	public void cadastraCliente(ClienteDTO cliente){
		if (buscaClienteCadastrado(cliente.getCpf()) == null){
			getClientesCadastrados().put(cliente.getCpf(), cliente);
			conexao.salvaDadosTabelaCliente(cliente);
		} 
			liberaAcessoCliente(cliente);
	}
	
	public void liberaSaidaCliente(String cpf){
		ClienteDTO c = clientesNaCasa.remove(cpf);
		if (c == null){
			Mensagem.avisoMensagemCPFNaoEncontradoEmClientesNaCasa();
		} else {
			conexao.salvaDadosTabelaHistoricoClienteSaida(c);
		}
	}

	public void liberaAcessoCliente(ClienteDTO cliente) {
		if(buscaClienteNaCasa(cliente.getCpf()) == null){
			clientesNaCasa.put(cliente.getCpf(), cliente);
			conexao.salvaDadosTabelaHistoricoClienteEntrada(cliente);
		} else {
			Mensagem.avisoClienteEncontradoNaCasa();
		}
	}
	
	public ClienteDTO buscaClienteCadastrado(String cpf){
		return getClientesCadastrados().get(cpf);
	}
	
	public ClienteDTO buscaClienteNaCasa(String cpf){
		return getClientesNaCasa().get(cpf);
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
			if(getClientesCadastrados().containsKey(clienteDTO.getCpf())){
					cont++;
				}
			}
			return cont;
	}

	public void setClientesCadastrados(HashMap<String, ClienteDTO> clientesCadastrados) {
		this.clientesCadastrados = conexao.carregaArquivoDadosTabelaCliente();
	}
	
	public void encerraEspediente(){
		conexao.encerraEspediente(clientesNaCasa);
	}
	
}
