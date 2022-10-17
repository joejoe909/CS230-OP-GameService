package com.gamingroom;

/**
 * A class to test a singleton's behavior
 * 
 * @author coce@snhu.edu
 */
public class SingletonTester {

	public void testSingleton() {
		
		System.out.println("\nAbout to test the singleton...");
		
		// obtain local reference to the singleton instance
		GameService service = GameService.CreateGameService(); // Test singleton functionality. 
		
		service.getGameCount();
	}
	
}
