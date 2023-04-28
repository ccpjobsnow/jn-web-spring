package com.ccp.jn.web.spring.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ccp.decorators.CcpMapDecorator;
import com.ccp.dependency.injection.CcpDependencyInjection;
import com.ccp.jn.sync.login.controller.Login;


@CrossOrigin
@RestController
@RequestMapping("/login/{email}")
public class LoginController {
	
	private Login injected = CcpDependencyInjection.getInjected(Login.class);

	@PostMapping
	public Map<String, Object> execute(HttpServletRequest request, @PathVariable("email") String email){
		String remoteAddr = request.getRemoteAddr();
		Map<String, Object> execute = this.injected.execute(
				new CcpMapDecorator()
				.put("ip", remoteAddr)
				.put("email", email)
				.content);
		return execute;
	}
	
}
