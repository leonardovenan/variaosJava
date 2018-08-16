package classmet;

public class Caneta {
	public String modelo;
	private float ponta;
	private boolean tampada;
	private String cor;
	
	public Caneta(String m, String c, float p) { //método contrutor 
		this.cor = c;							//é o mesmo método que tem o nome da classe
		this.modelo = m;
		this.ponta = p;
		this.tampar();
	}
	
	public String getModelo() { // pegar uma informação
		return this.modelo;
	}
	
	public void setModelo(String m) { // enviar uma informação
		this.modelo = m;
	}
	
	public float getPonta() {
		return this.ponta;
	}
	public void setPonta(float p) {
		this.ponta = p;
	}
	
	public void status() {
		System.out.println("Modelo da caneta: "+this.modelo);
		System.out.println("Ponta: "+this.ponta);
		System.out.println("A cor da caneta é: " +this.cor);
		System.out.println("A caneta está tampada: " +this.tampada);
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
}
