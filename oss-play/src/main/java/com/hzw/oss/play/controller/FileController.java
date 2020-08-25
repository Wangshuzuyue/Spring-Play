package com.hzw.oss.play.controller;

import com.hzw.oss.play.entity.FileUploadIDto;
import com.hzw.oss.play.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @author: huangzuwang
 * @date: 2019-10-31 15:10
 * @description:
 */
@RestController
@RequestMapping(value = "/file")
public class FileController {

    @Autowired
    private FileService fileService;

    @PostMapping("/upload")
    public String fileUpload(FileUploadIDto iDto) throws IOException {
        return fileService.upload(iDto);
    }

}
