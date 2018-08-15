package projcan;

import java.util.Scanner;

public class NumeroDecrescente {
	
	Scanner sc = new Scanner(System.in);
	
	int num;
	int cont;
	
	void decremento(){
		System.out.println("Digite o número inteiro que desejar: ");
		num = sc.nextInt();
		System.out.println(this.num);		
		while(num>0) {
			num--;
			System.out.println(this.num);
		}
	}

}
