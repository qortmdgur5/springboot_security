package com.cos.security1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller		//   View를 리턴하겠다!!  ,, Restcontroller 는 Data 자체를 리턴
public class IndexController {
	
	//  localhost:8080/
	//  localhost:8080
	@GetMapping({"","/"})
	public String index() {
		// 머스태치 이용할 것  기본폴더 src/main/resources/
		//  뷰리졸버 설정 : templates (prefix), .mustache (suffix), 생략가눙 pom.xml에서 이미 설정
		return "index";		//  src/main/resources/templates/index.mustache
	}

}
