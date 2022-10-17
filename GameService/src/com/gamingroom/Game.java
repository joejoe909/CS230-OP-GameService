package com.gamingroom;
import java.util.ArrayList;


/**
 * A simple class to hold information about a game
 * 
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a game is
 * created.
 * </p>
 * 
 * @author joseph.farrish@snhu.edu
 *
 */
public class Game extends Entity {
    // Hide the default constructor to prevent creating empty instances.
    private static ArrayList<Team> teams = new ArrayList<Team>();

	//	private Game() {} 
    /**
	 * Constructor with an identifier and name
	 */
	public Game(long id, String name) {
	    super(id, name);
	}

	public Team addTeam(String name) {
	    int id = teams.size();
	    Team newTeam = new Team((long)++id, name);
	    return newTeam;
	}
	
	/**
	 * Overrides toString - returns a string holding id and the name. 
	 * @return String toString
	 */
	@Override
	public String toString() {
		
		return "Game [id=" + this.getID() + ", name=" + this.getName() + "]";
	}

}
