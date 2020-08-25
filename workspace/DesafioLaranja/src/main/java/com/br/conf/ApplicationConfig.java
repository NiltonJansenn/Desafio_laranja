package com.br.conf;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.jboss.resteasy.plugins.interceptors.CorsFilter;

import com.br.ws.UsuarioResource;

@ApplicationPath("/rest")
public class ApplicationConfig extends Application {

	private Set<Object> singletons = new HashSet<Object>();
	private Set<Class<?>> empty = new HashSet<Class<?>>();

	public ApplicationConfig() {
		singletons.add(UsuarioResource.class);

	}

	public Set<Object> getSingletons() {
		return singletons;
	}

	public Set<Class<?>> getEmpty() {
		return empty;
	}

}
