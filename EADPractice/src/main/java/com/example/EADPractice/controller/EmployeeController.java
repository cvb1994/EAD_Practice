package com.example.EADPractice.controller;

import com.example.EADPractice.dto.EmployeeDto;
import com.example.EADPractice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/")
    public ModelAndView getList(){
        ModelAndView model = new ModelAndView("index");
        List<EmployeeDto> list = employeeService.getList();
        model.addObject("list", list);
        return model;
    }

    @GetMapping("/admin")
    public ModelAndView getAdmin(){
        ModelAndView model = new ModelAndView("admin");
//        List<EmployeeDto> list = employeeService.getList();
//        model.addObject("list", list);
        return model;
    }

    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }

    @GetMapping("/error")
    public String error(Model model) {
        return "error";
    }
}
