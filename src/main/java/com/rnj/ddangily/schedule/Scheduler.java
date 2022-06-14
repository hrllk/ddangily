package com.rnj.ddangily.schedule;

import com.rnj.ddangily.service.MasterConfigService;
import com.rnj.ddangily.service.UpdatePostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;


@Component
public class Scheduler {

    Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @Autowired
    MasterConfigService masterConfigService;

    @Autowired
    UpdatePostService updatePostService;

    /***
     * 주기적으로 API 호출, 게시물을 가져오는 역할
     */

//    @Scheduled(fixedDelay = 5000)
//    public void refreshToken(){
//        StopWatch watch = new StopWatch();
//        watch.start();
//        logger.debug("START TIME OF REFRESH TOKEN: [{}]",watch.getTotalTimeMillis());
//        masterConfigService.refreshToken();
//        watch.stop();
//        logger.debug("END TIME OF REFRESH TOKEN: [{}]",watch.getTotalTimeMillis());
//    }

    @Scheduled(fixedDelay = 60000) // 3
    public void updateInstagramPosts(){
//        StopWatch watch = new StopWatch();
//        watch.start();
//        logger.debug("START TIME OF UPDATE INSTAGRAM POSTS: [{}]",watch.getTotalTimeMillis());
//        updatePostService.updateInstagramPosts();
//        watch.stop();
//        logger.debug("END TIME OF UPDATE INSTAGRAM POSTS: [{}]",watch.getTotalTimeMillis());
    }
}
