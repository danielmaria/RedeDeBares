package utils;

import javax.swing.JOptionPane;

public class Mensagem {
	public static void avisoMensagemCPFNaoEncontrado(){
		JOptionPane.showMessageDialog(null, "Cliente n�o encontrado com este CPF na casa" ,"Informa��o!",JOptionPane.WARNING_MESSAGE);
	}
	
	public static void erroCampoSoRecebeLetras(){
		JOptionPane.showMessageDialog(null, "Este campo s� pode conter letras." ,"Aten��o!",JOptionPane.ERROR_MESSAGE); 
	}

	public static void mostraMensagemNaoContemNinguem(){
		JOptionPane.showMessageDialog(null, "N�o h� ningu�m na casa ainda." ,"",JOptionPane.INFORMATION_MESSAGE);
	}

	public static void erroCampoCPFInvalido(){
		JOptionPane.showMessageDialog(null, "O CPF informada n�o � v�lido." ,"Aten��o!",JOptionPane.ERROR_MESSAGE); 
	}
	
	public static void avisoClienteCadastradoComSucesso(){
		JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso." ,"Informa��o!",JOptionPane.WARNING_MESSAGE);
	}
}
