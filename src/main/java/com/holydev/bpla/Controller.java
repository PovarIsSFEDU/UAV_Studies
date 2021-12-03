package com.holydev.bpla;

import org.springframework.web.bind.annotation.*;


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


}
