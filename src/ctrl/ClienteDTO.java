package ctrl;

import utils.Validador;

public class ClienteDTO {
	private String nome;
	private String cpf;
	private int nrSocio;
	private int idade;
	private Genero genero;
	
	public ClienteDTO(String nome, String cpf, int idade, Genero sexo, int id) {
		if(Validador.validaCliente(nome, cpf)){
			this.nome = formataNomeComposto(nome);
			this.cpf = cpf;
			this.idade = idade;
			this.genero = sexo;
			this.nrSocio = id;
		} else {
			throw new IllegalArgumentException();
		}
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getNrSocio() {
		return nrSocio;
	}
	public void setNrSocio(int nrSocio) {
		this.nrSocio = nrSocio;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	private String formataNomeComposto(String nome){
		StringBuilder nomeCompleto = new StringBuilder();
		for (String string : nome.split(" ")) {
			if(igualALigacao(nome)){
				nomeCompleto.append(nome);
			} else {
				nomeCompleto.append(string.substring(0, 1).toUpperCase());
				nomeCompleto.append(string.substring(1, string.length()).toLowerCase());
			}
			nomeCompleto.append(" ");
		}
		return nomeCompleto.toString().trim();
	}
	
	private boolean igualALigacao(String nome){
		String[] ligacoes = {"do", "da", "o", "dos"};
		for (String s : ligacoes) {
			if (nome.equals(s)){
				return true;
			}
		}
		return false;
	}
}
