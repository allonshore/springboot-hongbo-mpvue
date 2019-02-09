//package com.hongbo.mpvue.controller;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.hongbo.mpvue.config.ConfigNet;
//import okhttp3.HttpUrl;
//import okhttp3.OkHttpClient;
//import okhttp3.Request;
//import okhttp3.Response;
//import org.springframework.web.bind.annotation.*;
//
//import java.io.IOException;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map;
//
//@RestController
//public class BookController {
//    private ObjectMapper mapper = null;
//    OkHttpClient client = new OkHttpClient();
//    @PostMapping("/addbook")
//    public String addBook(@RequestBody Map<String,Object> Jsons){
//       System.out.println(Jsons);
//        System.out.println(Jsons.get("isbn"));
//        System.out.println(Jsons.get("openid"));
//        Map<String,Object> cc = (Map)Jsons.get("openid");
//        System.out.println("1111"+cc.get("openid"));
//        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//        Iterator<Map.Entry<String, Object>> entries = cc.entrySet().iterator();
//        while (entries.hasNext()) {
//            Map.Entry<String, Object> entry = entries.next();
//            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
//        }
////        try {
//////            userData = (Map)mapper.readValue(smsReceiptJSON, Map.class);
//////            userData = mapper.readValue(smsReceiptJSON, Map.class);
////            System.out.println(userData);
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
//
//        Request.Builder requestBuild = new Request.Builder();
//        HttpUrl.Builder urlBuilder =HttpUrl.parse(ConfigNet.DOUBAN).newBuilder();
////        urlBuilder.addQueryParameter("isbn",isbn);
//        requestBuild.url(urlBuilder.build());
//        Request request = requestBuild.build();
//        Response response = null;
//        try{
//            response = client.newCall(request).execute();
//            if (response.isSuccessful()) {
//                System.out.println(response.toString());
//            } else {
//                throw new IOException("Unexpected code " + response);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//
//        return "";
//    }
//}
