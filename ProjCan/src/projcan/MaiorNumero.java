package projcan;

import java.util.Scanner;

public class MaiorNumero {
	Scanner sc = new Scanner(System.in);
	
	int v1;
	int v2;
	
	void compara��o(){
		System.out.println("Digite o primeiro n�mero: ");
		v1 = sc.nextInt();
		System.out.println("Digite o primeiro n�mero: ");
		v2 = sc.nextInt();
		
		if(v1>v2) {
			System.out.println("O primeiro valor � o maior: "+ this.v1);
		}else {
			System.out.println("O segundo valor � o maior: "+ this.v2);
		}
	}
	
	
}
