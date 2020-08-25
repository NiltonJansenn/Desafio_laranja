package CrudUsuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import desafio_Laranja.Usuario;
import desafio_Laranja.testeCrud;

/*  
 * Dígito Único
 *Definimos um dígito único de um inteiro usando as seguintes
 *regras:
 *Dado um inteiro, precisamos encontrar o dígito único do inteiro.
 *Se x tem apenas um dígito, então o seu dígito único é x.
 *Caso contrário, o dígito único de x é igual ao dígito único da
 *soma dos dígitos de x.
 *Por exemplo, o dígito único de 9875 será calculado como:
 *digito_unico(9875)9+8+7+5=29
 *digito_unico(29)2+9=11
 *digito_unico(11)1+1=2
 *digito_unico(2)=2
 *Dado dois números n e k, P deverá ser criado da concatenação da string
 *n * k.
 *Exemplo:
 *n=9875 e k=4 então p = 9875 9875 9875 9875
 *digitoUnico§ = digitoUnico(9875987598759875)
  */

public class CrudUsuario implements ICrudUsuario {

     private static Usuario Usuario = new Usuario ();
	List<Usuario> listaUsuarios = new ArrayList<Usuario>();
	Scanner teclado = new Scanner(System.in);
	 String nome;
     String email;
     String nome_novo;
     String email_novo;
	 int senha ;

	@Override
	public boolean salvarUsuario(Usuario usuario) {
		try {

			listaUsuarios.add(usuario);

		} catch (Exception e) {
			return false;
		}

		return true;
	}

	@Override
	public boolean deletarUsuarioPorEmail(String email , String nome  ) {
		  System.out.println("Digite nome que deseja excluir: ");			
			nome = teclado.nextLine();
          System.out.println("Digite o e-mail que seja excluir: ");			
			email= teclado.nextLine();
		
		for (int i=0 ; i< listaUsuarios.size() ;i++) {
			System.out.println("nome "+listaUsuarios.get(i).equals(nome));
			listaUsuarios.get(i);
			if (listaUsuarios.get(i).equals(email) && listaUsuarios.get(i).equals(nome)) {
				
				@SuppressWarnings({ "unlikely-arg-type", "unused" })
				boolean remove = listaUsuarios.remove(nome);
				@SuppressWarnings({ "unused", "unlikely-arg-type" })
				boolean remove2 = listaUsuarios.remove(email);
				listaUsuarios.remove(Usuario.getNome().contentEquals(nome));
				
				
			}
		}System.out.println("  foi deletado com sucesso !");

		return true;
	}

	@Override
	public List<Usuario> ListarUsuario() {
		return this.listaUsuarios;
	}

	@Override
	public boolean alteraUsuario() {		
		  System.out.println("Digite nome que deseja alterar: ");			
		  			nome = teclado.nextLine();
		  System.out.println("Digite o e-mail que seja alterar: ");			
		  			email= teclado.nextLine();
		  
		  System.out.println("Digite o novo nome : ");			
		  			nome_novo = teclado.nextLine();		 
		  System.out.println("Digite o novo email: ");			
		  			email_novo = teclado.nextLine();
		  			
		for (int i=0 ; i< listaUsuarios.size();i++) {
			if (Usuario.getemail().equals(email)) {				
				listaUsuarios.get(i).setNome(nome_novo);
				listaUsuarios.get(i).setemail(email_novo);						
			}
		}
		return false;
	}

	

}
