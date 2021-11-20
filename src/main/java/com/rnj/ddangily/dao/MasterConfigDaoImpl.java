package com.rnj.ddangily.dao;

import com.rnj.ddangily.model.Constants;
import com.rnj.ddangily.model.Instagram;
import com.rnj.ddangily.model.MasterConfig;
import com.rnj.ddangily.model.MasterConfigExample;
import com.rnj.ddangily.persistence.MasterConfigMapper;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.slf4j.Logger;

import java.util.List;

@Repository
public class MasterConfigDaoImpl implements MasterConfigDao{

    Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @Autowired
    MasterConfigMapper masterConfigMapper;

//    @Override
//    public String getUserId() {
//        MasterConfigExample example = new MasterConfigExample();
//        example.createCriteria()
//                .andMasterKeyEqualTo("user_id");
//        return masterConfigMapper.selectByExample(example).get(0).getMasterValue();
//    }

//    @Override
//    public String getAccessToken() {
//        MasterConfigExample example = new MasterConfigExample();
//        example.createCriteria()
//                .andMasterKeyEqualTo(Constants.ACCESS_TOKEN);
//        return masterConfigMapper.selectByExample(example).get(0).getMasterValue();
//    }
//
//    @Override
//    public String getAccessTokenURL() {
//        MasterConfigExample example = new MasterConfigExample();
//        example.createCriteria()
//                .andMasterKeyEqualTo("access_token_url");
//        return masterConfigMapper.selectByExample(example).get(0).getMasterValue();
//    }
//
//    @Override
//    public String getPostRequestURL() {
//        MasterConfigExample example = new MasterConfigExample();
//        example.createCriteria()
//                .andMasterKeyEqualTo("post_request_url");
//        return masterConfigMapper.selectByExample(example).get(0).getMasterValue();
//    }
//
    @Override
    public void updateToken(MasterConfig masterConfig) {
        MasterConfigExample example = new MasterConfigExample();
        example.createCriteria()
                .andMasterKeyEqualTo(Constants.ACCESS_TOKEN);
        masterConfigMapper.updateByExampleSelective(masterConfig,example);
    }

    @Override
    public String selectByKey(String key) {
        MasterConfigExample example = new MasterConfigExample();
        example.createCriteria()
                .andMasterKeyEqualTo(key);
//        masterConfigMapper.selectByExample();
        return null;
    }

    @Override
    public List<MasterConfig> selectAll() {
        return masterConfigMapper.selectByExample(new MasterConfigExample());
    }
}
