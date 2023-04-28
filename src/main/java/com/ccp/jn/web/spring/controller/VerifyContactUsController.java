package com.ccp.jn.web.spring.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ccp.dependency.injection.CcpDependencyInjection;
import com.ccp.jn.sync.contactus.controller.VerifyContactUs;

@CrossOrigin
@RestController
@RequestMapping("/contact-us")
public class VerifyContactUsController {
	
	private VerifyContactUs injected = CcpDependencyInjection.getInjected(VerifyContactUs.class);
	
	@GetMapping("/from/{emailFrom}/subjectType/{subjectType}")
	public void execute(@PathVariable("emailFrom") String emailFrom, @PathVariable("subjectType") String subjectType){
		this.injected.execute(emailFrom, subjectType);
	}
	
}
