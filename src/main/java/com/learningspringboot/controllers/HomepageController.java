package com.learningspringboot.controllers;

import com.learningspringboot.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
public class HomepageController {

    @GetMapping("/hello")
    @ResponseBody
    public String displayHomePage() {
        return "<h1>Hello from Spring</h1>" +
                "<br><p>The Time on Server is "+ new Date() +"</p>";
    }

    @GetMapping("/person")
    @ResponseBody
    public String getPersonDetails() {
        Person p = new Person();
        p.setId("1ABC");
        p.setName("Sid");
        p.setEmail("sid@gmail.com");
        p.setPhone("09876543324324");
        return "<table>" +
                "<thead>" +
                    "<tr>" +
                    "<th>ID</th>" +
                    "<th>NAME</th>" +
                    "<th>EMAIL</th>" +
                    "<th>PHONE</th>" +
                    "</tr>" +
                "</thead>" +
                "<tbody>" +
                "<tr>" +
                    "<td>"+p.getId()+"</td>" +
                    "<td>"+p.getName()+"</td>" +
                    "<td>"+p.getEmail()+"</td>" +
                    "<td>"+p.getPhone()+"</td>" +
                "</tr>" +
                "</tbody>" +
                "</table>";
    }

    @GetMapping("/allpersons")
    public String getAllPersons(Model model) {
        List<Person> personList = List.of(
                new Person("1ABC", "sid", "sid@test.com", "0987654321"),
                new Person("2CBD", "alex", "alex@test.com", "1234567890"),
                new Person("3DEF", "noa", "noa@test.com", "9283746573")
        );
        model.addAttribute("persons", personList);
        return "person.html";
    }
}
