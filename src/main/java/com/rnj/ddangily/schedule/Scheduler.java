package com.rnj.ddangily.schedule;

import com.rnj.ddangily.persistence.InstagramMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduler {

    Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @Autowired
    InstagramMapper instagramMapper;

//    @Autowired
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


    }

    @Scheduled(fixedDelay = 5000)
    public void updateInstagramData(){
        logger.debug("START UPDATE INSTAGRAM DATA");
//        instagramMapper.select






    }
}
