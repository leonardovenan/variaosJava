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
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.border.EtchedBorder;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;

public class BaseAnt extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	private String colunas[] = {"CPF", "Nome", "Agencia", "Cidade", "UF Cliente"};
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
					BaseAnt frame = new BaseAnt();
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
	public BaseAnt() {
		setTitle("Base Antiga");
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
		
		JComboBox<String> comboBox_1 = new JComboBox(itens);
		comboBox_1.setFont(new Font("Arial", Font.BOLD, 15));
		comboBox_1.setBounds(922, 131, 55, 26);
		contentPane.add(comboBox_1);
		btnVoltar.setForeground(Color.BLUE);
		btnVoltar.setFont(new Font("Arial", Font.BOLD, 12));
		btnVoltar.setBounds(10, 11, 75, 23);
		contentPane.add(btnVoltar);
		
		textField = new JTextField();
		textField.setText("");
		textField.setFont(new Font("Arial", Font.PLAIN, 15));
		textField.setColumns(10);
		textField.setBounds(260, 131, 116, 26);
		contentPane.add(textField);
		
		JPanel panel = new JPanel();
		panel.setBorder(new CompoundBorder());
		panel.setBounds(169, 131, 81, 26);
		contentPane.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel label = new JLabel("Agência:");
		label.setFont(new Font("Arial", Font.BOLD, 15));
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new CompoundBorder());
		panel_1.setBounds(386, 131, 81, 26);
		contentPane.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel label_1 = new JLabel("Convênio:");
		label_1.setFont(new Font("Arial", Font.BOLD, 15));
		panel_1.add(label_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new CompoundBorder());
		panel_2.setBounds(612, 131, 55, 26);
		contentPane.add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel label_2 = new JLabel("Nome:");
		label_2.setFont(new Font("Arial", Font.BOLD, 15));
		panel_2.add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setText("");
		textField_1.setFont(new Font("Arial", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(477, 131, 125, 26);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("");
		textField_2.setFont(new Font("Arial", Font.PLAIN, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(677, 131, 190, 26);
		contentPane.add(textField_2);
		
		JButton button = new JButton("Filtrar");
		button.setFont(new Font("Arial", Font.BOLD, 12));
		button.setBounds(1137, 131, 81, 26);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Cancelar");
		button_1.setForeground(Color.RED);
		button_1.setFont(new Font("Arial", Font.BOLD, 12));
		button_1.setBounds(1038, 131, 89, 27);
		contentPane.add(button_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new CompoundBorder());
		panel_4.setBounds(877, 131, 55, 26);
		contentPane.add(panel_4);
		panel_4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel label_3 = new JLabel("UF:");
		label_3.setFont(new Font("Arial", Font.BOLD, 15));
		panel_4.add(label_3);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_3.setBounds(148, 108, 1103, 72);
		contentPane.add(panel_3);
		
		JLabel lblAplicaoDesktop = new JLabel("Aplica\u00E7\u00E3o Desktop");
		lblAplicaoDesktop.setFont(new Font("Arial", Font.PLAIN, 11));
		lblAplicaoDesktop.setForeground(Color.GRAY);
		lblAplicaoDesktop.setBounds(667, 656, 100, 14);
		contentPane.add(lblAplicaoDesktop);
		
		table = new JTable(dados, colunas);
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setFont(new Font("Arial", Font.PLAIN, 12));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"ID", "Nome", "Ag\u00EAncia", "Conv\u00EAnio", "UF Cliente", "Conta"
			}
		));
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setBounds(56, 229, 1229, 240);
		contentPane.add(table);
		
		JLabel label_4 = new JLabel("ID");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Arial", Font.BOLD, 14));
		label_4.setBounds(56, 201, 208, 17);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("Nome");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Arial", Font.BOLD, 14));
		label_5.setBounds(260, 201, 205, 17);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("Agência");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Arial", Font.BOLD, 14));
		label_6.setBounds(466, 201, 205, 17);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("Convênio");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Arial", Font.BOLD, 14));
		label_7.setBounds(672, 201, 205, 17);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("UF Cliente");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Arial", Font.BOLD, 14));
		label_8.setBounds(875, 201, 205, 17);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("Conta");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setFont(new Font("Arial", Font.BOLD, 14));
		label_9.setBounds(1081, 201, 204, 17);
		contentPane.add(label_9);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_5.setBounds(56, 191, 1229, 38);
		contentPane.add(panel_5);
		
		JLabel label_10 = new JLabel("Base Antiga");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setFont(new Font("Arial", Font.BOLD, 19));
		label_10.setBounds(10, 33, 1330, 23);
		contentPane.add(label_10);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_6.setBounds(536, 11, 278, 70);
		contentPane.add(panel_6);
	}
}
