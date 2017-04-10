package utils;

import javax.swing.JOptionPane;

public class Mensagem {
	public static void avisoMensagemCPFNaoEncontrado(){
		JOptionPane.showMessageDialog(null, "Cliente não encontrado com este CPF na casa" ,"Informação!",JOptionPane.WARNING_MESSAGE);
	}
	
	public static void erroCampoSoRecebeLetras(){
		JOptionPane.showMessageDialog(null, "Este campo só pode conter letras." ,"Atenção!",JOptionPane.ERROR_MESSAGE); 
	}

	public static void mostraMensagemNaoContemNinguem(){
		JOptionPane.showMessageDialog(null, "Não há ninguém na casa ainda." ,"",JOptionPane.INFORMATION_MESSAGE);
	}

	public static void erroCampoCPFInvalido(){
		JOptionPane.showMessageDialog(null, "O CPF informada não é válido." ,"Atenção!",JOptionPane.ERROR_MESSAGE); 
	}
	
	public static void avisoClienteCadastradoComSucesso(){
		JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso." ,"Informação!",JOptionPane.WARNING_MESSAGE);
	}
}
