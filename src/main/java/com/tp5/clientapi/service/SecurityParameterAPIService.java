package com.tp5.clientapi.service;

import com.tp5.clientapi.dto.SecurityParameter;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/security_parameters")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface SecurityParameterAPIService {

    @GET
    @Path("/{id_security_parameter}")
    SecurityParameter getSecurityParameter(@PathParam("id_security_parameter") Integer securityParameterId);

    @PUT
    @Path("/{id_security_parameter}")
    SecurityParameter update(@PathParam("id_security_parameter") Integer securityParameterId,
                             SecurityParameter securityParameter);
}
