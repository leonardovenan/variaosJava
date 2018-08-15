package projcan;

public class Caneta {
	String cor;
	String marca;
	float ponta;
	int carga;
	boolean destampada;
	
	void status() {//syso
		System.out.println("Essa caneta é da cor "+ this.cor);
		System.out.println("A marca dessa caneta é " + this.marca);
		System.out.println("Essa caneta esta com "+ this.carga +"% de carga");
		System.out.println("Essa caneta tem uma ponta "+ this.ponta);
		
		if(destampada == true) {
			System.out.println("A caneta está destampada!");
		}else {
			System.out.println("Caneta está tampada!");
		}
	}
	
	void tampar() {
		destampada = false;
	}
	
	void destampar() {
		destampada = true;
	}
	
	void rabiscar() {
		if(destampada==false) {
			System.out.println("Erro! Caneta tampada!");
		}else {
			System.out.println("Caneta pode rabiscar");
		}
	}

}
