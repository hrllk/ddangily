package com.rnj.ddangily.service;

import org.junit.After;
import org.junit.Before;
// jupiter == junit5 (jupiter가 아닌, 그냥 Test사용할경우(org.junit.Test) 의존성 주입이안된다. 음..
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

@SpringBootTest
public class InstagramServiceImplTest {

    @Autowired
    InstagramService instagramService;
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    @Commit
    public void updatePosts() {

        System.out.println("START UPDATE POSTS TEST");
        instagramService.updatePosts();
        System.out.println("END UPDATE POSTS TEST");

    }
}