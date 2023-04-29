package com.ccp.jn.web.spring.controller.contactus;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ccp.dependency.injection.CcpDependencyInjection;
import com.ccp.jn.sync.contactus.controller.VerifyContactUs;

@CrossOrigin
@RestController
@RequestMapping(value = "/contact-us/from/{emailFrom}/subjectType/{subjectType}", method = RequestMethod.HEAD)
public class VerifyContactUsController {
	
	private VerifyContactUs injected = CcpDependencyInjection.getInjected(VerifyContactUs.class);
	
	public void execute(@PathVariable("emailFrom") String emailFrom, @PathVariable("subjectType") String subjectType){
		this.injected.execute(emailFrom, subjectType);
	}
	
}
