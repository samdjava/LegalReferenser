package com.nyaaya.services;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by Samnbuddha
 */

@Path("/nyaayaAdmin")
@Produces("application/json")
public interface AdminServices {

    @GET
    @Path("/ping")
    String ping();

    @GET
    @Path("/pullData")
    void pullDataToElasticSearch();


}
