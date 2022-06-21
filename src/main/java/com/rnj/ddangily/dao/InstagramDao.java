package com.rnj.ddangily.dao;

import com.rnj.ddangily.entity.Instagram;
import com.rnj.ddangily.repository.InstagramRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class InstagramDao {

    @Autowired
    InstagramRepository instagramRepository;

    public Optional<List<Instagram>> selectAll(){
        return instagramRepository.findAll();
    }
    public Optional<Instagram> selectById(Long id) {
        return instagramRepository.findById(id);
    }

    public Optional<Instagram> selectByInstagramId(Long instagramId) {
        return instagramRepository.findInstagramByInstagramId(instagramId);
    }

    public void insert(Instagram instagram){
        instagramRepository.save(instagram);
    }


}
