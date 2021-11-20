package com.rnj.ddangily.service;


import com.rnj.ddangily.dao.MasterConfigDao;
import com.rnj.ddangily.dao.MasterConfigDaoImpl;
import com.rnj.ddangily.model.Constants;
import com.rnj.ddangily.model.MasterConfig;
import com.rnj.ddangily.model.MasterConfigExample;
import com.rnj.ddangily.persistence.MasterConfigMapper;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;


import java.io.*;
import java.net.URL;
import java.util.List;

@Service
public class MasterConfigServiceImpl implements MasterConfigService{

    Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @Autowired
    MasterConfigMapper masterConfigMapper;

    @Autowired
    MasterConfigDao masterConfigDao;

    @Autowired
    HttpService httpService;

    /*
    * TOKEN UPDATE
    * */
    @Override
    public void refreshToken() {

        String refreshTokenUrl = getRefreshTokenUrl();
        StringBuffer response = httpService.sendGetRequest(refreshTokenUrl);

        /* UPDATE TOKEN */
        JSONObject newTkInfo = (JSONObject) JSONValue.parse(response.toString());
        MasterConfig masterConfig = new MasterConfig();
        masterConfig.setMasterValue((String) newTkInfo.get(Constants.ACCESS_TOKEN));
        masterConfigDao.updateToken(masterConfig);

        logger.debug("nothing");
    }


    public String getRefreshTokenUrl(){
        String accessTokenUrl = "";
        String oldToken = "";
        List<MasterConfig> configList = masterConfigDao.selectAll();
        for (MasterConfig config : configList){
            switch (config.getMasterKey()){
                case Constants.ACCESS_TOKEN_URL: accessTokenUrl = config.getMasterValue(); break;
                case Constants.ACCESS_TOKEN: oldToken = config.getMasterValue(); break;
                default : logger.debug("WE DON'T USE THE KEY IN HERE: [{}]",config.getMasterKey());
            }
        }
        return accessTokenUrl.replace("{long-lived-access-token}",oldToken);
    }

    @Override
    public String getDataUrl() {
        String accessToken = "";
        String userId = "";
        String dataUrl = "";
        List<MasterConfig> configList = masterConfigDao.selectAll();
        for (MasterConfig config : configList){
            switch (config.getMasterKey()){
                case Constants.USER_ID: userId = config.getMasterValue(); break;
                case Constants.ACCESS_TOKEN: accessToken = config.getMasterValue(); break;
                case Constants.POST_REQUEST_URL: dataUrl = config.getMasterValue(); break;
                default : logger.debug("WE DON'T USE THE KEY IN HERE: [{}]",config.getMasterKey());
            }
        }
        return dataUrl.replace("{user_id}",userId).replace("{access_token}",accessToken);
    }



}
