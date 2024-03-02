package com.deployment.vaadin.repository;

import com.deployment.vaadin.entity.DeploymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeploymentRepository extends JpaRepository<DeploymentEntity,Long> {
}
