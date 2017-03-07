import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.DropMode;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ingredientes {

	private JFrame frame;
	private JTextField txtSeleccionaUnPlato;

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
		frame.setBounds(100, 100, 390, 387);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JCheckBox platoMacarrones = new JCheckBox("Macarrones");
		platoMacarrones.setBounds(6, 44, 97, 23);
		frame.getContentPane().add(platoMacarrones);
		
		JCheckBox platoPatatasFritas = new JCheckBox("Patatas\r \r\nFritas");
		platoPatatasFritas.setBounds(128, 44, 130, 23);
		frame.getContentPane().add(platoPatatasFritas);
		
		JCheckBox platoSalchiguetis = new JCheckBox("Salchiguetis");
		platoSalchiguetis.setBounds(260, 44, 97, 23);
		frame.getContentPane().add(platoSalchiguetis);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 35, 374, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 74, 374, 2);
		frame.getContentPane().add(separator_1);
		
		JTextPane Platos = new JTextPane();
		Platos.setEditable(false);
		Platos.setBackground(new Color(0, 153, 204));
		Platos.setText("Platos");
		Platos.setBounds(6, 11, 358, 20);
		frame.getContentPane().add(Platos);
		
		JTextPane Ingredientes = new JTextPane();
		Ingredientes.setText("Ingredientes");
		Ingredientes.setEditable(false);
		Ingredientes.setBackground(new Color(0, 153, 204));
		Ingredientes.setBounds(6, 87, 358, 20);
		frame.getContentPane().add(Ingredientes);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 118, 374, 2);
		frame.getContentPane().add(separator_2);
		
		JCheckBox Tomate = new JCheckBox("Tomate Frito");
		Tomate.setBounds(87, 127, 97, 23);
		frame.getContentPane().add(Tomate);
		
		JCheckBox Sal = new JCheckBox("Sal");
		Sal.setBounds(87, 153, 97, 23);
		frame.getContentPane().add(Sal);
		
		JCheckBox Salchichas = new JCheckBox("Salchichas");
		Salchichas.setBounds(87, 179, 97, 23);
		frame.getContentPane().add(Salchichas);
		
		JCheckBox Pasta = new JCheckBox("Pasta");
		Pasta.setBounds(87, 205, 97, 23);
		frame.getContentPane().add(Pasta);
		
		JCheckBox Pimienta = new JCheckBox("Pimienta");
		Pimienta.setBounds(209, 127, 97, 23);
		frame.getContentPane().add(Pimienta);
		
		JCheckBox Pollo = new JCheckBox("Pollo");
		Pollo.setBounds(209, 153, 97, 23);
		frame.getContentPane().add(Pollo);
		
		JCheckBox Aceite = new JCheckBox("Aceite");
		Aceite.setBounds(209, 179, 97, 23);
		frame.getContentPane().add(Aceite);
		
		JCheckBox Vinagre = new JCheckBox("Vinagre");
		Vinagre.setBounds(209, 205, 97, 23);
		frame.getContentPane().add(Vinagre);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(0, 235, 374, 2);
		frame.getContentPane().add(separator_3);
		
		JButton Comprobar = new JButton("Comprobar");
		Comprobar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (platoMacarrones.isSelected() && Pasta.isSelected() && Aceite.isSelected() && Tomate.isSelected() && Sal.isSelected()){
					
				}
				
			}
		});
		Comprobar.setBounds(128, 248, 112, 23);
		frame.getContentPane().add(Comprobar);
		
		txtSeleccionaUnPlato = new JTextField();
		txtSeleccionaUnPlato.setEditable(false);
		txtSeleccionaUnPlato.setText("Selecciona un plato y los ingredientes\r para prepararlo");
		txtSeleccionaUnPlato.setHorizontalAlignment(SwingConstants.CENTER);
		txtSeleccionaUnPlato.setBounds(6, 287, 358, 50);
		frame.getContentPane().add(txtSeleccionaUnPlato);
		txtSeleccionaUnPlato.setColumns(10);
	}
}
