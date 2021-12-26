package com.rnj.ddangily.schedule;

import okhttp3.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;

public class SchedulerTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void sendPost() throws MalformedURLException {

        URL url = new URL("https://api.instagram.com/oauth/access_token");
        try {
//            HttpURLConnection http = (HttpURLConnection) url.openConnection();
//            http.setRequestMethod("POST");
//
//            http.setRequestProperty("client_id","197394555734199");
//            http.setRequestProperty("client_secret","eb9e354ab92d06c533c8fa42780937fe");
//            http.setRequestProperty("grant_type","authorization_code");
//            http.setRequestProperty("redirect_url","https://ddangily.com/");
//            http.setRequestProperty("code","AQCpTZKZnPdeSiF_9JqfL11G49UyV2UQYDXVHOVlMdf8rEeWq3t4Qg0uMZ_PsyuO-8a90BK8ls0vPM_XWTisqDodSqgCGV_q5vleTc0Obl9gxYI2_Mjz-eiNNR2Sbvsb_0ywV0qMCy2jl7os7E0EmWHSq2TYOW5OnRQxTfjemgy7alNtAFqsEAxFGjDN3pV5fJUQlexIBWczIdqtBW7YRHY29cLyyxRmHLfoev18dXjo9A#_");

String postBody = "{" +
        "client_id:197394555734199" + "\n" +
        "client_secret:eb9e354ab92d06c533c8fa42780937fe" + "\n" +
        "grant_type:authorization_code" + "\n" +
        "redirect_uri:https://b8c0-58-142-194-211.ngrok.io/" + "\n" +
        "code:AQCpTZKZnPdeSiF_9JqfL11G49UyV2UQYDXVHOVlMdf8rEeWq3t4Qg0uMZ_PsyuO-8a90BK8ls0vPM_XWTisqDodSqgCGV_q5vleTc0Obl9gxYI2_Mjz-eiNNR2Sbvsb_0ywV0qMCy2jl7os7E0EmWHSq2TYOW5OnRQxTfjemgy7alNtAFqsEAxFGjDN3pV5fJUQlexIBWczIdqtBW7YRHY29cLyyxRmHLfoev18dXjo9A#_" + "\n" +
        "}"
        ;
            OkHttpClient client = new OkHttpClient();
            RequestBody requestbody = RequestBody.create(
                    MediaType.parse("application/json; charset=utf-8"), postBody
            );
            Request.Builder builder = new Request.Builder().url(url).post(requestbody);
//            builder.addHeader("client_id","197394555734199");
//            builder.addHeader("client_secret","eb9e354ab92d06c533c8fa42780937fe");
//            builder.addHeader("grant_type","authorization_code");
//            builder.addHeader("redirect_url","https://ddangily.com/");
//            builder.addHeader("code","AQCpTZKZnPdeSiF_9JqfL11G49UyV2UQYDXVHOVlMdf8rEeWq3t4Qg0uMZ_PsyuO-8a90BK8ls0vPM_XWTisqDodSqgCGV_q5vleTc0Obl9gxYI2_Mjz-eiNNR2Sbvsb_0ywV0qMCy2jl7os7E0EmWHSq2TYOW5OnRQxTfjemgy7alNtAFqsEAxFGjDN3pV5fJUQlexIBWczIdqtBW7YRHY29cLyyxRmHLfoev18dXjo9A#_");
            Request request = builder.build();

            Response response = client.newCall(request).execute();
            if (response.isSuccessful()) {
                ResponseBody body = response.body();
                if (body != null) {
                    System.out.println("Response:" + body.string());
                }
            } else {
                System.err.println("Error Occurred");
            }
        } catch (IOException e) {

            e.printStackTrace();
        }


    }
}