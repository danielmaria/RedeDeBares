package view;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PainelControle extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PainelControle frame = new PainelControle();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PainelControle() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLiberarSada = new JButton("Liberar Sa\u00EDda");
		btnLiberarSada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					LiberacaoSaida frame = new LiberacaoSaida();
					setEnabled(false);
					frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnLiberarSada.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLiberarSada.setBounds(104, 13, 189, 25);
		contentPane.add(btnLiberarSada);
		
		JButton btnLiberarEntrada = new JButton("Liberar Entrada");
		btnLiberarEntrada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					LiberacaoEntrada frame = new LiberacaoEntrada();
					setEnabled(false);
					frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnLiberarEntrada.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLiberarEntrada.setBounds(104, 51, 189, 25);
		contentPane.add(btnLiberarEntrada);
		
		JLabel lblQuantidadeDeClientes = new JLabel("Quantidade de cliente da casa:");
		lblQuantidadeDeClientes.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblQuantidadeDeClientes.setBounds(32, 96, 231, 16);
		contentPane.add(lblQuantidadeDeClientes);
		
		JLabel labelMostraQuantidade = new JLabel("0");
		labelMostraQuantidade.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelMostraQuantidade.setBounds(270, 97, 56, 16);
		contentPane.add(labelMostraQuantidade);
		
		JProgressBar progressBarMasculino = new JProgressBar();
		progressBarMasculino.setBounds(203, 125, 146, 14);
		contentPane.add(progressBarMasculino);
		
		JProgressBar progressBarFemino = new JProgressBar();
		progressBarFemino.setBounds(203, 157, 146, 14);
		contentPane.add(progressBarFemino);
		
		JLabel lblPercentualMaculino = new JLabel("Percentual maculino");
		lblPercentualMaculino.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPercentualMaculino.setBounds(32, 125, 159, 16);
		contentPane.add(lblPercentualMaculino);
		
		JLabel lblPercentualFeminino = new JLabel("Percentual feminino");
		lblPercentualFeminino.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPercentualFeminino.setBounds(32, 157, 159, 16);
		contentPane.add(lblPercentualFeminino);
		
		JLabel labelPercentualSocios = new JLabel("Percentual de s\u00F3cios");
		labelPercentualSocios.setFont(new Font("Tahoma", Font.PLAIN, 16));
		labelPercentualSocios.setBounds(32, 186, 159, 16);
		contentPane.add(labelPercentualSocios);
		
		JProgressBar progressBarSocios = new JProgressBar();
		progressBarSocios.setBounds(203, 188, 146, 14);
		contentPane.add(progressBarSocios);
		
		textField = new JTextField();
		textField.setBounds(75, 226, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCpf.setBounds(32, 228, 39, 16);
		contentPane.add(lblCpf);
		
		JButton btnConsultarCpf = new JButton("Consultar CPF");
		btnConsultarCpf.setBounds(203, 225, 113, 25);
		contentPane.add(btnConsultarCpf);
	}
}
