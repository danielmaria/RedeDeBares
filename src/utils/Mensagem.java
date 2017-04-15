package utils;

import javax.swing.JOptionPane;

public class Mensagem {
	public static void avisoMensagemCPFNaoEncontradoEmClientesNaCasa(){
		JOptionPane.showMessageDialog(null, "Cliente n�o encontrado com este CPF na casa" ,"Informa��o!",JOptionPane.WARNING_MESSAGE);
	}
	
	public static void avisoMensagemCPFNaoEncontrado(){
		JOptionPane.showMessageDialog(null, "Cliente n�o encontrado com este CPF" ,"Informa��o!",JOptionPane.WARNING_MESSAGE);
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
	
	public static void avisoClienteCadastradoComSucesso(int id){
		JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso.\nO n�mero do s�cio �: " + id +"." ,"Informa��o!",JOptionPane.WARNING_MESSAGE);
	}
	
	public static void avisoClienteEncontradoNaCasa(){
		JOptionPane.showMessageDialog(null, "Cliente se encontra na casa." ,"Informa��o!",JOptionPane.WARNING_MESSAGE);
	}
	
	public static void avisoClienteNaoEncontradoNaCasa(){
		JOptionPane.showMessageDialog(null, "Cliente n�o encontra-se na casa." ,"Informa��o!",JOptionPane.WARNING_MESSAGE);
	}
	
	public static void erroCamposInvalidos(){
		JOptionPane.showMessageDialog(null, "Preencha adequadamento as informa��es do cliente." ,"Informa��o!",JOptionPane.WARNING_MESSAGE);
	}
}
