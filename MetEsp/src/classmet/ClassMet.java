package classmet;

public class ClassMet {

	public static void main(String[] args) {
		Caneta c1 = new Caneta("BIC", "Vermelha", 0.7f);
		
		//c1.setModelo("Bic");
		
		//c1.setPonta(0.5f);
	//	c1.ponta = 0.5f; tal linha não pode ser executa pois dentro da classe tal
		//atributo está privado, assim somente dentro da classe desse atributo
		//pode haver uma modificação ou citação do atributo
		
		c1.status();

	}

}
