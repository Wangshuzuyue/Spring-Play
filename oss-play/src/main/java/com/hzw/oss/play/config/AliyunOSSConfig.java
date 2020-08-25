package com.hzw.oss.play.config;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.hzw.oss.play.constant.OSSConfigConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: huangzuwang
 * @date: 2019-10-31 15:17
 * @description:
 */
@Configuration
public class AliyunOSSConfig {

    @Autowired
    private OSSConfigConstant ossConfigConstant;

    @Bean
    public OSS ossClient(){
        return new OSSClientBuilder()
                .build(ossConfigConstant.getEndPoint(),
                        ossConfigConstant.getAccessKeyId(),
                        ossConfigConstant.getAccessKeySecret());
    }

}
