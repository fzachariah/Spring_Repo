package com.sprting.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	/*@Autowired
	public TennisCoach(FortuneService fortuneService) {

		this.fortuneService = fortuneService;
	}
*/
	@PostConstruct
	public void domyStartUp()
	{
		System.out.println("Started");
	}
	
	
	
	 public TennisCoach() {
		
		 System.out.println("Inside Default Cnstructor");
	}
	 
	/* @Autowired
	 public void setFortuneServiceAny(FortuneService fortuneService) {
		 System.out.println("Inside Crazy Function");
			this.fortuneService = fortuneService;
		}*/
	 
	/*@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/



	@Override
	public String getDailyWorkout() {

		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}
	
	@PreDestroy
	public void domyClose()
	{
		System.out.println("Ended");
	}

}
