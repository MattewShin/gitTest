package com.javaclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ReturnController {

	@RequestMapping("modelandview")
	public ModelAndView modelandview() {
		 ModelAndView mv = new ModelAndView();
		 mv.setViewName("void");
		 mv.addObject("message", "배고프다");
		 return mv;
	}
	
	@RequestMapping("void")
	public void voidTest(Model m) {
		//*********************************
		// Model 함수의 인자에 작성하지만 데이타를 뷰단으로 보내느 역할을 함
		m.addAttribute("message", "배고프다");
	}
	
	@RequestMapping("string")
	public String stringTest(Model m) {
		m.addAttribute("message", "배고픈데 밥이 읍다");
		return "void";
	}
}
