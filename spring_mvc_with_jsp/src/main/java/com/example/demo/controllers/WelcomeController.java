package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Product;
import com.example.demo.repos.ProductRepository;

@RequestMapping("/mvc")
@Controller
public class WelcomeController {
	
	private ModelAndView md1View;
	
	private ProductRepository repo;
	
	@Autowired
	public WelcomeController(ModelAndView md1View, ProductRepository repo) {
		super();
		this.md1View = md1View;
		this.repo = repo;
	}

	@RequestMapping(value = "/first", method = RequestMethod.GET)
	public String getFirstPage() {
		return "welcome";
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView getHomePage() {
		
		List<Product> prdList = repo.findAll();
		
		md1View.addObject("list", prdList);
		md1View.setViewName("home");
		
		return md1View;
	}

}
