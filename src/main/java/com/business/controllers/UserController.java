package com.business.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.business.entities.Product;
import com.business.entities.User;
import com.business.repositories.ProductRepository;
import com.business.repositories.UserRepository;
import com.business.services.ProductService;
import com.business.services.UserService;
@Controller
public class UserController 
{
	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping("/userlogin")
	public String allProduct(Model model)
	{
		List<Product>product=(List<Product>) productRepository.findAll();
		model.addAttribute("products", product);
		return "All_Product";
	}
 @GetMapping("/selecting")
 public String selectedProduct()
 {
	 return "Product_Selected";
 }
}


