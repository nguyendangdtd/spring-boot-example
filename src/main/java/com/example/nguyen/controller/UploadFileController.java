/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.nguyen.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author XV
 */
@Controller
public class UploadFileController {

    @RequestMapping(value = "/uploadForm", method = RequestMethod.GET)
    public String getUploadFileForm() {
        return "fileUploadForm";
    }

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String submit(@RequestParam("file") MultipartFile file, HttpServletRequest request, ModelMap modelMap) throws IOException {
        String filePath = request.getServletContext().getRealPath("/");
        filePath = filePath.replace("webapp", "\\resources\\static\\upload");
        try {
            byte barr[] = file.getBytes();

            BufferedOutputStream bout = new BufferedOutputStream(
                    new FileOutputStream(filePath + "/" + file.getOriginalFilename()));
            bout.write(barr);
            bout.flush();
            bout.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        modelMap.addAttribute("file", file);
        return "fileUploadView";
    }
}
