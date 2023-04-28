package com.ccp.jn.web.spring.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ccp.dependency.injection.CcpDependencyInjection;
import com.ccp.jn.sync.login.controller.Logout;

@CrossOrigin
@RestController
@RequestMapping("/logout/{email}")
public class LogoutController {

	private Logout injected = CcpDependencyInjection.getInjected(Logout.class);

	@PostMapping
	public void execute(@PathVariable("email") String email) {
		this.injected.execute(email);
	}
	
}
