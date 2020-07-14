package com.hyeontae.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//특정 어노테이션이 붙어있는 클래스 파일을 scan(new)해서(IoC) 스프링컨테이너에 올림
@RestController
public class BlogController {

	//http://localhost:8080/test/hello
	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>hello Spring boot</h1>";
	}
}
