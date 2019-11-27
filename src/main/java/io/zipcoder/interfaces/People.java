package io.zipcoder.interfaces;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class People<E extends  Person> implements Iterable{

    //Field
    private ArrayList<E> personList;

    //Constructor
    public People(){
        personList = new ArrayList<>();
    }

    //Methods
    public void add(E pirate){
        personList.add(pirate);
    }

    public E findById (long id) throws Exception {
        for(E pirate : personList){
            if(pirate.getId() == id){ return pirate; }
        }
        throw new Exception("No such Person In List");
    }

    public Boolean contains(E person){
        return personList.contains(person);
    }

    public void remove(E person){
        personList.remove(person);
    }

    public void remove(long id){
        for(E pirate : personList){
            if(pirate.getId() == id){ personList.remove(pirate); }
        }
    }

    public void removeAll(){
        personList = new ArrayList();
    }

    public Integer count(){ return personList.size(); }

    abstract E[] toArray();

    /*
    public Person[] toArray(){
        Person[] pirates = new Person[personList.size()];
        for(int i = 0; i < pirates.length; i++){ pirates[i] = personList.get(i); }
        return pirates;
    }
    */

    @Override
    public Iterator iterator() {
        return personList.iterator();
    }

    public E get(Integer i){
        return personList.get(i);
    }
}
