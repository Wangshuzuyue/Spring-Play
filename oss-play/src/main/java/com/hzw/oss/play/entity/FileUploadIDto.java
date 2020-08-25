package com.hzw.oss.play.entity;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author: huangzuwang
 * @date: 2019-10-31 15:12
 * @description:
 */
@Data
public class FileUploadIDto {

    String fileName;

    MultipartFile file;
}
