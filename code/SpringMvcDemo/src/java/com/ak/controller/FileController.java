package com.ak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

/**
 * 文件上传案例
 *
 */
@RequestMapping("/File")
@Controller
public class FileController {

    /**
     * 上传单文件
     * @param file 文件
     * @param name 姓名
     * @param request  方便获取地址
     * @return
     */
    @RequestMapping("/One")
    public String uploadFile(@RequestParam("file") MultipartFile file, @RequestParam("name")String name, HttpServletRequest request) {
        System.out.println(name);
        String URL=request.getServletContext().getRealPath("/upload")+file.getOriginalFilename();
        System.out.println(URL);
        File f = new File(URL);
        try {
            file.transferTo(f);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "success";
    }

    /**
     * 上传多文件
     * @param files  多个文件
     * @param name  其他数据
     * @param request 方便获取地址
     * @return
     */
    @RequestMapping("/More")
    public String uploadFile1(@RequestParam("file") MultipartFile[] files, @RequestParam("name")String name, HttpServletRequest request) {
        System.out.println(name);
        for (MultipartFile file : files) {
            String URL = request.getServletContext().getRealPath("/upload") + file.getOriginalFilename();
            System.out.println(URL);
            File f = new File(URL);
            try {
                file.transferTo(f);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "success";
    }

    /**
     * 跳转到对应路径的
     * @return
     */
    @RequestMapping("File")
    public String k2(){
        return "FileUpload";
    }
}
