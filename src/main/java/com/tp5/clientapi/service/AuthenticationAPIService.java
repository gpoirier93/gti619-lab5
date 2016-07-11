package com.tp5.clientapi.service;

import com.tp5.clientapi.dto.SessionInfo;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/authentication")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface AuthenticationAPIService {

    @GET
    @Path("/login")
    SessionInfo loginProfileByCredentials(@QueryParam("username") String username,
                                          @QueryParam("password") String password);

    @GET
    @Path("/logout/{id_profile}")
    Boolean logoutProfile(@PathParam("id_profile") Integer profileId);
}
