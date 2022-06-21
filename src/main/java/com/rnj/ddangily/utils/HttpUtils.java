package com.rnj.ddangily.utils;

import com.rnj.ddangily.model.Constants;
import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@Slf4j
public class HttpUtils {

    public static String sendAndGetResponse(String requestUrl){
//        URL url = null;
        HttpURLConnection conn = null;
        StringBuffer response = null;

        try {
            URL url = new URL(requestUrl);
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("User-Agent", "Mozilla/5.0");

            /* RESPONSE */
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }

            log.debug("response:[{}]", response);
            in.close();
        } catch (IOException e) {
            log.error("ERROR:", e);
        }
        return response.toString();
    }
}
