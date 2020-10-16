package com.example.projectrentalcar.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


    @Controller
    public class CarController {

        public String [] picture = new String[] {"https://cdn.pixabay.com/photo/2015/07/20/12/57/man-852766_960_720.jpg","https://cdn.pixabay.com/photo/2018/10/29/21/46/human-3782189_1280.jpg","https://cdn.pixabay.com/photo/2020/07/06/20/55/portrait-5378357_1280.jpg"};


        @RequestMapping("/car")//localhost:8080/car
        public String page(Model model) {
            model.addAttribute("attribute1","Bor i Borlänge");
            model.addAttribute("attribute2","Bor i Falun");
            model.addAttribute("attribute3","Bor i Rättvik");
            model.addAttribute("picture1", picture[0]);
            model.addAttribute("picture2", picture[1]);
            model.addAttribute("picture3", picture[2]);
            return "carview";
        }

        @RequestMapping("/car/info1")
        public String infoPage1(Model model) {
            model.addAttribute("info1", "Hej, jag heter John doe och bor i Borlänge");
            return "info1";
        }

        @RequestMapping("/car/info2")
        public String infoPage2(Model model) {
            model.addAttribute("info2", "Hej, jag heter Allan Ballan och bor i Falun");
            return "info2";
        }

        @RequestMapping("/car/info3")
        public String infoPage3(Model model) {
            model.addAttribute("info3", "Hej, jag heter Bruce Lee och bor i Rättvik");
            return "info3";
        }
}
