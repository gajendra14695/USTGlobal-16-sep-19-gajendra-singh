package com.ustglobal.springmvc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ustglobal.springmvc.beans.Employee;

@Controller
public class HelloController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		
		SimpleDateFormat formate= new SimpleDateFormat("yyy-MM-dd");
		CustomDateEditor editor=new CustomDateEditor(formate, true);
		binder.registerCustomEditor(Date.class, editor);
	}

	@RequestMapping(path="/hello")
	public String hello(@RequestParam("name")String name ,
			@RequestParam("id")int id, ModelMap map) {
		map.addAttribute("msg" ,"Hello world");
		map.addAttribute("name" ,name);
		map.addAttribute("id" ,id);
		return "index";
	}
	
	@RequestMapping(path="/hi/{name}/{id}")
	public String hi(@PathVariable("name")String name,@PathVariable("id")int id,ModelMap map1) {
		map1.addAttribute("msg","Hello Baby");
		map1.addAttribute("name", name);
		map1.addAttribute("id", id);
	   return "index";
	}
	@RequestMapping(path="/form")
	public String formPage() {
		return "form";
	}
	@RequestMapping(path="/form", method=RequestMethod.POST)
	public String form(Employee employee, ModelMap map) {
		
		
		map.addAttribute("id", employee.getId());
		map.addAttribute("name", employee.getName());
		map.addAttribute("password",employee.getPassword());
		map.addAttribute("gender", employee.getGender());
		map.addAttribute("doj", employee.getDoj());
		return "formoutput";
	}
	@RequestMapping(path="/create-cookie")
	public String createCookie(ModelMap map ,HttpServletResponse response) {
		Cookie cookie =new Cookie("name" , "Diya");
		response.addCookie(cookie);
		
		return "createcookie";
		
	}
	@RequestMapping(path="/read-cookie")
	public String readCookieValue(ModelMap map,
			@CookieValue("name")String name) {
		
		map.addAttribute("name", name);
	
		
		return "readcookie";
	}
	
	@RequestMapping(path="/redirect")
	public String redirect() {
		return "redirect: https://memorynotfound.com/spring-mvc-xml-configuration-example/";
	}
	@RequestMapping(path="/forward")
	public  String forward() {
		return "forward:./hi/Gajendra/3";
	}
	
}
