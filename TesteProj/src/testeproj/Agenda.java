package testeproj;

import java.util.*;

public class Agenda {
	Scanner input = new Scanner(System.in);
	int n = 10;
	
	String [] Contato  = new String[n];
	private String pessoa;
	
	public String getPessoa() {
		return pessoa;
	}

	public void setPessoa(String pessoa) {
		this.pessoa = pessoa;
	}
	
	public void addCont() {
		System.out.println("Digite um novo contato: ");
		setPessoa(input.nextLine());
		
		int k = -1;
		
		for(int i =0; i< this.Contato.length; i++) {
			if(this.Contato[i] != null) {
				k += 1;
			}
		}
		setPessoa(this.Contato[k]);
	}
	
	public void status() {
		for(String s : this.Contato) {
			System.out.println(s);
		}
	}
}




