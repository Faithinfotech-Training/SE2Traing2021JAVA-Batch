package com.faith.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.faith.app.model.ResourceManagement;

public interface ResourceRepository extends JpaRepository<ResourceManagement, Long>{

}
