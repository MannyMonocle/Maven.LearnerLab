package io.zipcoder.interfaces;

public class Person {
    //Fields
    private final long id;
    private String name;

    //Constructor
    public Person(long id, String name){
        this.id = id;
        this.name = name;
    }

    //Getters n Setters
    public long getId(){ return this.id; }

    public String getName(){ return this.name; }

    public void setName(String name){ this.name = name; }

}
