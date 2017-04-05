
public class Cliente {
	private String nome;
	private String cpf;
	private int nrSocio;
	private int idade;
	
	public Cliente(String nome, String cpf, int nrSocio, int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.nrSocio = nrSocio;
		this.idade = idade;
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
	
}
