package com.rnj.ddangily.persistence;

import com.rnj.ddangily.model.Instagram;
import com.rnj.ddangily.model.InstagramExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface InstagramMapper {
    long countByExample(InstagramExample example);

    int deleteByExample(InstagramExample example);

    int deleteByPrimaryKey(Long instagramId);

    int insert(Instagram record);

    int insertSelective(Instagram record);

    List<Instagram> selectByExample(InstagramExample example);

    Instagram selectByPrimaryKey(Long instagramId);

    int updateByExampleSelective(@Param("record") Instagram record, @Param("example") InstagramExample example);

    int updateByExample(@Param("record") Instagram record, @Param("example") InstagramExample example);

    int updateByPrimaryKeySelective(Instagram record);

    int updateByPrimaryKey(Instagram record);
}