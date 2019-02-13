package com.alex.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {

    @RequestMapping("/showForm")
    public String showForm() {
        return "show-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "process-form";
    }


    @RequestMapping("/shoutForm")
    public String processShout() {
        return "shout-form";
    }

    @RequestMapping("/processShout")
    public String processShout(
      @RequestParam("firstName") String firstName,
      @RequestParam("firstName") String lastName,
      Model model
    ) {
        model.addAttribute("message", firstName.toUpperCase() + " " + lastName.toUpperCase());

        return "show-message";
    }

}
