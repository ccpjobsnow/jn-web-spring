package com.ccp.jn.web.spring.controller.login.resumes.search;

import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ccp.dependency.injection.CcpDependencyInjection;
import com.ccp.jn.sync.resumes.searchs.controller.RequestResumesSearch;

@CrossOrigin
@RestController
@RequestMapping(value = "resumes/{searchType}/recruiter/{recruiter}", method = RequestMethod.POST)
public class RequestResumesSearchController {

	private RequestResumesSearch injected = CcpDependencyInjection.getInjected(RequestResumesSearch.class);

	public Map<String, Object> execute(@PathVariable("recruiter") String recruiter, @PathVariable("searchType") String searchType, @RequestBody Map<String, Object> requestBody){
		Map<String, Object> execute = this.injected.execute(recruiter, searchType, requestBody);
		return execute;
	}
	
}
