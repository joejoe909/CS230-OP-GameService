package com.gamingroom;

public class Entity {
    private long id;
    private String name;

    public Entity() {
    }

    /**
     * Constructor with an identifier and name
     */
    public Entity(long id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Returns the id of a Entity object.
     * 
     * @return long
     */
    public long getID() {
        return this.id;
    }

    /**
     * Returns a string holding the name of the Entity object.
     * 
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Overrides toString - returns a string holding id and the name.
     * 
     * @return String toString
     */
    public String toString() {
        return "Entity [id=" + id + ", name=" + name + "]";
    }

}
