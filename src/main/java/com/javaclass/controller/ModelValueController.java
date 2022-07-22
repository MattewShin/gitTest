package com.javaclass.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.javaclass.model.MemberVO;

@Controller
public class ModelValueController {

	@Autowired
	MemberVO vo;
		
	@RequestMapping("modelValue.do")
	public ModelAndView test() {
		System.out.println("-------------- modelvalue.do");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("modelValue");
		mv.addObject("member", vo);
		return mv;
		
	}
}
