package com.holydev.bpla;

import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.*;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;


@org.springframework.stereotype.Controller
@CrossOrigin
public class Controller {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/studies")
    public String study() {
        return "studies";
    }

    @GetMapping("/contacts")
    public String contacts() {
        return "contacts";
    }

    @GetMapping("/1st")
    public String first() {
        return "1st";
    }

    @GetMapping("/2nd")
    public String second() {
        return "2nd";
    }

    @GetMapping("/3rd")
    public String third() {
        return "3rd";
    }

    @GetMapping("/git")
    public void git(HttpServletResponse httpServletResponse) {
        httpServletResponse.setHeader("Location", "https://github.com/ryabchikk/Hacaton_final_rosseti");
        httpServletResponse.setStatus(302);
    }


    @Autowired
    private ServletContext servletContext;

    @GetMapping("/download")
    @ResponseBody
    public void getFile(HttpServletResponse response) throws IOException {
        MediaType mediaType = MediaTypeUtils.getMediaTypeForFileName(this.servletContext, "build.zip");

        File file = new ClassPathResource("build/build.zip").getFile();

        // Content-Type
        // application/pdf
        response.setContentType(mediaType.getType());

        // Content-Disposition
        response.setHeader(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + file.getName());

        // Content-Length
        response.setContentLength((int) file.length());

        BufferedInputStream inStream = new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream outStream = new BufferedOutputStream(response.getOutputStream());

        byte[] buffer = new byte[1024];
        int bytesRead = 0;
        while ((bytesRead = inStream.read(buffer)) != -1) {
            outStream.write(buffer, 0, bytesRead);
        }
        outStream.flush();
        inStream.close();
    }

    @GetMapping("/downloadDmit")
    @ResponseBody
    public void resDmit(HttpServletResponse response) throws IOException {
        MediaType mediaType = MediaTypeUtils.getMediaTypeForFileName(this.servletContext, "dmitriy.pdf");

        File file = new ClassPathResource("resume/dmitriy.pdf").getFile();

        // Content-Type
        // application/pdf
        response.setContentType(mediaType.getType());

        // Content-Disposition
        response.setHeader(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + file.getName());

        // Content-Length
        response.setContentLength((int) file.length());

        BufferedInputStream inStream = new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream outStream = new BufferedOutputStream(response.getOutputStream());

        byte[] buffer = new byte[1024];
        int bytesRead = 0;
        while ((bytesRead = inStream.read(buffer)) != -1) {
            outStream.write(buffer, 0, bytesRead);
        }
        outStream.flush();
        inStream.close();
    }

    @GetMapping("/downloadPavel")
    @ResponseBody
    public void resPavel(HttpServletResponse response) throws IOException {
        MediaType mediaType = MediaTypeUtils.getMediaTypeForFileName(this.servletContext, "pavel.pdf");

        File file = new ClassPathResource("resume/pavel.pdf").getFile();

        // Content-Type
        // application/pdf
        response.setContentType(mediaType.getType());

        // Content-Disposition
        response.setHeader(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + file.getName());

        // Content-Length
        response.setContentLength((int) file.length());

        BufferedInputStream inStream = new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream outStream = new BufferedOutputStream(response.getOutputStream());

        byte[] buffer = new byte[1024];
        int bytesRead = 0;
        while ((bytesRead = inStream.read(buffer)) != -1) {
            outStream.write(buffer, 0, bytesRead);
        }
        outStream.flush();
        inStream.close();
    }

    @GetMapping("/downloadMih")
    @ResponseBody
    public void resMis(HttpServletResponse response) throws IOException {
        MediaType mediaType = MediaTypeUtils.getMediaTypeForFileName(this.servletContext, "mihail.pdf");

        File file = new ClassPathResource("resume/mihail.pdf").getFile();

        // Content-Type
        // application/pdf
        response.setContentType(mediaType.getType());

        // Content-Disposition
        response.setHeader(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + file.getName());

        // Content-Length
        response.setContentLength((int) file.length());

        BufferedInputStream inStream = new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream outStream = new BufferedOutputStream(response.getOutputStream());

        byte[] buffer = new byte[1024];
        int bytesRead = 0;
        while ((bytesRead = inStream.read(buffer)) != -1) {
            outStream.write(buffer, 0, bytesRead);
        }
        outStream.flush();
        inStream.close();
    }
}



