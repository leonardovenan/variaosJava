package testeproj;

import javax.swing.JOptionPane;

public class Tabajara {
	private int qtaFunc, i;
	private double total = 0;
	private double salario, mediaSalarial = 0;
	
	public void mediaDeSalarios() {
		qtaFunc = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de funcionários da empresa: "));
		
		for(i = 1; i<= qtaFunc; i++) {
			salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do " +i+ "º funcionário: "));
			total += salario;
		}
		mediaSalarial = (total/qtaFunc);
				
		JOptionPane.showMessageDialog(null, "A média salaria da empresa é de R$ " +mediaSalarial);		
	}
}
