package com.rnj.ddangily.service;

import com.rnj.ddangily.model.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@Service
public class HttpServiceImpl implements HttpService{

    @Override
    public StringBuffer sendGetRequest(String refreshTokenUrl) {
        URL url = null;
        HttpURLConnection conn = null;
        StringBuffer response = null;

        try {
            url = new URL(refreshTokenUrl);
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("User-Agent", Constants.USER_AGENT);

            /* RESPONSE */
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }
}
