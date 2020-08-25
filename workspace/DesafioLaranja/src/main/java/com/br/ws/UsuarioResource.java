package com.br.ws;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import desafio_Laranja.Usuario;

@Path("/usuario")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public class UsuarioResource {	

	@POST
	@Path("/add/usuario")
	
	public Usuario add(Usuario obj) {
	
		return null;
	}

	@DELETE
	@Path("/remove/{id}")
	
	public Usuario remove(@PathParam("id") int id) {
		return null;
	}

	@PUT
	@Path("/update/")
	
	public Usuario update(Usuario obj) {
		return null;
	}

	@GET
	@Path("/get-by-id/{id}")
	
	public Usuario getById(@PathParam("id") int id) {
		return null;
	}

	@GET
	@Path("/get-usuarios/")
	 
	public List<Usuario> getAll() {
		
		ArrayList<Usuario> arrayList = new ArrayList<Usuario>();
		
		Usuario usuario = new Usuario();
		usuario.setNome("Teste");
		usuario.setemail("Teste@teste.coml.br");
		arrayList.add(usuario);		
		
		return arrayList;
	}

}
