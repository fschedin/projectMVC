package com.example.projectrentalcar.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class RentController {

    @RequestMapping("/rentform")//localhost:8080/rentform
    public String rentform(Model model) {
        return "rentform";
    }

    @PostMapping("/formhandling")
    public String formhandling (Model model, @RequestParam Map<String, String> allFormRequestParams) {

        model.addAttribute("firstname", allFormRequestParams.get("first_name"));
        model.addAttribute("entryset", allFormRequestParams.entrySet());
        model.addAttribute("keyset", allFormRequestParams.keySet());
        model.addAttribute("values", allFormRequestParams.values());
        return "rentformhandling";
    }

}
