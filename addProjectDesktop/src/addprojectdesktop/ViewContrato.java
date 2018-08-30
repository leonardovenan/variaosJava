package addprojectdesktop;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import java.awt.FlowLayout;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.JTable;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.SwingConstants;

public class ViewContrato extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBanco;
	private JTextField txtBenef;
	private JTextField txtContrato;
	private JTable table;
	private String colunas[] = {"Banco", "Benefício", "Contrato"};
	Object [] [] dados = {};
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewContrato frame = new ViewContrato();
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
	public ViewContrato() {
		setTitle("Contratos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1366, 720);
		setVisible(true);
		setLocationRelativeTo(null);
		setExtendedState(Frame.MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setBorder(new MatteBorder(5, 0, 1, 1, (Color) new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtBanco = new JTextField();
		txtBanco.setFont(new Font("Arial", Font.PLAIN, 15));
		txtBanco.setText("");
		
		txtBanco.setBounds(241, 146, 208, 26);
		contentPane.add(txtBanco);
		txtBanco.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBorder(new CompoundBorder());
		panel.setBounds(150, 146, 81, 26);
		contentPane.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblBanco = new JLabel("Banco:");
		panel.add(lblBanco);
		lblBanco.setFont(new Font("Arial", Font.BOLD, 15));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new CompoundBorder());
		panel_1.setBounds(459, 146, 89, 26);
		contentPane.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel label = new JLabel("Benefício:");
		label.setFont(new Font("Arial", Font.BOLD, 15));
		panel_1.add(label);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new CompoundBorder());
		panel_2.setBounds(767, 146, 89, 26);
		contentPane.add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel label_1 = new JLabel("Contrato:");
		label_1.setFont(new Font("Arial", Font.BOLD, 15));
		panel_2.add(label_1);
		
		txtBenef = new JTextField();
		txtBenef.setText("");		
		txtBenef.setFont(new Font("Arial", Font.PLAIN, 15));
		txtBenef.setColumns(10);
		txtBenef.setBounds(558, 146, 199, 26);
		contentPane.add(txtBenef);
		
		txtContrato = new JTextField();
		txtContrato.setText("");
		txtContrato.setFont(new Font("Arial", Font.PLAIN, 15));
		txtContrato.setColumns(10);
		txtContrato.setBounds(866, 146, 143, 26);
		contentPane.add(txtContrato);
		
		JButton btnNewButton = new JButton("Filtrar");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(1118, 146, 81, 26);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtBanco.setText("");
				txtBenef.setText("");
				txtContrato.setText("");
			}
		});
		btnNewButton_1.setBounds(1019, 146, 89, 27);
		contentPane.add(btnNewButton_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_3.setBounds(129, 123, 1088, 72);
		contentPane.add(panel_3);
		
		table = new JTable(dados, colunas);
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setFont(new Font("Arial", Font.PLAIN, 12));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Banco", "Benef\u00EDcio", "Contrato"
			}
		));
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setBounds(62, 256, 1229, 240);
		contentPane.add(table);
		
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
		
		JLabel label_4 = new JLabel("Contrato");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(883, 227, 408, 18);
		contentPane.add(label_4);
		label_4.setFont(new Font("Arial", Font.BOLD, 15));
		
		JLabel label_2 = new JLabel("Banco");
		label_2.setBounds(62, 227, 408, 18);
		contentPane.add(label_2);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Arial", Font.BOLD, 15));
		
		JLabel label_3 = new JLabel("Benefício");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(472, 227, 408, 18);
		contentPane.add(label_3);
		label_3.setFont(new Font("Arial", Font.BOLD, 15));
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_7.setBounds(62, 218, 1229, 38);
		contentPane.add(panel_7);
		
		JLabel label_5 = new JLabel("Contrátos");
		label_5.setBounds(10, 45, 1330, 23);
		contentPane.add(label_5);
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Arial", Font.BOLD, 19));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_4.setBounds(542, 22, 278, 70);
		contentPane.add(panel_4);
	}
}
