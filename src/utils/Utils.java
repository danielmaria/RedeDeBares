package utils;

import java.text.ParseException;

import javax.swing.text.MaskFormatter;

public class Utils {
	public static int verificaPorcentagem(int total, int qtdParaVerificar){
		if(total > 0){
			double porcentagem;
			porcentagem = (qtdParaVerificar * 100) / total;
			return (int) Math.ceil((double)porcentagem);
		}
		Mensagem.mostraMensagemNaoContemNinguem();
		return 0;
	}
	public static MaskFormatter formatadorCPF(){
		MaskFormatter cpf = null;
		try {
			cpf = new MaskFormatter("###.###.###-##");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return cpf;
	}
	public static MaskFormatter formatadorNome(){
		MaskFormatter formatador = null;
		try {
			formatador = new MaskFormatter("******************************"); //30 caracteres
		} catch (ParseException e) {
			e.printStackTrace();
		} 
		formatador.setValidCharacters("qwertyuiopasdfghjklzxcvbnm" +
	           						  "QWERTYUIOPASDFGHJKLZXCVBNM" +
	           						  "��������. ");
		formatador.setPlaceholderCharacter(' ');
		return formatador;
	}
}
