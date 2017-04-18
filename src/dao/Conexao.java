package dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
			FileReader fileReader = new FileReader("ArquivosDeDados\\TabelaCliente.txt");
			scanner = new Scanner(fileReader).useDelimiter("\\s*#####\\s*");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		while (scanner.hasNextLine()) {
			if (scanner.hasNext()) {
				String nome = scanner.next();
				String cpf = scanner.next();
				int idade = Integer.parseInt(scanner.next());
				Genero sexo = Genero.masculinoOuFemino(scanner.next());
				int id = Integer.parseInt(scanner.next());
				ClienteDTO cliente = new ClienteDTO(nome, cpf, idade, sexo, id);
				clientesCadastrados.put(cpf, cliente);
			} else {
				break;
			}
		}
		return clientesCadastrados;
	}
	
	public boolean salvaDadosTabelaCliente(ClienteDTO cliente){
		PrintWriter gravar = null;
		try {
			Scanner scanner = new Scanner(System.in);
			FileWriter fileReader = new FileWriter("ArquivosDeDados\\TabelaCliente.txt", true);
			gravar = new PrintWriter(fileReader);
		} catch (IOException e) {
			e.printStackTrace();
		}
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(cliente.getNome());
		stringBuilder.append("#####");
		
		stringBuilder.append(cliente.getCpf());
		stringBuilder.append("#####");
		
		stringBuilder.append(cliente.getIdade());
		stringBuilder.append("#####");
		
		stringBuilder.append(cliente.getGenero());
		stringBuilder.append("#####");
		
		stringBuilder.append(cliente.getNrSocio());
		stringBuilder.append("#####");
		
		gravar.append(stringBuilder);
		gravar.close();
		return false;
	}
}
