package classmet;

public class Caneta {
	public String modelo;
	private float ponta;
	private boolean tampada;
	private String cor;
	
	public Caneta(String m, String c, float p) { //m�todo contrutor 
		this.cor = c;							//� o mesmo m�todo que tem o nome da classe
		this.modelo = m;
		this.ponta = p;
		this.tampar();
	}
	
	public String getModelo() { // pegar uma informa��o
		return this.modelo;
	}
	
	public void setModelo(String m) { // enviar uma informa��o
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
		System.out.println("A cor da caneta �: " +this.cor);
		System.out.println("A caneta est� tampada: " +this.tampada);
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
}
