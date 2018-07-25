package com.javalec.springexx;



import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

	@RequestMapping(value = "joinForm")
	public String joinForm() {
		return "createPage";
	}

	@RequestMapping(value = "/member/create", method = RequestMethod.POST)
	public String memberCreate(@ModelAttribute("member") Member member, BindingResult result) {
		
		String page = "resultPage";
		MemberValidator validator = new MemberValidator();
		validator.validate(member, result);
		if(result.hasErrors()) {
			page = "createPage";
		}
		return page;
	}
}
