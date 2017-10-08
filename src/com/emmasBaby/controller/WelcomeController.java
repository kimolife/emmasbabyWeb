package com.emmasBaby.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.emmasBaby.service.GenericWelcomeService;
import com.emmasBaby.service.WelcomeService;

@Controller
public class WelcomeController {

	@Autowired
	private GenericWelcomeService welcomeService;

	// http://localhost:8080/emmasBabyWeb/ <- the / is the last / in the URL
	@RequestMapping("/")
	public String doWelcome(Model model) {

		// 1. Retrieving the processed data
		//WelcomeService welcomeService = new WelcomeService();
		List<String> result = welcomeService.getWelcomeMessage("Kim");

		// 2. Add data to the model
		model.addAttribute("myWelcomeMessage", result);

		// 3. Return logical view name, forwards to welcomeNew.jsp but how?? Using View Resolver
		return "welcomeNew"; //WEB-INF/views/welcomeNew.jsp

	}

}
