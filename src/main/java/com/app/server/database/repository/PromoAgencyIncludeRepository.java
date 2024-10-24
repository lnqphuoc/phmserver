package com.app.server.database.repository;

import com.app.server.data.entity.PromoAgencyIncludeEntity;
import com.app.server.data.entity.PromoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PromoAgencyIncludeRepository extends JpaRepository<PromoAgencyIncludeEntity, Integer> {
    List<PromoAgencyIncludeEntity> findAll();
}