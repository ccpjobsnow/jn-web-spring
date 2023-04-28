package com.ccp.jn.web.spring.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ccp.dependency.injection.CcpDependencyInjection;
import com.ccp.jn.sync.login.controller.ExistsLoginRequest;

@CrossOrigin
@RestController
@RequestMapping("/login-request/{email}")
public class ExistsLoginRequestController {

	@RequestMapping(method = RequestMethod.HEAD)
	public void execute(@PathVariable("email")String email) {
		CcpDependencyInjection.getInjected(ExistsLoginRequest.class).execute(email);
	}
	
}
