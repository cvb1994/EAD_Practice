package com.example.EADPractice.controller;

import com.example.EADPractice.dto.ProductDto;
import com.example.EADPractice.dto.SaleDto;
import com.example.EADPractice.service.ProductService;
import com.example.EADPractice.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @Autowired
    SaleService saleService;

    @GetMapping("/")
    public String getList(Model model){
        List<ProductDto> list = productService.getList();
        model.addAttribute("list", list);
        return "index";
    }

    @GetMapping("/createProduct")
    public String showCreatePage(Model model){
        ProductDto emp = new ProductDto();
        model.addAttribute("emp", emp);
        return "create";
    }

    @PostMapping(value = "/saveProduct")
    public String saveEmp(@ModelAttribute("emp") ProductDto emp){
        ProductDto result = productService.saveProduct(emp);
        if(result != null){
            return "redirect:/";
        }
        return "redirect:/";
    }

    @GetMapping("/list/sale")
    public String getSaleList(Model model){
        List<SaleDto> list = saleService.getList();
        model.addAttribute("list", list);
        return "saleList";
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
