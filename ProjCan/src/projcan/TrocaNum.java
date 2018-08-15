package projcan;

import java.util.Scanner;

public class TrocaNum {
	
	Scanner sc = new Scanner(System.in);
	
	int NumA;
	int NumB;
	int aux;
	
	void troca() {
		System.out.println("Digite o primeiro valor: ");
		NumA = sc.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		NumB = sc.nextInt();
		
		aux = NumB;
		NumA = NumB;
		NumA = aux;
		
		System.out.println("Valores trocados: NumA = "+ this.NumA + " e NumB = " + this.NumB);
	}
	

}
