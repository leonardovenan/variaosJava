package testeproj;

import java.util.*;

public class Usuario {
	Scanner input = new Scanner(System.in);	
	
	private String nome;
	private String cpf;
	private String login;
	private String senha;
	private String maius;
	private String minus;
	private String aux;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMinus() {
		return minus;
	}
	public void setMinus(String minus) {
		this.minus = minus;
	}
	public String getMaius() {
		return maius;
	}
	public void setMaius(String maius) {
		this.maius = maius;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getAux() {
		return aux;
	}
	public void setAux(String aux) {
		this.aux = aux;
	}
		
	public void caixaAlta() {
		System.out.println("Digite o seu nome: ");
		setNome(input.nextLine());		
		setMaius(nome.toUpperCase());
		setNome(maius);
		System.out.println(getNome());
	}
	
	public void verTamSenha() {
		if(senha.length() > 12) {
			System.out.println("Senha muito grande, tente novamente! (máximo 12 caracteres)");
		}else {
			System.out.println("Senha salva com sucesso!");
		}
	}
	
	public void geraUser() {
		System.out.println("Digite seu cpf: ");
		setCpf(input.nextLine());
		
		setAux(getCpf().replaceAll("[^0-9]", ""));
		
		setLogin(getAux());
		
		System.out.println("Seu login foi gerado como " +getLogin());		
	}
	
	public void status() {
		System.out.println("Seu Login é: " +getLogin());
		System.out.println("Seu CPF é: " +getCpf());
		System.out.println("Seu nome é: " +getNome());
		System.out.println("Sua senha é: " +getSenha());
	}
	
}
