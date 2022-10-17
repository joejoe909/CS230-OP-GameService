package com.gamingroom;

import java.util.ArrayList;

/**
 * A simple class to hold information about a team
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a team is
 * created.
 * </p>
 * @author joseph.farrish@snhu.edu
 *
 */
public class Team extends Entity {
    private static ArrayList<Player> players = new ArrayList<Player>();
		
	/*
	 * Constructor with an identifier and name
	 */
	public Team(long id, String name) {
		super(id, name);
	}

	public void addPlayer(String name)
	{
	    int id = players.size();
	    players.add(new Player((long)++id, name));
	}
	    	
	@Override
	public String toString() {
		return "Team [id=" + this.getID() + ", name=" + this.getName() + "]";
	}
}
