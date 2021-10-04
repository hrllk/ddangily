package com.rnj.ddangily.schedule;

import com.rnj.ddangily.model.MasterConfig;
import com.rnj.ddangily.model.MasterConfigExample;
import com.rnj.ddangily.persistence.InstagramMapper;
import com.rnj.ddangily.persistence.MasterConfigMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

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
        MasterConfigExample example = new MasterConfigExample();
        example.createCriteria().andMasterKeyEqualTo("tokenRefreshUrl");
        List<MasterConfig> masterConfigList = masterConfigMapper.selectByExample(example);
        logger.debug("masterConfigList : [{}]", masterConfigList);


    }

    @Scheduled(fixedDelay = 5000)
    public void updateInstagramData(){
        logger.debug("START UPDATE INSTAGRAM DATA");
//        instagramMapper.select






    }
}
