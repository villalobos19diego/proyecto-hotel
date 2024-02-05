package com.villalobos19.hotel.repository;

import com.villalobos19.hotel.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;



public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(String role);


    boolean existsByName(String role);
}
