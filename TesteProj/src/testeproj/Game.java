package testeproj;

import javax.swing.JOptionPane;

public class Game {
	private int randomNumb = (int) Math.ceil(Math.random()*15);
	private int cont = 1;
	private String resp;	
	private Object [] opcoes = {"0","1","2","3","4","5","6","7","8","9","10", "11","12","13","14","15"};
	
	public void metGame() {
		while(true) {
			resp = (String) JOptionPane.showInputDialog(null, "Em que número máquina está pensando?", "Adivinhação",
					JOptionPane.QUESTION_MESSAGE, null, opcoes, null);			
			if(resp == null) {
				JOptionPane.showMessageDialog(null, "Game Over!\nVocê é fraco e desistiu do jogo!");
				break;
			}
			if(Integer.valueOf(resp) > randomNumb) {
				JOptionPane.showMessageDialog(null, "QUASE!\n O número é menor que "+resp);
				cont += 1;
			}else if(Integer.valueOf(resp) < randomNumb) {
				JOptionPane.showMessageDialog(null, "QUASE!\n O número é maior que "+resp);
				cont += 1;
			}else {
				JOptionPane.showMessageDialog(null, "Parabéns!!! Você adivinhou o número certo em "+cont+" tentativas!! \n"
						+"O número pensado foi o "+randomNumb+"!!!");
				break;
			}
		}
	}
	
}
