package com.hzw.oss.play.constant;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author: huangzuwang
 * @date: 2019-10-31 15:05
 * @description:
 */
@Data
@Component
@ConfigurationProperties(prefix = "aliyun.oss")
public class OSSConfigConstant {

    private String endPoint;

    private String accessKeyId;

    private String accessKeySecret;

    private String bucketName;

    private String fileFolder;

    private String deletedFolder;

}
