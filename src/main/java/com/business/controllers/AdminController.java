package com.business.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.business.entities.Admin;
import com.business.entities.Product;
import com.business.entities.User;
import com.business.loginCredentials.AdminLogin;
import com.business.services.AdminService;
import com.business.services.ProductService;
import com.business.services.UserService;
@Controller
public class AdminController 
{
	@Autowired
	private AdminService adminService;
	@Autowired
	private UserService userService;
    @Autowired
	private ProductService productService;
    
    private String email;
    private User user;
    
    //validating login
    
    
	@PostMapping("/adminLogin")
	public String getallData(@ModelAttribute("adminLogin")AdminLogin login,Model model)
	{
		String email=login.getEmail();
		String password=login.getPassword();
		if(adminService.validateAdminCredentials(email, password))
		{
			return "redirect:/services";
		}
	
		else{
		//return "redirect:/services";
			model.addAttribute("error", "Invalid email or password");
			return "Login";
		}
	}

	@GetMapping("/services")
	public String returnBack(Model model)
	{
		List<Admin>admins=this.adminService.getAll(); 
		List<User>users=this.userService.getAllUser();
		List<Product>products=this.productService.getAllProducts();
		model.addAttribute("admins", admins);
		model.addAttribute("users", users);
		model.addAttribute("products", products);
		return "Admin_Page";
	}
	//Invoking addAdmin Page
	@GetMapping("/addAdmin")
	public String addAdminPage()
	{
		return "Add_Admin";
	}
	//Handling AddAdmin
	@PostMapping("addingAdmin")
	public String addAdmin(@ModelAttribute Admin admin)
	{
		this.adminService.addAdmin(admin);
		return "redirect:/services";
	}
	//invoking updateAdmin Page
	@GetMapping("/updateAdmin/{adminId}")
	public String update(@PathVariable("adminId") int id,Model model)
	{
		Admin admin = this.adminService.getAdmin(id);
		model.addAttribute("admin", admin);
		return "Update_Admin";
	}
	//Handling Update Page
	@GetMapping("/updatingAdmin/{id}")
	public String updateAdmin(@ModelAttribute Admin admin,@PathVariable("id") int id)
	{
		this.adminService.updateAdmin(admin, id);
		return "redirect:/services";
	}
	//IHandling delete operation
	@GetMapping("/deleteAdmin/{id}")
	public String deleteAdmin(@PathVariable("id") int id)
	{
		this.adminService.delete(id);
		return "redirect:/services";
	}
	//invoking user page
	@GetMapping("/addUser")
	public String addUser()
	{
		return "Add_User";
	}
	//adding user
	@PostMapping("addingUser")
	public String adduser(@ModelAttribute User user)
	{
		this.userService.addUser(user);
		return "redirect:/services";
	}
	//Invoking UpdateUser Page
	@GetMapping("/updateUser/{userId}")
	public String updateUserPage(@PathVariable("userId") int id,Model model)
	{
		User user = this.userService.getUser(id);
		model.addAttribute("user", user);
		return "Update_User";
	}
	//Handling Update Page
	@GetMapping("/updatingUser/{id}")
	public String updateUser(@ModelAttribute User user,@PathVariable("id") int id)
	{
		this.userService.updateUser(user, id);
		return "redirect:/services";
	}
	@GetMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable("id")int id)
	{
		this.userService.deleteUser(id);
		return "redirect:/services";
	}
	
	//handling Product page
	@GetMapping("/addProduct")
	public String addProduct()
	{
		return "Add_Product";
	}
	@PostMapping("addingProduct")
	public String addproduct(@ModelAttribute Product product)
	{
		this.productService.addProduct(product);
		return "redirect:/services";
	}
	
	@GetMapping("/updateProduct/{productId}")
	public String updateProduct(@PathVariable("productId") int id,Model model)
	{
		Product product=this.productService.getProduct(id);
		System.out.println(product);
		model.addAttribute("product", product);
		return "Update_Product";
	}
	
	
	@GetMapping("/updatingProduct/{id}")
	public String updateProduct(@ModelAttribute Product product,@PathVariable("id") int id)
	{
		this.productService.updateproduct(product, id);
		return "redirect:/services";
	}
	@GetMapping("/deleteProduct/{id}")
	public String deleteProduct(@PathVariable("id")int id)
	{
		this.productService.deleteProduct(id);
		return "redirect:/services";
	}

}

