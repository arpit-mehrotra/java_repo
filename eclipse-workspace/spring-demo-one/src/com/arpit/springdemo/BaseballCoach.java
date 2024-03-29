package com.arpit.springdemo;

public class BaseballCoach implements Coach{
	// define a private field for the dependency
	private FortuneService fortuneService;
	
	// define a constructor for the dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// use my FortuneService to get a fortune 
		return fortuneService.getFortune();
	}
}
