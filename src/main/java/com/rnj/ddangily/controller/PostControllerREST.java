package com.rnj.ddangily.controller;

import com.rnj.ddangily.entity.Instagram;
import com.rnj.ddangily.service.InstagramService;
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
    InstagramService instagramService;

    @GetMapping("/posts")
    public List<Instagram> getPosts(){

        logger.debug("HI, I'M POSTS");

        return instagramService.getPosts().get();
    }
}
