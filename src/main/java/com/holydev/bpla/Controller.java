package com.holydev.bpla;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;


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

    @GetMapping("/download")
    @ResponseBody
    public void getFile() {

    }


}
