package com.tp5.core.repository;

import com.tp5.core.model.ProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<ProfileEntity, Integer> {

    ProfileEntity findByUsernameAndPassword(String username, String password);
    Integer countByUsername(String username);
}
