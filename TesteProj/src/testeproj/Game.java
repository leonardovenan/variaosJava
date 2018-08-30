package testeproj;

import javax.swing.JOptionPane;

public class Game {
	private int randomNumb = (int) Math.ceil(Math.random()*15);
	private int cont = 1;
	private String resp;	
	private Object [] opcoes = {"0","1","2","3","4","5","6","7","8","9","10", "11","12","13","14","15"};
	
	public void metGame() {
		while(true) {
			resp = (String) JOptionPane.showInputDialog(null, "Em que n�mero m�quina est� pensando?", "Adivinha��o",
					JOptionPane.QUESTION_MESSAGE, null, opcoes, null);			
			if(resp == null) {
				JOptionPane.showMessageDialog(null, "Game Over!\nVoc� � fraco e desistiu do jogo!");
				break;
			}
			if(Integer.valueOf(resp) > randomNumb) {
				JOptionPane.showMessageDialog(null, "QUASE!\n O n�mero � menor que "+resp);
				cont += 1;
			}else if(Integer.valueOf(resp) < randomNumb) {
				JOptionPane.showMessageDialog(null, "QUASE!\n O n�mero � maior que "+resp);
				cont += 1;
			}else {
				JOptionPane.showMessageDialog(null, "Parab�ns!!! Voc� adivinhou o n�mero certo em "+cont+" tentativas!! \n"
						+"O n�mero pensado foi o "+randomNumb+"!!!");
				break;
			}
		}
	}
	
}
