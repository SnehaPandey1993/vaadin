package com.deployment.vaadin.repository;

import com.deployment.vaadin.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
