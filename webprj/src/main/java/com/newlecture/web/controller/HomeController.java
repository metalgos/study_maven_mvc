package com.newlecture.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@RequestMapping("/")
@Controller
public class HomeController {
	
	@RequestMapping("index")
	@ResponseBody
	public String index(HttpServletResponse response) {
		
				
		return "hello Index 1";
	}

	
}
