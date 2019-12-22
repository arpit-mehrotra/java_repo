package com.arpit.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRandomCoach {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HockeyCoach theCoach = context.getBean("myRandomCoach", HockeyCoach.class);
		System.out.println(theCoach.getDailyFortune());
		context.close();
	}

}
