package com.indivaragroup.spring.basic.challenge;

import com.indivaragroup.spring.basic.challenge.challengeEight.StudentConfiguration;
import com.indivaragroup.spring.basic.challenge.challengeEight.StudentRunner;
import com.indivaragroup.spring.basic.challenge.challengeFive.AppConfiguration;
import com.indivaragroup.spring.basic.challenge.challengeFour.SessionConfiguration;
import com.indivaragroup.spring.basic.challenge.challengeFour.UserSession;
import com.indivaragroup.spring.basic.challenge.challengeOne.GreetingConfiguration;
import com.indivaragroup.spring.basic.challenge.challengeOne.GreetingService;
import com.indivaragroup.spring.basic.challenge.challengeSeven.DatabaseConfiguration;
import com.indivaragroup.spring.basic.challenge.challengeSeven.DatabaseConnection;
import com.indivaragroup.spring.basic.challenge.challengeSix.CalculatorConfiguration;
import com.indivaragroup.spring.basic.challenge.challengeSix.CalculatorRunner;
import com.indivaragroup.spring.basic.challenge.challengeThree.configuration.AnimalErrorConfiguration;
import com.indivaragroup.spring.basic.challenge.challengeThree.configuration.AnimalPrimaryConfiguration;
import com.indivaragroup.spring.basic.challenge.challengeThree.configuration.AnimalQualifierConfiguration;
import com.indivaragroup.spring.basic.challenge.challengeThree.AnimalService;
import com.indivaragroup.spring.basic.challenge.challengeTwo.GreetingServiceTwo;
import com.indivaragroup.spring.basic.challenge.challengeTwo.MessageConfiguration;
import com.indivaragroup.spring.basic.challenge.finalChallenge.LibraryConfiguration;
import com.indivaragroup.spring.basic.challenge.finalChallenge.LibraryRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

//		SpringApplication.run(Application.class, args);

		System.out.println("\n========== CHALLENGE 1 ==========");
		var context = new AnnotationConfigApplicationContext(GreetingConfiguration.class);
		GreetingService greetingService = context.getBean(GreetingService.class);
		System.out.println(greetingService.sayHello());
		context.close();


		System.out.println("\n========== CHALLENGE 2 ==========");
		var contextChallengeTwo = new AnnotationConfigApplicationContext(MessageConfiguration.class);
		GreetingServiceTwo greetingServiceChallengeTwo = contextChallengeTwo.getBean(GreetingServiceTwo.class);
		greetingServiceChallengeTwo.greet();
		contextChallengeTwo.close();

		System.out.println("\n========== CHALLENGE 3 - ERROR ==========");
		System.out.println("Output Error:");
		try {
			var contextError = new AnnotationConfigApplicationContext(AnimalErrorConfiguration.class);
			contextError.close();
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}

		System.out.println("Output Primary:");
		var contextPrimary = new AnnotationConfigApplicationContext(AnimalPrimaryConfiguration.class);
		AnimalService animalServicePrimary = (AnimalService) contextPrimary.getBean("animalServicePrimary");
		animalServicePrimary.showAnimalSound();
		contextPrimary.close();

		System.out.println("Output Qualifier:");
		var contextQualifier = new AnnotationConfigApplicationContext(AnimalQualifierConfiguration.class);
		AnimalService animalServiceQualifier = (AnimalService) contextQualifier.getBean("animalServiceQualifier");
		animalServiceQualifier.showAnimalSound();
		contextQualifier.close();


		System.out.println("\n========== CHALLENGE 4 - PROTOTYPE ==========");
		System.out.println("Output Prototype:");

		var contextChallengeFour = new AnnotationConfigApplicationContext(SessionConfiguration.class);
		UserSession session1 = contextChallengeFour.getBean("userSessionPrototype", UserSession.class);
		UserSession session2 = contextChallengeFour.getBean("userSessionPrototype", UserSession.class);
		System.out.println(session1 == session2);

		System.out.println("Output Singleton:");
		UserSession session3 = contextChallengeFour.getBean("userSessionSingleton", UserSession.class);
		UserSession session4 = contextChallengeFour.getBean("userSessionSingleton", UserSession.class);
		System.out.println(session3 == session4);
		contextChallengeFour.close();


		System.out.println("\n========== CHALLENGE 5 ==========");
		var contextChallengeFive = new AnnotationConfigApplicationContext(AppConfiguration.class);
		String applicationName = contextChallengeFive.getBean("applicationName", String.class);
		System.out.println(applicationName);
		contextChallengeFive.close();


		System.out.println("\n========== CHALLENGE 6 ==========");
		var contextChallengeSix = new AnnotationConfigApplicationContext(CalculatorConfiguration.class);
		CalculatorRunner calculatorRunner = contextChallengeSix.getBean(CalculatorRunner.class);
		calculatorRunner.run();
		contextChallengeSix.close();


		System.out.println("\n========== CHALLENGE 7 ==========");
		var contextChallengeSeven = new AnnotationConfigApplicationContext(DatabaseConfiguration.class);
		contextChallengeSeven.getBean(DatabaseConnection.class);
		contextChallengeSeven.close();

		System.out.println("\n========== CHALLENGE 8 ==========");
		var contextChallengeEight = new AnnotationConfigApplicationContext(StudentConfiguration.class);
		StudentRunner studentRunner = contextChallengeEight.getBean(StudentRunner.class);
		studentRunner.run();
		contextChallengeEight.close();

		System.out.println("\n========== FINAL CHALLENGE ==========");
		var contextFinalChallenge = new AnnotationConfigApplicationContext(LibraryConfiguration.class);
		LibraryRunner libraryRunner = contextFinalChallenge.getBean(LibraryRunner.class);
		libraryRunner.run();
		contextFinalChallenge.close();
	}
}