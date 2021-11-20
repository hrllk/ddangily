package com.rnj.ddangily.dao;


import com.rnj.ddangily.model.Instagram;
import com.rnj.ddangily.model.InstagramExample;
import com.rnj.ddangily.persistence.InstagramMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InstagramDaoImpl implements InstagramDao{

    Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @Autowired
    InstagramMapper instagramMapper;

    @Override
    public List<Instagram> selectList(long postId) {
//    public Instagram selectOne(long postId) {
        InstagramExample example = new InstagramExample();
        example.createCriteria()
                .andIdEqualTo(postId);
//        return instagramMapper.countByExample(example);
        return instagramMapper.selectByExample(example);
//        instagramMapper.select
//        return instagramMapper.selectByPrimaryKey(postId);
    }
}
