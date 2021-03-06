package com.goblintech.api;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.goblintech.boundry.CreationService;


/*
* GenerationResource
*/
@Path("generation")
@RequestScoped
public class GenerationResource {
    
    @Inject
    CreationService creationService;

    @GET
    @Path("hello")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getHello(){
        return Response.ok("hello").build();
    }

    @GET
    @Path("Prime")
    @Produces(MediaType.APPLICATION_JSON)
    public String getPrimeNumbers(){
     return creationService.getPrimeNumbers().toString();
    }
}
