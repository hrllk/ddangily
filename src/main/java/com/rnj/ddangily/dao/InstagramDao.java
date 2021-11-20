package com.rnj.ddangily.dao;

import com.rnj.ddangily.model.Instagram;

import java.util.List;

public interface InstagramDao {

//    long selectCount(long postId);
    List<Instagram> selectList(long postId);
//    Instagram selectOne(long postId);

}
