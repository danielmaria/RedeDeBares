package persistence;

import utils.Genero;
import utils.Mensagem;
import utils.Utils;
import utils.Validador;

public class ClienteDTO {
	private String nome;
	private String cpf;
	private int nrSocio;
	private int idade;
	private Genero genero;
	
	public ClienteDTO(String nome, String cpf, int idade, Genero sexo, int id) {
		if(Validador.validaCliente(nome, cpf)){
			this.nome = Utils.formataNomeComposto(nome);
			this.cpf = cpf;
			this.idade = idade;
			this.genero = sexo;
			this.nrSocio = id;
		} else {
			Mensagem.erroCamposInvalidos();
			throw new IllegalArgumentException();
		}
		
	}
	public ClienteDTO(){}
	
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
	
}
