package io.zipcoder.interfaces;

import java.awt.*;
import java.util.ArrayList;

public class People {

    ArrayList personList;

    public People(){
        personList = new ArrayList();
    }

    public void add(Person pirate){
        personList.add(pirate);
    }

}
