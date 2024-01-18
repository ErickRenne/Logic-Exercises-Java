import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CodigoDaInterface extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6868673211549616736L;
	private JPanel contentPane;
	private JTextField nometxt;
	private JTextField turmatxt;
	private JTextField nota1;
	private JLabel lblNomeDoAluno_1;
	private JTextField nota2;
	private JLabel lblNomeDoAluno_5;
	private JLabel lblNomeDoAluno_2;
	private JTextField nota3;
	private JLabel lblNomeDoAluno_3;
	private JTextField nota4;
	private JButton SalvarNome;
	private JPanel principal;
	private JPanel notas;
	private CalcNota cm;
	private JPanel panel;
	private JTextField stiNome;
	private JTextField stiTurma;
	private JTextField stiSituacao;
	private JLabel lblNomeDoAluno_4;
	private JLabel lblTurmaDoAluno_2;
	private JLabel lblSituao;
	private JButton caluNota;
	private JButton voltar;
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
		cm = new CalcNota();

		setTitle("Media Final");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 440, 410);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 0, 0));
		contentPane.setBorder(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);

		principal = new JPanel();
		principal.setBackground(new Color(128, 128, 128));
		principal.setBounds(0, 0, 424, 371);
		contentPane.add(principal);
		principal.setLayout(null);
		principal.setBackground(Color.WHITE);

		nometxt = new JTextField();
		nometxt.setFont(new Font("Arial", Font.PLAIN, 16));
		nometxt.setBounds(27, 82, 370, 35);
		principal.add(nometxt);
		nometxt.setColumns(10);

		turmatxt = new JTextField();
		turmatxt.setFont(new Font("Arial", Font.PLAIN, 16));
		turmatxt.setColumns(10);
		turmatxt.setBounds(27, 196, 370, 35);
		principal.add(turmatxt);

		JLabel lblNomeDoAluno = new JLabel("NOME DO ALUNO:");
		lblNomeDoAluno.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNomeDoAluno.setBounds(27, 45, 166, 25);
		principal.add(lblNomeDoAluno);

		JLabel lblTurmaDoAluno = new JLabel("TURMA DO ALUNO:");
		lblTurmaDoAluno.setFont(new Font("Arial", Font.PLAIN, 16));
		lblTurmaDoAluno.setBounds(27, 160, 166, 25);
		principal.add(lblTurmaDoAluno);

		
		SalvarNome = new JButton("Add Nota");
		SalvarNome.setFont(new Font("Arial", Font.PLAIN, 16));
		SalvarNome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nota1.setText("");
				nota2.setText("");
				nota3.setText("");
				nota4.setText("");
				panel.setVisible(false);
				principal.setVisible(false);
				notas.setVisible(true);
				

			}
		});
		SalvarNome.setBounds(63, 271, 303, 35);
		principal.add(SalvarNome);

		panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 424, 371);
		contentPane.add(panel);
		panel.setVisible(false);
		panel.setLayout(null);

		stiNome = new JTextField();
		stiNome.setText("0");
		stiNome.setFont(new Font("Arial", Font.PLAIN, 16));
		stiNome.setColumns(10);
		stiNome.setBounds(26, 38, 370, 35);
		panel.add(stiNome);

		stiTurma = new JTextField();
		stiTurma.setText("0");
		stiTurma.setFont(new Font("Arial", Font.PLAIN, 16));
		stiTurma.setColumns(10);
		stiTurma.setBounds(26, 110, 370, 35);
		panel.add(stiTurma);

		stiSituacao = new JTextField();
		stiSituacao.setText("0");
		stiSituacao.setFont(new Font("Arial", Font.PLAIN, 16));
		stiSituacao.setColumns(10);
		stiSituacao.setBounds(26, 191, 370, 35);
		panel.add(stiSituacao);

		lblNomeDoAluno_4 = new JLabel("NOME DO ALUNO:");
		lblNomeDoAluno_4.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNomeDoAluno_4.setBounds(26, 11, 166, 25);
		panel.add(lblNomeDoAluno_4);

		lblTurmaDoAluno_2 = new JLabel("TURMA DO ALUNO:");
		lblTurmaDoAluno_2.setFont(new Font("Arial", Font.PLAIN, 16));
		lblTurmaDoAluno_2.setBounds(26, 84, 166, 25);
		panel.add(lblTurmaDoAluno_2);

		lblSituao = new JLabel("SITUAÇÃO:");
		lblSituao.setFont(new Font("Arial", Font.PLAIN, 16));
		lblSituao.setBounds(26, 166, 166, 25);
		panel.add(lblSituao);

		voltar = new JButton("Voltar a tela principal");
		voltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stiNome.setText("");
				stiTurma.setText("");
				stiSituacao.setText("");
				nometxt.setText("");
				turmatxt.setText("");
				panel.setVisible(false);
				notas.setVisible(false);
				principal.setVisible(true);
			}
		});
		voltar.setFont(new Font("Arial", Font.PLAIN, 16));
		voltar.setBounds(63, 271, 303, 35);
		panel.add(voltar);

		notas = new JPanel();
		notas.setBounds(0, 0, 424, 371);
		contentPane.add(notas);
		notas.setLayout(null);
		notas.setVisible(false);

		nota1 = new JTextField();
		nota1.setText("0");
		nota1.setHorizontalAlignment(SwingConstants.CENTER);
		nota1.setFont(new Font("Arial", Font.PLAIN, 16));
		nota1.setColumns(10);
		nota1.setBounds(287, 25, 93, 35);
		notas.add(nota1);

		lblNomeDoAluno_1 = new JLabel("NOTA DO PRIMEIRO BIMESTRE:");
		lblNomeDoAluno_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNomeDoAluno_1.setBounds(40, 30, 340, 25);
		notas.add(lblNomeDoAluno_1);

		nota2 = new JTextField();
		nota2.setText("0");
		nota2.setHorizontalAlignment(SwingConstants.CENTER);
		nota2.setFont(new Font("Arial", Font.PLAIN, 16));
		nota2.setColumns(10);
		nota2.setBounds(287, 90, 93, 35);
		notas.add(nota2);

		lblNomeDoAluno_5 = new JLabel("NOTA DO SEGUNDO BIMESTRE:");
		lblNomeDoAluno_5.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNomeDoAluno_5.setBounds(40, 95, 340, 25);
		notas.add(lblNomeDoAluno_5);

		lblNomeDoAluno_2 = new JLabel("NOTA DO TERCEIRO BIMESTRE:");
		lblNomeDoAluno_2.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNomeDoAluno_2.setBounds(40, 150, 340, 25);
		notas.add(lblNomeDoAluno_2);

		nota3 = new JTextField();
		nota3.setText("0");
		nota3.setHorizontalAlignment(SwingConstants.CENTER);
		nota3.setFont(new Font("Arial", Font.PLAIN, 16));
		nota3.setColumns(10);
		nota3.setBounds(287, 145, 93, 35);
		notas.add(nota3);

		lblNomeDoAluno_3 = new JLabel("NOTA DO QUARTO BIMESTRE:");
		lblNomeDoAluno_3.setForeground(new Color(0, 0, 0));
		lblNomeDoAluno_3.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNomeDoAluno_3.setBounds(40, 215, 340, 25);
		notas.add(lblNomeDoAluno_3);

		nota4 = new JTextField();
		nota4.setText("0");
		nota4.setHorizontalAlignment(SwingConstants.CENTER);
		nota4.setFont(new Font("Arial", Font.PLAIN, 16));
		nota4.setColumns(10);
		nota4.setBounds(287, 210, 93, 35);
		notas.add(nota4);
		notas.setBackground(Color.WHITE);

		caluNota = new JButton("Calcular Nota");
		caluNota.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cm.cadastrarNota(nometxt.getText(), turmatxt.getText(), Float.parseFloat(nota1.getText()), Float.parseFloat(nota2.getText()), Float.parseFloat(nota3.getText()), Float.parseFloat(nota4.getText()));
				cm.mediaAritimetica();
				principal.setVisible(false);
				notas.setVisible(false);
				panel.setVisible(true);
				stiNome.setText(nometxt.getText());
				stiTurma.setText(turmatxt.getText());
				stiSituacao.setText(cm.verificarAprovado());
			}
		});
		caluNota.setFont(new Font("Arial", Font.PLAIN, 16));
		caluNota.setBounds(63, 271, 303, 35);
		notas.add(caluNota);
	}
}
