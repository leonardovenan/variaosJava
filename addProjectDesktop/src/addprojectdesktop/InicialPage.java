package addprojectdesktop;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.CompoundBorder;


//falta fazer as janelas serem responsivas

public class InicialPage extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InicialPage frame = new InicialPage();
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
	public InicialPage() {
		setTitle("Página Inicial");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1366, 720);
		setVisible(true);
		setLocationRelativeTo(null);
		setExtendedState(Frame.MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBaseAntiga = new JLabel("Base Antiga");
		lblBaseAntiga.setHorizontalAlignment(SwingConstants.CENTER);
		lblBaseAntiga.setBounds(10, 172, 669, 17);
		contentPane.add(lblBaseAntiga);
		lblBaseAntiga.setFont(new Font("Arial", Font.BOLD, 14));
		
		JButton bt1 = new JButton("");
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BaseAnt frame = new BaseAnt(); 
				frame.setVisible(true);
				frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
				dispose();
			}
		});
		bt1.setIcon(new ImageIcon("C:/Users/nogf000533/Desktop/imagens proj/dados.jpg"));
		bt1.setBounds(288, 200, 120, 120);
		getContentPane().add(bt1);
				
		JLabel label = new JLabel("Contratos");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Arial", Font.BOLD, 14));
		label.setBounds(689, 172, 651, 17);
		contentPane.add(label);
				
		JButton bt2 = new JButton("");
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ViewContrato frame = new ViewContrato(); 
				frame.setVisible(true);
				frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
				dispose();
			}
		});
		bt2.setIcon(new ImageIcon("C:/Users/nogf000533/Desktop/imagens proj/Contratos.png"));
		bt2.setBounds(963, 200, 110, 110);
		getContentPane().add(bt2);
		
		JLabel label_1 = new JLabel("INSS");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Arial", Font.BOLD, 14));
		label_1.setBounds(10, 401, 1330, 17);
		contentPane.add(label_1);
		
		JButton bt3 = new JButton("");
		bt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inss frame = new Inss(); 
				frame.setVisible(true);
				frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
				dispose();
			}
		});
		bt3.setIcon(new ImageIcon("C:/Users/nogf000533/Desktop/imagens proj/logo-inss-final.png"));
		bt3.setBounds(539, 429, 261, 82);
		getContentPane().add(bt3);					
		
		JLabel lblAplicaoDesktop = new JLabel("Aplica\u00E7\u00E3o Desktop");
		lblAplicaoDesktop.setHorizontalAlignment(SwingConstants.CENTER);
		lblAplicaoDesktop.setFont(new Font("Arial", Font.PLAIN, 11));
		lblAplicaoDesktop.setForeground(Color.GRAY);
		lblAplicaoDesktop.setBounds(10, 656, 1330, 14);
		contentPane.add(lblAplicaoDesktop);
		
		JLabel lblPginaInicial = new JLabel("    P\u00E1gina Inicial");
		lblPginaInicial.setHorizontalAlignment(SwingConstants.CENTER);
		lblPginaInicial.setBounds(10, 60, 1330, 31);
		contentPane.add(lblPginaInicial);
		lblPginaInicial.setFont(new Font("Arial", Font.BOLD, 19));
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(549, 39, 278, 70);
		contentPane.add(panel);
		
	}
}
