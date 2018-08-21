package com.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("/showForm")
public class FormHandler {
	
	@RequestMapping("/showForm")
	public String showForm(){
		return "form";
	}
	
	@RequestMapping("/afterForm")
	public String afterForm(HttpServletRequest request,Model model){
		
		String var=request.getParameter("studentName");
		
		var= var.toUpperCase();
		
		model.addAttribute("var",var);
		return "done";
	}

}
