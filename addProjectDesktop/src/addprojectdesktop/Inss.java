package addprojectdesktop;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import java.awt.FlowLayout;
import javax.swing.border.EtchedBorder;
import javax.swing.SwingConstants;

public class Inss extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTable table;
	private String colunas[] = {"CPF", "Nome", "Agência", "Cidade",  "UF Cliente"};
	Object [] [] dados = {};
	Object[] itens = {"AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", 
			"MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" };

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inss frame = new Inss();
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
	public Inss() {
		setTitle("INSS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1366, 720);
		setVisible(true);
		setLocationRelativeTo(null);
		setExtendedState(Frame.MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setBorder(new MatteBorder(5, 0, 1, 1, (Color) new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InicialPage frame = new InicialPage(); 
				frame.setVisible(true);
				frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
				dispose();
			}
		});
		btnVoltar.setForeground(Color.BLUE);
		btnVoltar.setFont(new Font("Arial", Font.BOLD, 12));
		btnVoltar.setBounds(10, 11, 75, 23);
		contentPane.add(btnVoltar);
		
		JLabel lblAplicaoDesktop = new JLabel("Aplica\u00E7\u00E3o Desktop");
		lblAplicaoDesktop.setFont(new Font("Arial", Font.PLAIN, 11));
		lblAplicaoDesktop.setForeground(Color.GRAY);
		lblAplicaoDesktop.setBounds(667, 656, 100, 14);
		contentPane.add(lblAplicaoDesktop);
		
		JComboBox comboBox = new JComboBox(itens);
		comboBox.setFont(new Font("Arial", Font.BOLD, 15));
		comboBox.setBounds(831, 123, 56, 26);
		contentPane.add(comboBox);
		
		textField = new JTextField();
		textField.setText("");
		textField.setFont(new Font("Arial", Font.PLAIN, 15));
		textField.setColumns(10);
		textField.setBounds(296, 123, 95, 26);
		contentPane.add(textField);
		
		JPanel panel = new JPanel();
		panel.setBorder(new CompoundBorder());
		panel.setBounds(210, 123, 70, 26);
		contentPane.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel label = new JLabel("Ag\u00EAncia:");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Arial", Font.BOLD, 15));
		panel.add(label);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new CompoundBorder());
		panel_2.setBounds(416, 123, 128, 26);
		contentPane.add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel label_2 = new JLabel("Nome Segurado:");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Arial", Font.BOLD, 15));
		panel_2.add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setText("");
		textField_2.setFont(new Font("Arial", Font.PLAIN, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(554, 123, 232, 26);
		contentPane.add(textField_2);
		
		JButton button = new JButton("Filtrar");
		button.setFont(new Font("Arial", Font.BOLD, 12));
		button.setBounds(1079, 123, 81, 26);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Cancelar");
		button_1.setForeground(Color.RED);
		button_1.setFont(new Font("Arial", Font.BOLD, 12));
		button_1.setBounds(980, 123, 89, 27);
		contentPane.add(button_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new CompoundBorder());
		panel_3.setBounds(796, 123, 34, 26);
		contentPane.add(panel_3);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel label_3 = new JLabel("UF:");
		label_3.setFont(new Font("Arial", Font.BOLD, 15));
		panel_3.add(label_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_4.setBounds(90, 100, 1103, 72);
		contentPane.add(panel_4);
		
		table = new JTable(dados, colunas);
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setFont(new Font("Arial", Font.PLAIN, 12));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"CPF", "Nome", "Ag\u00EAncia", "Cidade", "UF Cliente"
			}
		));
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setBounds(58, 221, 1229, 240);
		contentPane.add(table);
		
		JLabel label_1 = new JLabel("CPF");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Arial", Font.BOLD, 14));
		label_1.setBounds(58, 193, 244, 17);
		contentPane.add(label_1);
		
		JLabel label_4 = new JLabel("Nome");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Arial", Font.BOLD, 14));
		label_4.setBounds(305, 193, 245, 17);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("Agência");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Arial", Font.BOLD, 14));
		label_5.setBounds(550, 193, 245, 17);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("Cidade");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Arial", Font.BOLD, 14));
		label_6.setBounds(796, 193, 245, 17);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("UF Cliente");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Arial", Font.BOLD, 14));
		label_7.setBounds(1043, 193, 244, 17);
		contentPane.add(label_7);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBounds(58, 183, 1229, 38);
		contentPane.add(panel_1);
		
		JLabel label_8 = new JLabel("INSS");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Arial", Font.BOLD, 19));
		label_8.setBounds(10, 35, 1330, 23);
		contentPane.add(label_8);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_5.setBounds(538, 11, 278, 70);
		contentPane.add(panel_5);
	}
}
