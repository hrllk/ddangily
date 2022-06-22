package com.rnj.ddangily.utils;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class HttpUtilsTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sendAndGetResponseTest() {
        String urlTmplate = "https://graph.instagram.com/refresh_access_token?grant_type=ig_refresh_token&access_token={long-lived-access-token}";
        String oldToken = "IGQVJXSjQ3aEdjcUxkcTU5RkZAfLThBSUM5MHFkV3k4ZADR4clJWNkU1cWRYQm5RdFhWT3RuR1VTdy1JVms1TzhsMHVmZAHVjQXJaZAUJxZAEljcFZA1ZA0Y0aldIOFpOdjlFMEhrQUR5RXZAJM3I4MnMxcEF1UgZDZD";
        String requestUrl = urlTmplate.replace("{long-lived-access-token}",oldToken);

        String responseStr = HttpUtils.sendAndGetResponse(requestUrl);
        System.out.println("responseStr: [" + responseStr + "]");
    }
}