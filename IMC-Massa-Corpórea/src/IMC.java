import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IMC extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4297791704205198808L;
	private JPanel contentPane;
	private JTextField altura;
	private JTextField peso;
	private JTextField Resultado;
	private CalcIMC mc = new CalcIMC(); ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IMC frame = new IMC();
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
	public IMC() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		contentPane.add(panel);
		panel.setLayout(null);
		
		altura = new JTextField();
		altura.setBounds(38, 44, 140, 20);
		panel.add(altura);
		altura.setColumns(10);
		
		peso = new JTextField();
		peso.setColumns(10);
		peso.setBounds(38, 90, 140, 20);
		panel.add(peso);
		
		JLabel lblNewLabel = new JLabel("altura");
		lblNewLabel.setBounds(39, 29, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblPeso = new JLabel("peso ");
		lblPeso.setBounds(38, 75, 46, 14);
		panel.add(lblPeso);
		
		JButton btnNewButton = new JButton("IMC CALC");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				mc.dados(Float.parseFloat( peso.getText()), Float.parseFloat( altura.getText()));
				mc.IMC();
				Resultado.setText(mc.pazs()); 
			}
		});
		btnNewButton.setBounds(89, 164, 89, 23);
		panel.add(btnNewButton);
		
		Resultado = new JTextField();
		Resultado.setBounds(210, 44, 200, 20);
		panel.add(Resultado);
		Resultado.setColumns(10);
	}
}
