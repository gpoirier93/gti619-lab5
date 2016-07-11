package com.tp5.config;

import com.tp5.core.service.AuthenticationService;
import com.tp5.core.service.ProfileService;
import com.tp5.core.service.SecurityParameterService;
import org.glassfish.jersey.server.ResourceConfig;

public class JerseyInitialization extends ResourceConfig {

    public JerseyInitialization() {

        register(CORSResponseFilter.class);

        register(ProfileService.class);
        register(SecurityParameterService.class);
        register(AuthenticationService.class);
    }
}