package com.rnj.ddangily.repository;

import com.rnj.ddangily.entity.Instagram;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;


public interface InstagramRepository extends Repository<Instagram, Long> {
    Optional<Instagram> findById(Long id);

    Optional<Instagram> findInstagramByInstagramId(Long instagramId);

    void save(Instagram instagram);
//    void persist(Instagram instagram);

    Optional<List<Instagram>> findAll();


//    void
}
