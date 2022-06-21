package com.rnj.ddangily.service;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.rnj.ddangily.dao.MasterConfigDao;
import com.rnj.ddangily.entity.MasterConfig;
import com.rnj.ddangily.model.Constants;
import com.rnj.ddangily.utils.HttpUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class TokenServiceImpl implements TokenService {

    @Autowired
    MasterConfigDao masterConfigDao;

    @Override
    public void reloadToken() {

        Optional<MasterConfig> masterConfigData = masterConfigDao.selectByMasterKey("access_token");
        if (!masterConfigData.isPresent()) {
            log.error("ACCESS TOKEN IS NULL!!!");
            return;
        }


        MasterConfig masterConfig = masterConfigData.get();
        String oldToken = masterConfig.getMasterValue();

        String requestUrl = Constants.ACCESS_TOKEN_URL.replace("{long-lived-access-token}", oldToken);
        String responseStr = HttpUtils.sendAndGetResponse(requestUrl);
        log.debug("responseStr: [{}]");

        Gson gson = new Gson();
        JsonObject obj = gson.fromJson(responseStr, JsonObject.class);
        String newAccessToken = obj.get("access_token").getAsString();
        masterConfig.setMasterValue(newAccessToken);
    }
}
