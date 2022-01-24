package com.rnj.ddangily.controller;

import com.rnj.ddangily.model.Instagram;
import com.rnj.ddangily.model.InstagramExample;
import com.rnj.ddangily.persistence.InstagramMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/v1")
public class PostControllerREST {

    Logger logger = LoggerFactory.getLogger(PostControllerREST.class);

    @Autowired
    InstagramMapper instagramMapper;

    @GetMapping("/posts")
    public List<Instagram> getPosts(){

        logger.debug("HI, I'M POSTS");

        InstagramExample example = new InstagramExample();
        example.createCriteria()
                .andEnabledEqualTo((byte)1);
        return instagramMapper.selectByExample(example);
//        return "";
    }
}
