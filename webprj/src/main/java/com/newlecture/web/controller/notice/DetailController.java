package com.newlecture.web.controller.notice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class DetailController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("DetailControoler in ");
		ModelAndView mv = new ModelAndView("notice/detail");//실제로 찾아갈 주소
		
		//mv.setViewName("/WEB-INF/view/index.jsp");
		
	return mv;
	}

}
