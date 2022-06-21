package com.rnj.ddangily.repository;

import com.rnj.ddangily.entity.MasterConfig;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;


public interface MastserConfigRepository extends Repository<MasterConfig, Long> {
    Optional<MasterConfig> findById(Long id);

    Optional<MasterConfig> findByMasterKey(String key);

    void save(MasterConfig instagram);

    Optional<List<MasterConfig>> findAll();

}
