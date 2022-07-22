package com.javaclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaclass.model.MemberVO;

@Controller
@RequestMapping("re")	//@ requestmapping으로 경로 분할 , 위로 지정
public class RequestController {

	@RequestMapping(value={"/a.do","/b.do"})
	public String test() {
		System.out.println("a.do & b.do 요청");
		// 뷰페이지 지정
		// *********************************************
		// 스프링 컨트롤러에서 매핑 함수의 리턴값이 String 인경우
		//      *** 문자열 반환이 아니라 
		//      *** 뷰페이지 지정
		return "home"; 	// -> /WEB-INF/views/ + home + .jsp	
		
	}
	
	@RequestMapping(value="/c.do", params= {"id=kim"})
	public void test2() {
		System.out.println("re/c.do 요청");
		// *********************************************
		// 스프링 컨트롤러에서 매핑 함수의 리턴값이 void 인경
		//		*** 리턴값이 없다는 신호가 아니라
		//		*** 자동으로 뷰 페이지를 지정
		//		a.do	->	/WEB-INF/views/ + a + .jsp
		//		re/c.do	-> 	/WEB-INF/views/ + re / c + .jsp	
	}
	
	@RequestMapping(value="request.do", method = RequestMethod.POST)
										// post 방식만 지원 
	public void test3(MemberVO vo) { // VO  의 멤버변수랑 같아야 자동으로 들어감  
					// @ModelAttribute("vo") : vo 변수명으로 멤버변수를 지정
		System.out.println("re/request.do 요청");
		System.out.println(vo.getName());
		
	}
}
