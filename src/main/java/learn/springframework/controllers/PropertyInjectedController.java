package learn.springframework.controllers;

import learn.springframework.services.GreetingService;

public class PropertyInjectedController {

	public GreetingService greetingService;

	String sayHello() {
		return greetingService.sayGreeting();
	}
}
