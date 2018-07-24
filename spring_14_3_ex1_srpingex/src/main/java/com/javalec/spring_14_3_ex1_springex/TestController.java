package com.javalec.spring_14_3_ex1_springex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController { //redirect:는 컨트롤러안에서만 하는게 좋음
	
	@RequestMapping(value= "/test/login")
	public String Test1() {
		
		return "test/login";
	}
	
	@RequestMapping(value= "/test/login.post",  method = RequestMethod.POST)
	public String LoginPost(String username, String password) {
			
			if(username.equals("test") && password.equals("1234")) {
				
				System.out.println("성공");
				return "redirect:/";	
			} else {
				
			}
		
			return "redirect:/test/login";
	}

}
