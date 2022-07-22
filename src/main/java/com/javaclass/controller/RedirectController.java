package com.javaclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {

	@RequestMapping("insert.do")
	public String insert() {
		System.out.println("insert.do 요청");
		// *************************
		// 사용자의 요청(url)을 변경 -> redirect
		return "redirect:select.do";
	}
	
	@RequestMapping("select.do")
	public void select() {
		System.out.println("select.do 요청");
		
	}

	/* JSP 에서 
	 * 		redirect 와 forward 차이
	 * 		r: 사용자의 요청을 바꿔서 결론을 주는 것
	 * 		  (요청와 응답이 동일하게 발생)
	 * 	 	f: url에는 그대로 서버단에서 다른 페이지로 변경
	 */
}

