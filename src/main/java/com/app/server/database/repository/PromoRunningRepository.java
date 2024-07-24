package com.app.server.database.repository;

import com.app.server.data.entity.PromoEntity;
import com.app.server.data.entity.PromoRunningEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PromoRunningRepository extends JpaRepository<PromoRunningEntity, Integer> {
    List<PromoRunningEntity> findAll();
}