package com.ccp.jn.web.spring.controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ccp.dependency.injection.CcpDependencyInjection;
import com.ccp.jn.sync.contactus.controller.SaveContactUs;

@CrossOrigin
@RestController
@RequestMapping("/contact-us")
@ResponseStatus(code = HttpStatus.ACCEPTED)
public class SaveContactUsController {

	private SaveContactUs injected = CcpDependencyInjection.getInjected(SaveContactUs.class);

	@PostMapping
	public void execute(@RequestBody Map<String, Object> json) {
		this.injected.execute(json);
	}
	
}
