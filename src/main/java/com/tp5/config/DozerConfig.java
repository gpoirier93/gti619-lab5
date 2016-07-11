package com.tp5.config;

import com.tp5.clientapi.dto.Profile;
import com.tp5.clientapi.dto.Role;
import com.tp5.clientapi.dto.SecurityParameter;
import com.tp5.core.model.ProfileEntity;
import com.tp5.core.model.RoleEntity;
import com.tp5.core.model.SecurityParameterEntity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.dozer.loader.api.BeanMappingBuilder;

@Configuration
public class DozerConfig {

    @Bean
    public BeanMappingBuilder beanMappingBuilder() {
        BeanMappingBuilder builder = new BeanMappingBuilder() {
            protected void configure() {
                mapping(Role.class, RoleEntity.class);
                mapping(Profile.class, ProfileEntity.class);
                mapping(SecurityParameter.class, SecurityParameterEntity.class);
            }
        };

        return builder;
    }

    @Bean
    public Mapper mapper() {
        DozerBeanMapper mapper = new DozerBeanMapper();
        mapper.addMapping(beanMappingBuilder());

        return mapper;
    }
}
