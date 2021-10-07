package com.rnj.ddangily.schedule;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rnj.ddangily.model.MasterConfig;
import com.rnj.ddangily.model.MasterConfigExample;
import com.rnj.ddangily.persistence.InstagramMapper;
import com.rnj.ddangily.persistence.MasterConfigMapper;
import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

@Component
public class Scheduler {

    Logger logger = LoggerFactory.getLogger(this.getClass().getName());

//    @Autowired
//    InstagramMapper instagramMapper;

    @Autowired
    MasterConfigMapper masterConfigMapper;

    /***
     * 주기적으로 API 호출, 게시물을 가져오는 역할
     */
//    @Scheduled(fixedDelay = 5000)
    public void contentsServer(){
        System.out.println("hi, i'm sout :D");
        logger.debug("hi :)");
    }

    @Scheduled(fixedDelay = 5000)
    public void refreshToken(){
        logger.debug("START REFRESH TOKEN");
        /* REFRESH TOKEN */
        MasterConfigExample example = new MasterConfigExample();
        example.createCriteria().andMasterKeyEqualTo("tokenRefreshUrl");
        String refreshUrlBC = masterConfigMapper.selectByExample(example).get(0).getMasterValue();
        example = new MasterConfigExample();

        /* TOKEN */
        example.createCriteria().andMasterKeyEqualTo("token");
        String token = masterConfigMapper.selectByExample(example).get(0).getMasterValue();
        String reqUrlToRefresh = refreshUrlBC.replace("{long-lived-access-token}",token);

        /* REQUSET TO REFRESH */
        try {
            URL url = new URL(reqUrlToRefresh);
            URLConnection urlConnection = url.openConnection();
            Object query = urlConnection.getURL().getQuery();
            ObjectMapper om = new ObjectMapper();
//            JSONObject obj = new JSONObject();
            JSONObject obj = (JSONObject) om.convertValue(query, Map.class);
            System.out.println("hi");


//            String str = urlConnection.getURL().getQuery();
//            JSONObject obj = new JSONObject();

        } catch (IOException e) {
            e.printStackTrace();
        }
        logger.debug("reqUrlToRefresh:[{}]",reqUrlToRefresh);

    }

    @Scheduled(fixedDelay = 5000)
    public void updateInstagramData(){
        logger.debug("START UPDATE INSTAGRAM DATA");
//        instagramMapper.select






    }
}
