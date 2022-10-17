package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;


/**
 *  GameService utilizes a Singleton pattern to constrain the service 
 *  to a single instance. It utilizes a iterator pattern to ensure team
 *  names stay unique. 
 * 
 * @author joseph.farrish@snhu.edu
 */
public class GameService {
 // use CreateGameService to create a single instance.
    private static ArrayList<Game> games = new ArrayList<Game>(); 
    private static long nextGameId = 1;
    private static long nextPlayerId = 0;
    private static long nextTeamId = 0;
    private static GameService service;

	// Use CreateGameService() to initialize service.    
	private GameService() {} 
	
	   /**
     * Use this public method to call the private, singleton constructor.
     *  
     * @return GameService object - only one will be allowed else you will 
     * receive a message that the GameService object has already been 
     * created. 
     */
    public static GameService CreateGameService() {
        if(service == null) {
            service = new GameService();
            System.out.println("Game Service created.\n");
        }else {
            System.out.println("Game Service already created.\n");
        }
        return service;     
    }    
	
	
	public GameService getInstance() {
	    return service;
	}
	
    /**
     * addGame adds a new game to the game service using an  
     * iterator pattern. In this design we ensure that no
     * two games have the same name. 
     * 
     * @param name the unique name of the game
     * @return the unique game instance (new or a pre-existing if name matches).
     */
	public Game addGame(String name) {
		// a local game instance
		Game game = null;

		// Iterator to look for existing game with same name
		// if found, simply return the existing instance
		Iterator<Game> gmItr = games.iterator();
		 // console output
        while(gmItr.hasNext()) {
        	game = (Game) gmItr.next();        // Use casting to quickly retrieve the a game object from an iterator!
        	if(game.getName() == name) {
        		System.out.println("game already present, not added.\n");
        		return game;
        	}
        }
        
        game = null;
		
		// if not found, make a new game instance and add to list of games
		if (game == null) {
			game = new Game(nextGameId++, name);
			games.add(game);
		}

		// return the new/existing game instance to the caller
		return game;
	}

    /**
     * Returns the game instance at the specified index.
     * <p>
     * Scope is package/local for testing purposes.
     * </p>
     * @param index index position in the list to return
     * @return requested game instance
     */
	public Game getGame(long id) {

		// a local game instance
		Game game = null;

		// Use iterator to look for existing game with same id
		// if found, simply assign that instance to the local variable
		Iterator<Game> gmItr = games.iterator();
		
		while(gmItr.hasNext()) {
			game = (Game) gmItr.next();
			if(game.getID() == id) {
				return game;
			}
		}
				
		return game;
	}

    /**
     * Returns the game instance with the specified id. This
     * is done using an iterator pattern. We use casting to efficiently
     * return the desired game.
     * 
     * @param id unique identifier of game to search for
     * @return requested game instance
     */
	public Game getGame(String name) {

		// a local game instance
		Game game = null;

		// Use iterator to look for existing game with same name
		// if found, simply assign that instance to the local variable
		Iterator<Game> gmItr = games.iterator();
		while(gmItr.hasNext()) {
			game = (Game) gmItr.next();
			if(game.getName() == name) {
				return game;
			}
		}
				
		return game;
	}

	/**
	 * Returns the number of games currently active
	 * 
	 * @return the number of games currently active
	 */
	public int getGameCount() {
		return games.size();
	}
	
	 /**
     * Returns the next available player ID.
     * 
     * @return Returns the next available ID.
     */
	public long getNextPlayerId() {
	    nextPlayerId++;
	    return nextPlayerId;
	}
	
    /**
     * Returns the next available team ID.
     * 
     * @return Returns the next available team ID.
     */
	public long getNextTeamId() {
	    nextTeamId++;
	    return nextTeamId;
	}
}
