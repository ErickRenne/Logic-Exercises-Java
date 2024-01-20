package trampo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import base.CalcHoraTrab;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;

public class CodigoDaInterface extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4151414977639785153L;
	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textEntrada;
	private JTextField textSaida;
	private JTextField textSalarioFinal;
	private JPanel panelResultado;
	private	JPanel panelPrincipal;
	private CalcHoraTrab ch;
	private JComboBox<Object> comboBox ;
	private JTextField textSalárioPorHora;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CodigoDaInterface frame = new CodigoDaInterface();
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
	public CodigoDaInterface() {
		setTitle("Horas Trabalhadas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ch = new CalcHoraTrab();
		
		panelPrincipal = new JPanel();
		panelPrincipal.setBackground(new Color(255, 255, 255));
		panelPrincipal.setBounds(0, 0, 484, 461);
		contentPane.add(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setHorizontalAlignment(SwingConstants.LEFT);
		lblNome.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNome.setBounds(40, 25, 195, 27);
		panelPrincipal.add(lblNome);
		
		JLabel lblTurno = new JLabel("Turno:");
		lblTurno.setFont(new Font("Arial", Font.PLAIN, 16));
		lblTurno.setBounds(250, 25, 195, 27);
		panelPrincipal.add(lblTurno);
		
		textNome = new JTextField();
		textNome.setFont(new Font("Arial", Font.PLAIN, 16));
		textNome.setBounds(40, 54, 195, 35);
		panelPrincipal.add(textNome);
		textNome.setColumns(10);
		
		JLabel lblEntrada = new JLabel("Entrada:");
		lblEntrada.setFont(new Font("Arial", Font.PLAIN, 16));
		lblEntrada.setBounds(40, 179, 140, 27);
		panelPrincipal.add(lblEntrada);
		
		textEntrada = new JTextField();
		textEntrada.setFont(new Font("Arial", Font.PLAIN, 16));
		textEntrada.setColumns(10);
		textEntrada.setBounds(40, 208, 195, 35);
		panelPrincipal.add(textEntrada);
		
		JLabel lblSaida = new JLabel("Saída:");
		lblSaida.setFont(new Font("Arial", Font.PLAIN, 16));
		lblSaida.setBounds(250, 179, 140, 27);
		panelPrincipal.add(lblSaida);
		
		textSaida = new JTextField();
		textSaida.setFont(new Font("Arial", Font.PLAIN, 16));
		textSaida.setColumns(10);
		textSaida.setBounds(250, 208, 195, 35);
		panelPrincipal.add(textSaida);
		
		JButton btnCalcSalario = new JButton("Calcular o Salário");
		btnCalcSalario.setBackground(new Color(240, 240, 240));
		btnCalcSalario.setFont(new Font("Arial", Font.PLAIN, 16));
		btnCalcSalario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String turno;
				if(comboBox.getSelectedIndex() == 1) {
					 turno = "Manhã";
				}else if(comboBox.getSelectedIndex() == 2) {
					turno = "Tarde";
				}else if(comboBox.getSelectedIndex() == 3) {
					turno = "Noite";
				}else {
					turno = "Noite/Madrugada";
				}
				ch.cadastroTrabalhador(textNome.getText(), turno, Integer.parseInt(textEntrada.getText()), Integer.parseInt(textSaida.getText()), Integer.parseInt(textSalárioPorHora.getText()));
				ch.calHoras();
				textSalarioFinal.setText(ch.salario());
				panelResultado.setVisible(true);
			}
		});
		btnCalcSalario.setBounds(142, 254, 200, 40);
		panelPrincipal.add(btnCalcSalario);
		
		comboBox = new JComboBox<Object>();
		comboBox.setFont(new Font("Arial", Font.PLAIN, 16));
		comboBox.setModel(new DefaultComboBoxModel<Object>(new String[] {"Turno", "Manhã", "Tarde", "Noite", "Noite/Madrugada"}));
		comboBox.setBounds(250, 54, 195, 35);
		panelPrincipal.add(comboBox);
		
		JLabel lblSalarioPorHora = new JLabel("Salário Por Hora");
		lblSalarioPorHora.setFont(new Font("Arial", Font.PLAIN, 16));
		lblSalarioPorHora.setBounds(40, 104, 140, 27);
		panelPrincipal.add(lblSalarioPorHora);
		
		textSalárioPorHora = new JTextField();
		textSalárioPorHora.setFont(new Font("Arial", Font.PLAIN, 16));
		textSalárioPorHora.setColumns(10);
		textSalárioPorHora.setBounds(40, 133, 195, 35);
		panelPrincipal.add(textSalárioPorHora);
		
		panelResultado = new JPanel();
		panelResultado.setBackground(new Color(255, 255, 255));
		panelResultado.setLayout(null);
		panelResultado.setBounds(40, 300, 405, 124);
		contentPane.add(panelResultado);
		panelResultado.setVisible(false);
		
		textSalarioFinal = new JTextField();
		textSalarioFinal.setText("0");
		textSalarioFinal.setEditable(false);
		textSalarioFinal.setColumns(10);
		textSalarioFinal.setBounds(105, 58, 200, 35);
		panelResultado.add(textSalarioFinal);
		
		JLabel lblSalario = new JLabel("Salário");
		lblSalario.setFont(new Font("Arial", Font.PLAIN, 16));
		lblSalario.setBounds(105, 28, 140, 27);
		panelResultado.add(lblSalario);
	}
}
