package com.hzw.oss.play.service;

import com.aliyun.oss.OSS;
import com.aliyun.oss.model.PutObjectRequest;
import com.aliyun.oss.model.PutObjectResult;
import com.hzw.oss.play.constant.OSSConfigConstant;
import com.hzw.oss.play.entity.FileUploadIDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * @author: huangzuwang
 * @date: 2019-10-31 15:14
 * @description:
 */
@Service
@Slf4j
public class FileService {

    @Autowired
    private OSSConfigConstant ossConfigConstant;

    @Autowired
    private OSS ossClient;

    public String upload(FileUploadIDto iDto) throws IOException {
        PutObjectRequest putObjectRequest = new PutObjectRequest(ossConfigConstant.getBucketName(),

                ossConfigConstant.getFileFolder() + "/" + iDto.getFileName(), new ByteArrayInputStream(iDto.getFile().getBytes()));
        PutObjectResult putObjectResult = ossClient.putObject(putObjectRequest);
        return putObjectResult.toString();
    }

}
