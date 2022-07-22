package com.javaclass.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaclass.model.MemberVO;

@Controller
public class ParameterController {
	
	@RequestMapping(value="param.do",params= {"id=kim&age=20"})
	public void test3() {

	}
	
	/* 요청 파라메터 2개 의 또 다른 방법
	@RequestMapping("param.do")
	public void exampleTest(String id, String age) {
	
		System.out.println("클라이언트부터 넘어오는 파라메타");
		System.out.println(id + "/" + age);
	}
	
	@RequestMapping("param.do")
	public void exampleTest(MemvberVO vo){
		
		System.out.println("클라이언트부터 넘어오는 파라메타");
		System.out.println(vo.getId() + "/" +  vo.getAge());
	}
	*/
	
	@RequestMapping("param.do")
	public void test() {
	
	}
			
	@RequestMapping("paramForm.do")
	//*****************************************
	// 스프링에서 세션처리는 함수에 파라메터로 HttpSession 을 지정만 하면 된다.
	public void test2(MemberVO vo, HttpSession session) {
		//****************************
		// 실제로는 DB에 있는 아이디와 비밀번호를 검색함
		String dbId = "syb";
		String dbPw = "김정균";
	
		// 비교
		if( dbId.equals(vo.getId()) && dbPw.equals(vo.getName()));
			System.out.println("로그인성공");
			session.setAttribute("login",dbId);		
	}
}
