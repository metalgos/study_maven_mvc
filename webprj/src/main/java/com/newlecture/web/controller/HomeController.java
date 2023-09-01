package com.newlecture.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class HomeController {
	
	@RequestMapping("/index")
	public String index() {
		return "root.index";
	}

	@RequestMapping("/help")
	public void help() {
		System.out.println("테스트 인덱스 리퀘스트 매핑 진입");
	}
	
}
