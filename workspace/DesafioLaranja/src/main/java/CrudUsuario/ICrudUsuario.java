package CrudUsuario;

import java.util.List;

import desafio_Laranja.Usuario;

public interface ICrudUsuario {

	public boolean salvarUsuario(Usuario usuario);
	public boolean deletarUsuarioPorEmail(String email , String nome );
	public List<Usuario> ListarUsuario();
	public boolean alteraUsuario();
	
	
}