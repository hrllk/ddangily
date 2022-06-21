package com.rnj.ddangily.service;


import com.rnj.ddangily.dao.MasterConfigDao;
import com.rnj.ddangily.model.Constants;
import com.rnj.ddangily.entity.MasterConfig;
import com.rnj.ddangily.utils.HttpUtils;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Service
public class MasterConfigServiceImpl implements MasterConfigService {

    Logger logger = LoggerFactory.getLogger(this.getClass().getName());


    @Autowired
    MasterConfigDao masterConfigDao;


    @Override
    public String getDataUrl() {
        Optional<MasterConfig> masterConfigData = masterConfigDao.selectByMasterKey("access_token");
        if (masterConfigData.isPresent()) {
            String accessToken = masterConfigData.get().getMasterValue();
            return Constants.REQUEST_DATA_URL.replace("{access_token}", accessToken);
        }
        return null;
    }



}
