package com.ccp.jn.web.spring.controller.login;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ccp.dependency.injection.CcpDependencyInjection;
import com.ccp.jn.sync.login.controller.UnlockToken;

@CrossOrigin
@RestController
@RequestMapping(value = "/login/{email}/token/lock", method = RequestMethod.DELETE)
public class UnlockTokenController {

	public void execute(@PathVariable("email") String email) {
		CcpDependencyInjection.getInjected(UnlockToken.class).execute(email);
	}
	
}
