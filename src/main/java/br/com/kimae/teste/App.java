package br.com.kimae.teste;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import br.com.kimae.teste.resource.HelloWorld;

@ApplicationPath("/")
public class App extends Application{
	 public Set<Class<?>> getClasses() {        
         Set<Class<?>> s = new HashSet<Class<?>>();
	     s.add(HelloWorld.class);
	     return s;
	 }
}
