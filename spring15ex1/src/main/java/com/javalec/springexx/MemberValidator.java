package com.javalec.springexx;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class MemberValidator implements Validator{

	@Override
	public boolean supports(Class<?> arg0) {
		return Member.class.isAssignableFrom(arg0);	//검증할 객체의 클래스 타입 정보
	}
 
	@Override
	public void validate(Object obj, Errors errors) {
		System.out.println("validate()");
		Member member = (Member)obj;
		
		String memberId = member.getId();
		if(memberId == null || memberId.trim().isEmpty()) {
			System.out.println("memberId is null or empty");
			errors.rejectValue("id", "not value");
		}
		
		int memberPassword = member.getPassword();
		if(memberPassword == 0) {
			System.out.println("memberPassword is 0");
			errors.rejectValue("password", "password is 0");
		}
		
	}
	
	
	
}
