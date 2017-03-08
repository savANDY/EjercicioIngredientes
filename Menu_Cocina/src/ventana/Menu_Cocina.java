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
	
	private JRadioButton PlatoMacarrones;
	private JRadioButton PlatoPatatas;
	private JRadioButton Salchiguettis;
	
	private JCheckBox Pasta;
	private JCheckBox Aceite;
	private JCheckBox Tomate;
	private JCheckBox Sal;
	private JCheckBox Patatas;
	private JCheckBox Salchichas;
	private JCheckBox Pimienta;
	private JCheckBox Pollo;
	private JCheckBox Vinagre;
	
	public void limpiarCheck(){
		
		PlatoMacarrones.setSelected(false);
		PlatoPatatas.setSelected(false);
		Salchiguettis.setSelected(false);
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

	private JFrame frame;
	private JTextField txtAbajo;
	private JCheckBox Tomate_1;
	private JCheckBox Sal_1;
	private JCheckBox Salchichas_1;
	private JCheckBox Pasta_1;
	private JCheckBox Pimienta_1;
	private JCheckBox Pollo_1;
	private JCheckBox Aceite_1;
	private JCheckBox Vinagre_1;
	private JCheckBox Patatas_1;

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
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Menu_Cocina.class.getResource("/imagenes/favicon.png")));
		frame.setBounds(100, 100, 390, 387);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 35, 374, 2);
		frame.getContentPane().add(separator);
		
		
		JRadioButton platoMacarrones = new JRadioButton("Macarrones");
		platoMacarrones.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				limpiarCheck();
				
			}
		});
		platoMacarrones.setBounds(10, 44, 109, 23);
		frame.getContentPane().add(platoMacarrones);
		
		JRadioButton platoPatatasFritas = new JRadioButton("Patatas Fritas");
		platoPatatasFritas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				limpiarCheck();
				
			}
		});
		platoPatatasFritas.setBounds(119, 44, 109, 23);
		frame.getContentPane().add(platoPatatasFritas);
		
		JRadioButton platoSalchiguettis = new JRadioButton("Salchiguettis");
		platoSalchiguettis.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				limpiarCheck();
				
			}
		});
		platoSalchiguettis.setBounds(230, 44, 109, 23);
		frame.getContentPane().add(platoSalchiguettis);
		
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 74, 374, 2);
		frame.getContentPane().add(separator_1);
		
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
		
		Tomate_1 = new JCheckBox("Tomate Frito");
		Tomate_1.setBounds(21, 127, 97, 23);
		frame.getContentPane().add(Tomate_1);
		
		Sal_1 = new JCheckBox("Sal");
		Sal_1.setBounds(21, 153, 97, 23);
		frame.getContentPane().add(Sal_1);
		
		Salchichas_1 = new JCheckBox("Salchichas");
		Salchichas_1.setBounds(21, 179, 97, 23);
		frame.getContentPane().add(Salchichas_1);
		
		Pasta_1 = new JCheckBox("Pasta");
		Pasta_1.setBounds(130, 127, 97, 23);
		frame.getContentPane().add(Pasta_1);
		
		Pimienta_1 = new JCheckBox("Pimienta");
		Pimienta_1.setBounds(130, 153, 97, 23);
		frame.getContentPane().add(Pimienta_1);
		
		Pollo_1 = new JCheckBox("Pollo");
		Pollo_1.setBounds(130, 179, 97, 23);
		frame.getContentPane().add(Pollo_1);
		
		Aceite_1 = new JCheckBox("Aceite");
		Aceite_1.setBounds(242, 127, 97, 23);
		frame.getContentPane().add(Aceite_1);
		
		Vinagre_1 = new JCheckBox("Vinagre");
		Vinagre_1.setBounds(242, 153, 97, 23);
		frame.getContentPane().add(Vinagre_1);
		
		Patatas_1 = new JCheckBox("Patatas");
		Patatas_1.setBounds(242, 179, 97, 23);
		frame.getContentPane().add(Patatas_1);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(0, 235, 374, 2);
		frame.getContentPane().add(separator_3);
		
		JButton Comprobar = new JButton("Comprobar");
		Comprobar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (platoMacarrones.isSelected() 
						&& Pasta_1.isSelected() 
						&& Aceite_1.isSelected() 
						&& Tomate_1.isSelected() 
						&& Sal_1.isSelected()
						&& !Patatas_1.isSelected()
						&& !Salchichas_1.isSelected()
						&& !Pimienta_1.isSelected()
						&& !Pollo_1.isSelected()
						&& !Vinagre_1.isSelected()){
					
					txtAbajo.setText("Muy bien, ingredientes correctos!");
					
					
				} else if (platoPatatasFritas.isSelected() 
						&& !Pasta_1.isSelected() 
						&& Aceite_1.isSelected() 
						&& !Tomate_1.isSelected() 
						&& Sal_1.isSelected()
						&& Patatas_1.isSelected()
						&& !Salchichas_1.isSelected()
						&& !Pimienta_1.isSelected()
						&& !Pollo_1.isSelected()
						&& !Vinagre_1.isSelected()){
					
					txtAbajo.setText("Muy bien, ingredientes correctos!");
					
				} else if (platoSalchiguettis.isSelected() 
						&& Pasta_1.isSelected() 
						&& Aceite_1.isSelected() 
						&& Tomate_1.isSelected() 
						&& Sal_1.isSelected()
						&& !Patatas_1.isSelected()
						&& Salchichas_1.isSelected()
						&& !Pimienta_1.isSelected()
						&& !Pollo_1.isSelected()
						&& !Vinagre_1.isSelected()){
					
					txtAbajo.setText("Muy bien, ingredientes correctos!");
					
				} else {
					
					txtAbajo.setText("Mal... intentalo otra vez!");
					
				}
				
			}
		});
		Comprobar.setBounds(128, 248, 112, 23);
		frame.getContentPane().add(Comprobar);
		
		txtAbajo = new JTextField();
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