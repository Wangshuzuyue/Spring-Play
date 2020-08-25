package com.hzw.spring.usermanage;/**
 * @author: huangzuwang
 * @date: 2019-10-10 11:26
 * @description:
 */

import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.http.HttpStatus;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/***
 * @Description:
 * @Auther: huangzuwang
 * @Date: 2019-10-10 11:26
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        String url = "https://kf-bfq-gateway.wjs-test.com:443/citic/postLoan/customerRiskSignalPush";
        JSONObject jsonObject = JSONObject.parseObject("{\n" +
                "  \"creditNo\":\"20190924685193\",\n" +
                "  \"customerNo\":\"001700452122\",\n" +
                "  \"customerName\":\"杭州科峰信息服务有限公司\",\n" +
                "  \"usci\":\"913200006835284875\",\n" +
                "  \"riskNo\":\"01\",\n" +
                "  \"riskDesc\":\"保单风险\",\n" +
                "  \"insPolcy\":\"SZBD20190923005\",\n" +
                "  \"rsrvFldOne\":\"\",\n" +
                "  \"rsrvFldTwo\":\"\",\n" +
                "  \"rsrvFldThree\":\"\"\n" +
                "}");

        for (int i = 0; i < 1; i++){
            String resp = post(jsonObject, url);
            System.out.println(i +  "服务器返回:" + resp);
            Thread.sleep(100);
        }

    }


    public static String post(JSONObject json, String url){
        String result = "";
        HttpPost post = new HttpPost(url);
        try{
            CloseableHttpClient httpClient = HttpClients.createDefault();

            post.setHeader("Content-Type","application/json;charset=utf-8");
            post.addHeader("Authorization", "Basic YWRtaW46");
            StringEntity postingString = new StringEntity(json.toString(),"utf-8");
            post.setEntity(postingString);
            HttpResponse response = httpClient.execute(post);

            InputStream in = response.getEntity().getContent();
            BufferedReader br = new BufferedReader(new InputStreamReader(in, "utf-8"));
            StringBuilder strber= new StringBuilder();
            String line;
            while((line = br.readLine())!=null){
                strber.append(line+'\n');
            }
            br.close();
            in.close();
            result = strber.toString();
            if(response.getStatusLine().getStatusCode()!=HttpStatus.OK.value()){
                result = "服务器异常";
            }
        } catch (Exception e){
            System.out.println("请求异常");
            throw new RuntimeException(e);
        } finally{
            post.abort();
        }
        return result;
    }
}
