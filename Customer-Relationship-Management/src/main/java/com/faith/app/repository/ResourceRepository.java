package com.faith.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.faith.app.model.Resource;

public interface ResourceRepository extends JpaRepository<Resource, Long>{

}
