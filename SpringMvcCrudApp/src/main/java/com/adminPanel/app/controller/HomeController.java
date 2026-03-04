package com.adminPanel.app.controller;

import com.adminPanel.app.Entity.Product;
import com.adminPanel.app.Service.ProductService;
import com.adminPanel.app.model.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class HomeController {

    @Autowired
    private ProductService productService;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String root() {
        return "redirect:/products";
    }

    @RequestMapping(value = "/products",method =  RequestMethod.GET)
    public String processForm(Model model){
        model.addAttribute("productLists",productService.getAll());
        return "homePage";
    }
    @RequestMapping(value = "/addProduct",method = RequestMethod.GET)
    public String showAddProductForm(Model model){
        model.addAttribute("productModel",new  ProductModel());
        return "addProductForm";
    }
    @RequestMapping(value = "/processAddProduct", method = RequestMethod.POST)
    public String processAddProductForm(@Valid @ModelAttribute("productModel") ProductModel productModel, BindingResult result) {
        if (result.hasErrors()) {
            return "addProductForm";
        }
        productService.save(productModel);
        return "redirect:/products";
    }
    @RequestMapping(value = "/updateDetailsForm",method = RequestMethod.GET)
    public String showUpdateDetailsForm(@RequestParam("id") int id , Model model){
        ProductModel productModel = productService.getById(id);
        model.addAttribute("productModel",productModel);
        return "updateDetailsForm";

    }
    @RequestMapping(value = "/processUpdateProductForm", method = RequestMethod.POST)
    public String processUpdateProductForm(@Valid @ModelAttribute("productModel") ProductModel productModel, BindingResult result) {
        if (result.hasErrors()) {
            return "updateDetailsForm";
        }
        productService.save(productModel);
        return "redirect:/products";
    }
    @RequestMapping(value = "/viewDetailsPage",method = RequestMethod.GET)
    public String viewDetailsPage(@RequestParam("id") int id , Model model){
        ProductModel productModel = productService.getById(id);
        model.addAttribute("productModel",productModel);
        return "viewDetailsPage";
    }
    @RequestMapping(value = "/processViewDetailsPage",method = RequestMethod.POST)
    public String processViewDetailsPage(@Valid @RequestParam("productModel") ProductModel productModel ,BindingResult result){
        if (result.hasErrors()) {
            return "viewDetailsPage";
        }
        productService.save(productModel);
        return "redirect:/products";
    }
    @PostMapping("/deleteProduct")
    public String deleteProduct(@RequestParam("id") int id) {
        productService.delete(id);
        return "redirect:/products";
    }



    }

