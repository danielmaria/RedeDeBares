package view;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.Vector;

import javax.swing.JTextField;
import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LiberacaoEntrada extends JFrame {

	private JPanel contentPane;
	private JTextField textNmSocio;
	private JTextField textFieldNome;
	private JTextField textFieldCPF;

	/**
	 * Create the frame.
	 */
	public LiberacaoEntrada() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNmSocio = new JLabel("N\u00FAmero de s\u00F3cio");
		lblNmSocio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNmSocio.setBounds(25, 13, 137, 16);
		contentPane.add(lblNmSocio);
		
		textNmSocio = new JTextField();
		textNmSocio.setBounds(174, 11, 116, 22);
		contentPane.add(textNmSocio);
		textNmSocio.setColumns(10);
		
		JButton btnBuscarScio = new JButton("Buscar s\u00F3cio");
		btnBuscarScio.setBounds(302, 10, 118, 25);
		contentPane.add(btnBuscarScio);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNome.setBounds(25, 42, 56, 16);
		contentPane.add(lblNome);
		
		textFieldNome = new JTextField();
		textFieldNome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldNome.setBounds(93, 40, 327, 22);
		contentPane.add(textFieldNome);
		textFieldNome.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCpf.setBounds(25, 71, 69, 16);
		contentPane.add(lblCpf);
		
		textFieldCPF = new JTextField();
		textFieldCPF.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldCPF.setBounds(93, 69, 116, 22);
		contentPane.add(textFieldCPF);
		textFieldCPF.setColumns(10);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblIdade.setBounds(221, 71, 56, 16);
		contentPane.add(lblIdade);
		
		JComboBox comboBoxIdade = new JComboBox(iniciarComboBoxIdade());
		comboBoxIdade.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBoxIdade.setBounds(289, 69, 56, 22);
		contentPane.add(comboBoxIdade);
		
		JButton btnLiberarEntrada = new JButton("Liberar Entrada");
		btnLiberarEntrada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnLiberarEntrada.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLiberarEntrada.setBounds(115, 104, 218, 57);
		contentPane.add(btnLiberarEntrada);
		
		JButton btnCadastrarScioE = new JButton("Cadastrar s\u00F3cio e Liberar Entrada");
		btnCadastrarScioE.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCadastrarScioE.setBounds(25, 172, 395, 57);
		contentPane.add(btnCadastrarScioE);
	}

	private Vector iniciarComboBoxIdade() {
		int idade = 0;
		Vector vetor = new Vector();
		while (idade <= 100){
			vetor.add(idade);
			idade++;
		}
		return vetor;
	}
}
