package dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

import ctrl.ClienteDTO;
import ctrl.Genero;

public class Conexao {
	@SuppressWarnings("resource")
	public HashMap<String,ClienteDTO> carregaArquivoDadosTabelaCliente(){
		Scanner scanner = null;
		HashMap<String, ClienteDTO> clientesCadastrados = new HashMap<>();
		try {
			scanner = new Scanner(new FileReader("arquivo.txt")).useDelimiter("\\||\\n");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		while (scanner.hasNext()) {
			String nome = scanner.next();
			String cpf = scanner.next();
			int idade = Integer.parseInt(scanner.next());
			Genero sexo = Genero.masculinoOuFemino(scanner.next());
			int id = Integer.parseInt(scanner.next());
			ClienteDTO cliente = new ClienteDTO(nome, cpf, idade, sexo, id);
			clientesCadastrados.put(cpf, cliente);
		}
		return clientesCadastrados;
	}
}
