package iuh.fit.se.apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import iuh.fit.se.libs.Coach;

public class SpringHelloApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach = context.getBean("tennisCoach", Coach.class);
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());		
		
		context.close();
	}
}
