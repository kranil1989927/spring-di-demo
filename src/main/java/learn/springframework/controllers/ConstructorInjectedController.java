package learn.springframework.controllers;

import learn.springframework.services.GreetingService;

public class ConstructorInjectedController {
	private GreetingService greetingService;

	public ConstructorInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	String sayHello() {
		return greetingService.sayGreeting();
	}

}
