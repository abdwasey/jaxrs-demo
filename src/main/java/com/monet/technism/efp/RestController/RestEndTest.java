package com.monet.technism.efp.RestController;

import javax.faces.bean.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RequestScoped
@Path("wasay")
public class RestEndTest {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String listAllMembers() {
        return "wasa";
    }
}
