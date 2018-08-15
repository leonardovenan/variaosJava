package projcan;

import java.util.Scanner;

public class MediaAluno {
	Scanner sc = new Scanner(System.in);
	
	int i;
	int n = 3;
	int [] notas = new int[n];
	float mediaNotas;
	int cont = 0;
	boolean erro;
	
	void addNotas(){
		for(i=0; i<n; i++) {
			System.out.println("Digite a nota "+ (i+1) + " do aluno: ");
			notas[i] = sc.nextInt();
			if(notas[i]<0 || notas[i]>100) {
				System.out.println("Valor de nota invalido, por favor digite um valor de 0 a 100!");
				erro = true;
				break;
			}else {
				
			}
		}
	}
	
	void media() {
		if(erro==true) {
			System.out.println("Erro! Média indisponpivel!");
		}else {
			for(i=0; i<3; i++) {
				cont += notas[i];
			}
			mediaNotas = cont/3.0f;
			System.out.println("Esse aluno ficou com média = " +this.mediaNotas);			
		}
	}
}
