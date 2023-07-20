package com.fileendpoint.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
public class EndpointController {
    @PostMapping("/upload")
    public String uploadFile(@RequestParam("file") MultipartFile file) throws IOException {
        try {
            // 获取文件名
            String fileName = file.getOriginalFilename();

            // 保存文件到服务器
            String filePath = "/fileEndpoint/" + fileName; // 替换成实际的文件保存路径
            File dest = new File(filePath);
            file.transferTo(dest);

            // 可以在此处进行其他业务逻辑处理
            return "File uploaded successfully!";
        } catch (IOException e) {
            e.printStackTrace();
            return "File upload failed!";
        }
    }
}
