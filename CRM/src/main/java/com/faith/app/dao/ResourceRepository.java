package com.faith.app.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;

import com.faith.app.entity.Resource;


@Repository
public interface ResourceRepository extends JpaRepository<Resource,Long>{


}
