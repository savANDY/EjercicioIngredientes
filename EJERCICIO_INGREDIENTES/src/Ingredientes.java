import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;

public class Ingredientes {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ingredientes window = new Ingredientes();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ingredientes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 316, 387);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JCheckBox chckbxMacarrones = new JCheckBox("Macarrones");
		chckbxMacarrones.setBounds(6, 44, 97, 23);
		frame.getContentPane().add(chckbxMacarrones);
		
		JCheckBox chckbxPatatasFritas = new JCheckBox("Patatas Fritas");
		chckbxPatatasFritas.setBounds(105, 44, 97, 23);
		frame.getContentPane().add(chckbxPatatasFritas);
		
		JCheckBox chckbxSalchiguetis = new JCheckBox("Salchiguetis");
		chckbxSalchiguetis.setBounds(215, 44, 97, 23);
		frame.getContentPane().add(chckbxSalchiguetis);
	}
}
