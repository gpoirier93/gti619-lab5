package com.tp5.core.service;

import com.tp5.clientapi.dto.Profile;
import com.tp5.clientapi.dto.SessionInfo;
import com.tp5.clientapi.service.AuthenticationAPIService;
import com.tp5.core.model.ProfileEntity;
import com.tp5.core.repository.ProfileRepository;
import com.tp5.core.utils.CustomWebExceptionHandler;
import org.apache.commons.lang3.Validate;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.ws.rs.core.Response;

@Service
public class AuthenticationService implements AuthenticationAPIService {

    @Autowired
    private ProfileRepository profileRepository;

    @Autowired
    private Mapper mapper;

    @Override
    @Transactional
    public SessionInfo loginProfileByCredentials(String username, String password) {

        Validate.notNull(username, "Empty query param [username]");
        Validate.notNull(password, "Empty query param [password]");

        ProfileEntity profileEntity = profileRepository.findByUsernameAndPassword(username, password);

        if (profileEntity == null) {

            throw new CustomWebExceptionHandler(Response.Status.PRECONDITION_FAILED, "INVALID_CREDENTIALS");
        }

        SessionInfo sessionInfo = new SessionInfo();
        sessionInfo.setIdProfile(profileEntity.getIdProfile());
        sessionInfo.setIdRole(profileEntity.getRole().getIdRole());
        sessionInfo.setIdSession(1); // TODO
        sessionInfo.setToken("..."); // TODO

        return sessionInfo;
    }

    @Override
    @Transactional
    public Boolean logoutProfile(Integer profileId) {

        Validate.notNull(profileId, "Missing mandatory parameter [profileId]");

        return true;
    }
}
