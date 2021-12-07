package com.cs.controller;

import com.cs.model.Employee;
import com.cs.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public String home(Model model) {
        List<Employee> employees = employeeService.getEmployees();
        model.addAttribute("employees", employees);
        return "index";
    }
}
