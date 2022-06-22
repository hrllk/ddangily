package com.rnj.ddangily.dao;

import com.rnj.ddangily.entity.MasterConfig;
//import com.rnj.ddangily.repository.MasterConfigRepository;
import com.rnj.ddangily.repository.MastserConfigRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//@RequiredArgsConstructor
@Repository
public class MasterConfigDao {

//    private final MasterConfigRepository masterConfigRepository;
    @Autowired
    MastserConfigRepository masterConfigRepository;

    public Optional<List<MasterConfig>> selectAll(){
//    public List<MasterConfig> selectAll(){
        return masterConfigRepository.findAll();
    }
    public Optional<MasterConfig> selectById(Long id) {
        return masterConfigRepository.findById(id);
    }

    public Optional<MasterConfig> selectByMasterKey(String key) {
        return masterConfigRepository.findByMasterKey(key);
    }

    public void insert(MasterConfig instagram){
        masterConfigRepository.save(instagram);
    }


}
