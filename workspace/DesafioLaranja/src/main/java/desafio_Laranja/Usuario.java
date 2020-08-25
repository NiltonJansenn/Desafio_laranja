package desafio_Laranja;

public class Usuario {

	private String nome;
	public static String email;
	private int senha ;
	digitoUnico digioUnico = new digitoUnico();
	
	/*
	 *CRUD de usuário
	 *Deverá ser criado um CRUD para usuários.
	 *Um usuário possui nome, email e uma lista de resultados de
	 *digitoUnicos já calculados.
	 *Cada objeto da lista de resultados deverá conter quais os
	 *parâmetros de entrada do cálculo e qual o resultado.
	 */

	
	public Usuario() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static String getemail() {
		return email;
	}

	public void setemail(String email) {
		Usuario.email = email;
	}

	public void getdigitoUnico(int senha) {
		
		digitoUnico.digitoUnico(this.senha = senha);
	}

	public void setdigitoUnico(int senha) {
		
		digitoUnico.digitoUnico(this.senha = senha);
	}
	

}
