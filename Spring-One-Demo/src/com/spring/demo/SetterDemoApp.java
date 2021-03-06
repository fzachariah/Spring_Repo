package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach coach=applicationContext.getBean("myCricketCoach",CricketCoach.class);
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getTeam());
		System.out.println(coach.getEmailAddress());
		
		applicationContext.close();

	}

}
