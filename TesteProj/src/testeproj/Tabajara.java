package testeproj;

import javax.swing.JOptionPane;

public class Tabajara {
	private int qtaFunc, i;
	private double total = 0;
	private double salario, mediaSalarial = 0;
	
	public void mediaDeSalarios() {
		qtaFunc = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de funcion�rios da empresa: "));
		
		for(i = 1; i<= qtaFunc; i++) {
			salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o sal�rio do " +i+ "� funcion�rio: "));
			total += salario;
		}
		mediaSalarial = (total/qtaFunc);
				
		JOptionPane.showMessageDialog(null, "A m�dia salaria da empresa � de R$ " +mediaSalarial);		
	}
}
