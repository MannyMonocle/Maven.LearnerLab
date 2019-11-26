package io.zipcoder.interfaces;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

public class People implements Iterable{

    private ArrayList<Person> personList;

    public People(){
        personList = new ArrayList<>();
    }

    public void add(Person pirate){
        personList.add(pirate);
    }

    public Person findById (long id) throws Exception {
        for(Person pirate : personList){
            if(pirate.getId() == id){ return pirate; }
        }
        throw new Exception("No such Person In List");
    }

    public Boolean contains(Person person){
        return personList.contains(person);
    }

    public void remove(Person person){
        personList.remove(person);
    }

    public void remove(long id){
        for(Person pirate : personList){
            if(pirate.getId() == id){ personList.remove(pirate); }
        }
    }

    public void removeAll(){
        personList = new ArrayList();
    }

    public Integer count(){ return personList.size(); }

    public Person[] toArray(){
        Person[] pirates = new Person[personList.size()];
        for(int i = 0; i < pirates.length; i++){ pirates[i] = personList.get(i); }
        return pirates;
    }

    @Override
    public Iterator iterator() {
        return personList.iterator();
    }
}
