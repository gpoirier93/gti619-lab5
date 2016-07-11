package com.tp5.core.service;

import com.tp5.clientapi.service.ProfileAPIService;
import com.tp5.clientapi.dto.Profile;
import com.tp5.core.model.ProfileEntity;
import com.tp5.core.model.SecurityParameterEntity;
import com.tp5.core.repository.ProfileRepository;
import com.tp5.core.utils.CustomWebExceptionHandler;
import org.apache.commons.lang3.Validate;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.ws.rs.core.Response;
import java.util.Date;

@Service
public class ProfileService implements ProfileAPIService {

    @Autowired
    private ProfileRepository profileRepository;

    @Autowired
    private Mapper mapper;

    @Override
    @Transactional
    public Profile create(Profile profile) {

        Validate.notNull(profile, "Empty body [profile]");

        if (profileRepository.countByUsername(profile.getUsername()) > 0) {

            throw new CustomWebExceptionHandler(Response.Status.PRECONDITION_FAILED, "USERNAME_ALREADY_EXIST");
        }

        ProfileEntity profileEntity = mapper.map(profile, ProfileEntity.class);

        profileEntity.setCreationDate(new Date());

        return mapper.map(profileRepository.save(profileEntity), Profile.class);
    }

    @Override
    @Transactional
    public Profile update(Integer profileId, Profile profile) {

        Validate.notNull(profileId, "Missing mandatory parameter [profileId]");
        Validate.notNull(profile, "Empty body [profile]");

        ProfileEntity oldProfile = profileRepository.findOne(profileId);

        if (!oldProfile.getUsername().equals(profile.getUsername())
            && profileRepository.countByUsername(profile.getUsername()) > 0) {

            throw new CustomWebExceptionHandler(Response.Status.PRECONDITION_FAILED, "USERNAME_ALREADY_EXIST");
        }

        ProfileEntity profileEntity = mapper.map(profile, ProfileEntity.class);

        profileEntity.setLastModificationDate(new Date());

        return mapper.map(profileRepository.save(profileEntity), Profile.class);
    }

    @Override
    @Transactional
    public Profile getProfile(Integer profileId) {

        Validate.notNull(profileId, "Missing mandatory parameter [profileId]");

        ProfileEntity profileEntity = profileRepository.findOne(profileId);

        return mapper.map(profileEntity, Profile.class);
    }
}
