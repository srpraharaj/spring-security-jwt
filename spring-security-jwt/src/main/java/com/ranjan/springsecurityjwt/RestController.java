package com.ranjan.springsecurityjwt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestController {
	
	@RequestMapping({"/hello"})
	public String hello() {
		return "Hello World!!";
	}
}
