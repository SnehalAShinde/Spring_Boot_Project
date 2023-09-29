package com.business.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.business.entities.Product;
import com.business.services.ProductService;


@Controller
public class ProductController 
{
//
//	@Autowired
//	private ProductService productService;
//
//	//	AddProduct
//	@PostMapping("/addingProduct")
//	public String addProduct(@ModelAttribute Product product)
//	{
//
//		this.productService.addProduct(product);
//		return "redirect:/services";
//	}
//
//	//	UpdateProduct
//	@GetMapping("/updatingProduct/{productId}")
//	public String updateProduct(@ModelAttribute Product product,@PathVariable("productId") int id)
//	{
//
//		this.productService.updateproduct(product, id);
//		return "redirect:/services";
//	}
//	//DeleteProduct
//	@GetMapping("/deleteProduct/{productId}")
//	public String delete(@PathVariable("productId") int id)
//	{
//		this.productService.deleteProduct(id);
//		return "redirect:/services";
//	}
}



