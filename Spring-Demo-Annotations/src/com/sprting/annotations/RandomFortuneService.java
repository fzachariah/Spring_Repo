package com.sprting.annotations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String data[]={"Beware of Wolf in SHeep's clothing","The Journey is the reward","Diligence is the mother of good luck"};
	private Random myRandom=new Random();
	
	@Override
	public String getFortune() {
		
		int index=myRandom.nextInt(data.length);
		
		return data[index];
	}

}
