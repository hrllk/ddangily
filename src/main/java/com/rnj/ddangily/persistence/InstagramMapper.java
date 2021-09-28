package com.rnj.ddangily.persistence;

import com.rnj.ddangily.model.Instagram;
import java.util.List;

public interface InstagramMapper {
    int deleteByPrimaryKey(Long instagramId);

    int insert(Instagram record);

    Instagram selectByPrimaryKey(Long instagramId);

    List<Instagram> selectAll();

    int updateByPrimaryKey(Instagram record);
}