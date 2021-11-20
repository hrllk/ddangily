package com.rnj.ddangily.dao;

import com.rnj.ddangily.model.Instagram;
import com.rnj.ddangily.model.MasterConfig;

import java.util.List;

public interface MasterConfigDao {

//    String getUserId();

//    String getAccessToken();

//    String getAccessTokenURL();

//    String getPostRequestURL();

    void updateToken(MasterConfig masterConfig);

    String selectByKey(String key);

    List<MasterConfig> selectAll();
}
