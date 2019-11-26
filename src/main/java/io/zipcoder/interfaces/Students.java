package io.zipcoder.interfaces;

import com.sun.javafx.css.converters.SizeConverter;
import jdk.nashorn.internal.runtime.ECMAException;

import java.util.ArrayList;
import java.util.List;

public final class Students extends People {
    //Field
    private static final Students INSTANCE = new Students();

    //Constructor
    private Students(){
        Student s1 = new Student(224760,"Marshall D. Teach");
        Student s2 = new Student(470000, "Eustass Kid");
        Student s3 = new Student(350000, "Scratchman Apoo");
        Student s4 = new Student(320000, "Basil Hawkins");
        Student s5 = new Student(321000,"Roronoa Zoro");
        Student s6 = new Student(300000, "Capone Bege");
        Student[] superNovas = {s1,s2,s3,s4,s5,s6};

        for(Student pirate : superNovas){ super.add(pirate); }
    }

    @Override
    public Student[] toArray() {
        Long[] bounties = { (long) 224760, (long) 470000, (long) 350000, (long) 320000, (long) 321000, (long) 300000};
        Student[] rookies = new Student[6];
        int i = 0;

        for (Long bounty : bounties) {
            try {
                Student pirate = (Student) INSTANCE.findById(bounty);
                rookies[i] = pirate;
                i++;
            } catch(Exception e) {return null;}
        }
        return rookies;
    }

    //Getter
    public static Students getInstance(){ return INSTANCE; }


}
