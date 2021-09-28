package com.rnj.ddangily.persistence;

import com.rnj.ddangily.model.MasterConfig;
import java.util.List;

public interface MasterConfigMapper {
    int deleteByPrimaryKey(Long masterConfigId);

    int insert(MasterConfig record);

    MasterConfig selectByPrimaryKey(Long masterConfigId);

    List<MasterConfig> selectAll();

    int updateByPrimaryKey(MasterConfig record);
}