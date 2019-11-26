package io.zipcoder.interfaces;

public class Instructors extends People{

    private static final Instructors INSTANCE = new Instructors();

    private Instructors(){
        Instructor m1 = new Instructor(55648,"Gol D. Roger");
        Instructor m2 = new Instructor(50460,"Edward Newgate");
        Instructor m3 = new Instructor(43880,"Charlotte Linlin");
        Instructor[] sanko = {m1,m2,m3};

        for(Instructor emperor : sanko){ super.add(emperor); }
    }

    public static Instructors getInstance() {return INSTANCE; }
}
