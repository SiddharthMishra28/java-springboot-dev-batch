package com.learningspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping
    @ResponseBody
    public String displayHomePage() {
        return "<h1>Homepage</h1>";
    }

    @GetMapping("/contact")
    @ResponseBody
    public String displayContactPage() {
        return "<h2>Contact Form</h2>" +
                "<form action='/'><br>" +
                "<label><p>Name: </p></label>" +
                "<input type='text' /><br>" +
                "<label><p>Email: </p></label>" +
                "<input type='text' /><br>" +
                "<label><p>Query: </p></label>" +
                "<input type='text' /><br>" +
                "<button type='submit'>Submit</button>" +
                "</form>";
    }
}
