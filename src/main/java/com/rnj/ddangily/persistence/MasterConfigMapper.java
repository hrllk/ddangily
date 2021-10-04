package com.rnj.ddangily.persistence;

import com.rnj.ddangily.model.MasterConfig;
import com.rnj.ddangily.model.MasterConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MasterConfigMapper {
    long countByExample(MasterConfigExample example);

    int deleteByExample(MasterConfigExample example);

    int deleteByPrimaryKey(Long masterConfigId);

    int insert(MasterConfig record);

    int insertSelective(MasterConfig record);

    List<MasterConfig> selectByExample(MasterConfigExample example);

    MasterConfig selectByPrimaryKey(Long masterConfigId);

    int updateByExampleSelective(@Param("record") MasterConfig record, @Param("example") MasterConfigExample example);

    int updateByExample(@Param("record") MasterConfig record, @Param("example") MasterConfigExample example);

    int updateByPrimaryKeySelective(MasterConfig record);

    int updateByPrimaryKey(MasterConfig record);
}