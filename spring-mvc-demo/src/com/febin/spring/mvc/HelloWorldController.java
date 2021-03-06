package com.febin.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	//Need a controller method to show the initial form
	@RequestMapping("/showForm")
	public String showForm()
	{
		return "helloworld-form";
	}
	
	
	//Need a controller metod to process the form
	@RequestMapping("/processForm")
	public String processForm()
	{
		return "helloworld";
	}
	
	@RequestMapping("/processFormTwo")
	public String letsShoutDude(HttpServletRequest request,Model model)
	{
		String data=request.getParameter("studentName");
		data=data.toUpperCase();
		String result="Yo "+data;
		model.addAttribute("message", result);
		return "helloworld";
		
	}
	
	
	@RequestMapping("/processFormThree")
	public String processFormThree(@RequestParam("studentName") String data,Model model)
	
	{
		data=data.toUpperCase();
		String result="Yo Boy "+data;
		model.addAttribute("message", result);
		return "helloworld";
		
	}

}
