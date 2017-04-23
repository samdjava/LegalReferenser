package com.nyaaya.services;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by Samnbuddha
 */

@Path("/nyaaya")
@Produces("application/json")
public interface BotCommunicationServices {

    @GET
    @Path("/ping")
    String ping();

}
