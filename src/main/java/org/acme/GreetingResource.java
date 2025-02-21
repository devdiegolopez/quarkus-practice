package org.acme;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.logging.Logger;

@Path("/hello")
public class GreetingResource {

    private static final Logger LOG = Logger.getLogger(String.valueOf(GreetingResource.class));

    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public String resources(@FormParam("name") String name
    , @FormParam("cardNo") String cardNo
    , @FormParam("zip") String zip) {

        LOG.info(name + " " + cardNo + " " + zip);

        return name + " " + cardNo + " " + zip;
    }
    @GET
    public String resourcesQuery(@QueryParam("name") String name
    , @QueryParam("cardNo") String cardNo
    , @QueryParam("zip") String zip) {
        LOG.info(name + " " + cardNo + " " + zip);
        return name + " " + cardNo + " " + zip;
    }
}