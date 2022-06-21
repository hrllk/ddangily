package com.rnj.ddangily.service;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

import static org.junit.Assert.*;

@SpringBootTest
public class TokenServiceImplTest {

    @Autowired
    TokenService tokenService;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    @Commit
    public void getTokenTest() {
        System.out.println("START RELOAD TOKEN");
        tokenService.reloadToken();
        System.out.println("END RELOAD TOKEN");
    }

    @Test
    public void hi() {
        System.out.println("hi");
    }
}