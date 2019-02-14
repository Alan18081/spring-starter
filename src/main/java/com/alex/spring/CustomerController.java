package com.alex.spring;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/customers")
public class CustomerController {

    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @RequestMapping("/new")
    public String newUser(Model model) {
        model.addAttribute("customer", new Customer());
        return "show-form";
    }

    @RequestMapping("/submit")
    public String submitUser(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult) {
        System.out.println(bindingResult);
        if(bindingResult.hasErrors()) {
            return "show-form";
        }

        return "show-message";
    }

}
