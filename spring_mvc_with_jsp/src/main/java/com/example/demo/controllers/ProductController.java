package com.example.demo.controllers;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Product;
import com.example.demo.repos.ProductRepository;

@Controller
public class ProductController {
	
	@Autowired
	private Product entity;
	
	@Autowired
	private ProductRepository repo;
	
	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public String initForm(Model model) {
		
		model.addAttribute("title", "addProduct");
		model.addAttribute("command",entity);
		
		return "addproduct";
	}
	
	@RequestMapping(value="/product", method =RequestMethod.POST)
	public String submitForm(@ModelAttribute("command")Product entity) {
		
//		int rowAdded;
//		try {
//			rowAdded = this.repo.add(entity);
//			return "success";
//		}catch(Exception e) {
//			return "failure";
//		}
		int rowAdded = this.repo.add(entity);
		return "addproduct";
	}
		
	
	
	@RequestMapping(value = "/product/search", method = RequestMethod.GET)
	public String search(Model model) {
		
		model.addAttribute("find", "searchProduct");
		
		
		return "searchproduct";
	}
	
	@RequestMapping(value = "/product/search", method = RequestMethod.POST)
	public String show(@RequestParam("id") int id , Model model) {
		Product entity=repo.findById(id);
		model.addAttribute("found",entity);
		
		
		return "showproduct";
	}
	
	@RequestMapping(value="/product/delete", method=RequestMethod.GET)
	public String delete(Model model) {
		
		model.addAttribute("delete","deleteProduct");
		return "deleteproduct";
		
	}
	
	@RequestMapping(value="/product/delete",method=RequestMethod.POST)
	public String remove(@RequestParam("id")int id, Model model) {
		int entity = repo.remove(id);
		model.addAttribute("found",entity);
		return "deletebyid";
		
	}
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String indexOf(Model model) {
		model.addAttribute("title","index");
		return "index";
		
	}
	
	
	
	
	
}
