import java.awt.EventQueue;

import utils.Validador;
import view.PainelControle;

public class App {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Validador.geraNrSocio(1);
					PainelControle frame = new PainelControle();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
}
