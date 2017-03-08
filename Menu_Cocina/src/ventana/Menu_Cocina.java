package ventana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Menu_Cocina {



	private JFrame frame;
	private JTextField txtAbajo;
	private JCheckBox Tomate;
	private JCheckBox Sal;
	private JCheckBox Salchichas;
	private JCheckBox Pasta;
	private JCheckBox Pimienta;
	private JCheckBox Pollo;
	private JCheckBox Aceite;
	private JCheckBox Vinagre;
	private JCheckBox Patatas;
	private JRadioButton platoMacarrones;
	private JRadioButton platoPatatasFritas;
	private JRadioButton platoSalchiguettis;

	
	public void limpiarCheck() {

		platoMacarrones.setSelected(false);
		platoPatatasFritas.setSelected(false);
		platoSalchiguettis.setSelected(false);
		Pasta.setSelected(false);
		Aceite.setSelected(false);
		Tomate.setSelected(false);
		Sal.setSelected(false);
		Patatas.setSelected(false);
		Salchichas.setSelected(false);
		Pimienta.setSelected(false);
		Pollo.setSelected(false);
		Vinagre.setSelected(false);

	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu_Cocina window = new Menu_Cocina();
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
	public Menu_Cocina() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(
				Toolkit.getDefaultToolkit().getImage(Menu_Cocina.class.getResource("/imagenes/favicon.png")));
		frame.setBounds(100, 100, 390, 387);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JSeparator separator = new JSeparator();
		separator.setBounds(0, 35, 374, 2);
		frame.getContentPane().add(separator);

		platoMacarrones = new JRadioButton("Macarrones");
		platoMacarrones.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				limpiarCheck();
				platoMacarrones.setSelected(true);

			}
		});
		platoMacarrones.setBounds(10, 44, 109, 23);
		frame.getContentPane().add(platoMacarrones);

		platoPatatasFritas = new JRadioButton("Patatas Fritas");
		platoPatatasFritas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				limpiarCheck();
				platoPatatasFritas.setSelected(true);
			}
		});
		platoPatatasFritas.setBounds(119, 44, 109, 23);
		frame.getContentPane().add(platoPatatasFritas);

		platoSalchiguettis = new JRadioButton("Salchiguettis");
		platoSalchiguettis.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				limpiarCheck();
				platoSalchiguettis.setSelected(true);
			}
		});
		platoSalchiguettis.setBounds(230, 44, 109, 23);
		frame.getContentPane().add(platoSalchiguettis);

		JSeparator separator_1 = new JSeparator();
		separator.setBounds(0, 74, 374, 2);
		frame.getContentPane().add(separator);

		JTextPane Platos = new JTextPane();
		Platos.setEditable(false);
		Platos.setBackground(new Color(0, 153, 204));
		Platos.setText("Platos");
		Platos.setBounds(6, 11, 358, 20);
		frame.getContentPane().add(Platos);

		JTextPane Menu_Cocina = new JTextPane();
		Menu_Cocina.setText("Menu_Cocina");
		Menu_Cocina.setEditable(false);
		Menu_Cocina.setBackground(new Color(0, 153, 204));
		Menu_Cocina.setBounds(6, 87, 358, 20);
		frame.getContentPane().add(Menu_Cocina);

		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 118, 374, 2);
		frame.getContentPane().add(separator_2);

		Tomate = new JCheckBox("Tomate Frito");
		Tomate.setBounds(21, 127, 97, 23);
		frame.getContentPane().add(Tomate);

		Sal = new JCheckBox("Sal");
		Sal.setBounds(21, 153, 97, 23);
		frame.getContentPane().add(Sal);

		Salchichas = new JCheckBox("Salchichas");
		Salchichas.setBounds(21, 179, 97, 23);
		frame.getContentPane().add(Salchichas);

		Pasta = new JCheckBox("Pasta");
		Pasta.setBounds(130, 127, 97, 23);
		frame.getContentPane().add(Pasta);

		Pimienta = new JCheckBox("Pimienta");
		Pimienta.setBounds(130, 153, 97, 23);
		frame.getContentPane().add(Pimienta);

		Pollo = new JCheckBox("Pollo");
		Pollo.setBounds(130, 179, 97, 23);
		frame.getContentPane().add(Pollo);

		Aceite = new JCheckBox("Aceite");
		Aceite.setBounds(242, 127, 97, 23);
		frame.getContentPane().add(Aceite);

		Vinagre = new JCheckBox("Vinagre");
		Vinagre.setBounds(242, 153, 97, 23);
		frame.getContentPane().add(Vinagre);

		Patatas = new JCheckBox("Patatas");
		Patatas.setBounds(242, 179, 97, 23);
		frame.getContentPane().add(Patatas);

		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(0, 235, 374, 2);
		frame.getContentPane().add(separator_3);

		JButton Comprobar = new JButton("Comprobar");
		Comprobar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (platoMacarrones.isSelected() && Pasta.isSelected() && Aceite.isSelected()
						&& Tomate.isSelected() && Sal.isSelected() && !Patatas.isSelected()
						&& !Salchichas.isSelected() && !Pimienta.isSelected() && !Pollo.isSelected()
						&& !Vinagre.isSelected()) {
					txtAbajo.setForeground(Color.GREEN);
					txtAbajo.setText("Muy bien, ingredientes correctos!");

				} else if (platoPatatasFritas.isSelected() && !Pasta.isSelected() && Aceite.isSelected()
						&& !Tomate.isSelected() && Sal.isSelected() && Patatas.isSelected()
						&& !Salchichas.isSelected() && !Pimienta.isSelected() && !Pollo.isSelected()
						&& !Vinagre.isSelected()) {
					txtAbajo.setForeground(Color.GREEN);
					txtAbajo.setText("Muy bien, ingredientes correctos!");

				} else if (platoSalchiguettis.isSelected() && Pasta.isSelected() && Aceite.isSelected()
						&& Tomate.isSelected() && Sal.isSelected() && !Patatas.isSelected()
						&& Salchichas.isSelected() && !Pimienta.isSelected() && !Pollo.isSelected()
						&& !Vinagre.isSelected()) {
					
					txtAbajo.setForeground(Color.GREEN);
					txtAbajo.setText("Muy bien, ingredientes correctos!");

				} else {
					txtAbajo.setForeground(Color.RED);
					txtAbajo.setText("Mal... intentalo otra vez!");

				}
			}
		});
		Comprobar.setBounds(128, 248, 112, 23);
		frame.getContentPane().add(Comprobar);

		txtAbajo = new JTextField();
		txtAbajo.setForeground(Color.BLACK);
		txtAbajo.setEditable(false);
		txtAbajo.setText("Selecciona un plato y los Ingredientes\r para prepararlo");
		txtAbajo.setHorizontalAlignment(SwingConstants.CENTER);
		txtAbajo.setBounds(6, 287, 358, 50);
		frame.getContentPane().add(txtAbajo);
		txtAbajo.setColumns(10);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Menu_Cocina.class.getResource("/imagenes/background-grande.jpg")));
		label.setBounds(0, 0, 374, 348);
		frame.getContentPane().add(label);
	}
}