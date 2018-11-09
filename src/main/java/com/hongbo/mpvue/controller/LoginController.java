package com.hongbo.mpvue.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hongbo.mpvue.bean.ConfXiao;
import com.hongbo.mpvue.config.ConfigNet;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.core.JsonGenerator;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {
    private  ObjectMapper mapper = null;

    @GetMapping("/login/{id}")
    public String login(@PathVariable String id){
        OkHttpClient client = new OkHttpClient();

        Request.Builder requestBuild = new Request.Builder();
        HttpUrl.Builder urlBuilder =HttpUrl.parse(ConfigNet.QQ_CODE).newBuilder();
        urlBuilder.addQueryParameter("appid",ConfigNet.APP_ID );
        urlBuilder.addQueryParameter("secret", ConfigNet.APP_SECRET);
        urlBuilder.addQueryParameter("grant_type", ConfigNet.GRANT_TYPE);
        urlBuilder.addQueryParameter("js_code",id);
        requestBuild.url(urlBuilder.build());
        Request request = requestBuild.build();
        Response response = null;
        try {
            response = client.newCall(request).execute();
            if (response.isSuccessful()) {
                System.out.println(response);
//                private JsonGenerator jsonGenerator = null;
                mapper = new ObjectMapper();
                Map<String, Object> map = new HashMap<String, Object>();
                   map.put("code",0);
                   map.put("data",response.body().string());
                String json = mapper.writeValueAsString(map);
//                   jsonGenerator.writeObject(map);
//                   jsonGenerator.close();
                return json;
            } else {
                throw new IOException("Unexpected code " + response);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }



        return id;
    }

    @GetMapping("/user")
    public String user(){

        return "user";
    }


}
