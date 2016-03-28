package br.com.kimae.teste.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello")
public class HelloWorld {
    @GET
    @Produces("text/plain")
    public String getClichedMessage() {
        return "It's me you are looking for?";
    }
}