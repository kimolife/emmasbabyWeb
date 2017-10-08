package com.emmasBaby.controller;


import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.emmasBaby.service.RandomizerRequestScope;
import com.emmasBaby.service.RandomizerSessionScope;

@Controller
public class ScopedController {

	@Autowired
	RandomizerRequestScope requestScope;
	
	@Autowired
	RandomizerSessionScope sessionScope;
	
	@RequestMapping("/scope")
	public void getRandom(HttpServletResponse response) throws Exception {
		
		response.getWriter().write("******** Request Scope****************");
		response.getWriter().write("Old: This is the random number :"+requestScope.getRandomNumber()+ "<br>");
		requestScope.generateRandomNumber();
		response.getWriter().write("New: This is the random number :"+requestScope.getRandomNumber()+ "<br>");
		response.getWriter().write("Object reference: " + requestScope + "<br>");
		
		response.getWriter().write("******** Session Scope****************");
		response.getWriter().write("Old: This is the random number :"+sessionScope.getRandomNumber()+ "<br>");
		sessionScope.generateRandomNumber();
		response.getWriter().write("New: This is the random number :"+sessionScope.getRandomNumber()+ "<br>");
		response.getWriter().write("Object reference: " + sessionScope + "<br>");
		
	}

}
