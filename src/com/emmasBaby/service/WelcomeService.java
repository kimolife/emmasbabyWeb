package com.emmasBaby.service;

import java.util.ArrayList;
import java.util.List;

public class WelcomeService implements GenericWelcomeService {

	public List<String> getWelcomeMessage(String name) {
		List<String> message = new ArrayList<>();
		message.add("Hello");
		message.add(name);
		message.add("Hello again");
		return message;

	}

}
