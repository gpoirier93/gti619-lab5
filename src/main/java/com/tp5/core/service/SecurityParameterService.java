package com.tp5.core.service;

import com.tp5.clientapi.dto.SecurityParameter;
import com.tp5.clientapi.service.SecurityParameterAPIService;
import com.tp5.core.model.SecurityParameterEntity;
import com.tp5.core.repository.SecurityParameterRepository;
import com.tp5.core.utils.CustomWebExceptionHandler;
import org.apache.commons.lang3.Validate;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.ws.rs.core.Response;
import java.util.Date;

@Service
public class SecurityParameterService implements SecurityParameterAPIService {

    @Autowired
    private SecurityParameterRepository securityParameterRepository;

    @Autowired
    private Mapper mapper;

    @Override
    @Transactional
    public SecurityParameter update(Integer securityParameterId, SecurityParameter securityParameter) {

        Validate.notNull(securityParameterId, "Missing mandatory parameter [securityParameterId]");
        Validate.notNull(securityParameter, "Empty body [securityParameter]");

        SecurityParameterEntity securityParameterEntity = mapper.map(securityParameter, SecurityParameterEntity.class);

        securityParameterEntity.setLastModificationDate(new Date());

        return mapper.map(securityParameterRepository.save(securityParameterEntity), SecurityParameter.class);
    }

    @Override
    @Transactional
    public SecurityParameter getSecurityParameter(Integer securityParameterId) {

        Validate.notNull(securityParameterId, "Missing mandatory parameter [securityParameterId]");

        SecurityParameterEntity securityParameterEntity = securityParameterRepository.findOne(securityParameterId);

        return mapper.map(securityParameterEntity, SecurityParameter.class);
    }
}
