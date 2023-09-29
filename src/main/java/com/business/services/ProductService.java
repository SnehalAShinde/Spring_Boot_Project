package com.business.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.business.entities.Product;
import com.business.repositories.ProductRepository;

@Component
public class ProductService 
{
	@Autowired
	private ProductRepository productRepository;

	//add product
	public void addProduct(Product p)
	{
		this.productRepository.save(p);
	}

	//getAll product
	public List<Product>getAllProducts()
	{
		List<Product> products = (List<Product>) this.productRepository.findAll();
		return products;
	}

	//get singal product
	public Product getProduct(int id)
	{
		Optional<Product> optional = this.productRepository.findById(id);
		Product product=optional.get();
		return product;
	}
	//update product
	public void updateproduct(Product p,int id)
	{
		p.setPid(id);
		Optional<Product> optional = this.productRepository.findById(id);
		Product prod=optional.get();
		if(prod.getPid()==id)
		{
			this.productRepository.save(p);
		}
	}
	//delete product
	public void deleteProduct(int id)
	{
		this.productRepository.deleteById(id);
	}
}
