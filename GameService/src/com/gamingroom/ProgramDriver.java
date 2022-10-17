package com.gamingroom;

/**
 * Application start-up program
 * 
 * @author: Joe Farrish 
 * @email: joseph.farrish@snhu.edu
 */
public class ProgramDriver {
	
	/**
	 * The one-and-only main() method
	 * 
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		
		// FIXME: obtain reference to the singleton instance
		GameService service = GameService.CreateGameService(); // instantiate GameService GameService method. 
		
		System.out.println("\nAbout to test initializing game data...");
		
	
		// Create game1 then add players to it.
		Game game1 = service.addGame("Game #1");
		System.out.println(game1);
		
		//Setup Team1.
		Team team1 = new Team(service.getNextTeamId(), "Team #1");
		Player player1 = new Player(service.getNextPlayerId(), "player #1");
		Player player2 = new Player(service.getNextPlayerId(), "player #2");
		
		//Setup Team2.
	    Team team2 = new Team(service.getNextTeamId(), "Team #2");
	    Player player3 = new Player(service.getNextPlayerId(), "player #3");
	    Player player4 = new Player(service.getNextPlayerId(), "player #4");
						
		// add teams to game1.
		game1.addTeam(team1.getName());
		game1.addTeam(team2.getName());
				
		// Create game2 then add players to it.
		Game game2 = service.addGame("Game #2");
		System.out.println(game2);
		
		//Setup Team3.
        Team team3 = new Team(service.getNextTeamId(), "Team #3");
        Player player5 = new Player(service.getNextPlayerId(), "player #5");
        Player player6 = new Player(service.getNextPlayerId(), "player #6");
        
        //Setup Team4.
        Team team4 = new Team(service.getNextTeamId(), "Team #4");
        Player player7 = new Player(service.getNextPlayerId(), "player #7");
        Player player8 = new Player(service.getNextPlayerId(), "player #8");
        
        // add teams to game2.
        game2.addTeam(team3.getName());
        game2.addTeam(team4.getName());
		
		// use another class to prove there is only one instance
		SingletonTester tester = new SingletonTester();
		tester.testSingleton();
		
		// Test our data.
		System.out.println( "Test the games class.");
		System.out.println(game1.getID() + " " + game1.getName());
		System.out.println(game2.getID() + " " + game2.getName());
        System.out.println( "Test the games class.");
		System.out.println(team1.getID() + " " + team1.getName());
		System.out.println(team3.getID() + " " + team2.getName());
		System.out.println(team3.getID() + " " + team3.getName());
		System.out.println(team4.getID() + " " + team4.getName());
	    System.out.println( "Test the player class.");
	    System.out.println(player1.getID() + " " + player1.getName());
	    System.out.println(player2.getID() + " " + player2.getName());
	    System.out.println(player3.getID() + " " + player3.getName());
	    System.out.println(player4.getID() + " " + player4.getName());
	    System.out.println(player5.getID() + " " + player5.getName());
	    System.out.println(player6.getID() + " " + player6.getName());
	    System.out.println(player7.getID() + " " + player7.getName());
	    System.out.println(player8.getID() + " " + player8.getName());
	    
	    
	    
	    
	    
	}
}
