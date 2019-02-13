package com.alex.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/customers")
public class CustomerController {

    @RequestMapping("/new")
    public String newUser(Model model) {
        model.addAttribute("customer", new Customer());
        return "show-form";
    }

    @RequestMapping("/submit")
    public String submitUser(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return "show-form";
        }

        return "show-message";
    }

}
