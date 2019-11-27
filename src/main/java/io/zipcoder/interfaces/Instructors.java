package io.zipcoder.interfaces;

public class Instructors extends People<Instructor>{

    //Fields
    private static final Instructors INSTANCE = new Instructors();

    //Constructor
    private Instructors(){
        Instructor m1 = new Instructor(55648,"Gol D. Roger");
        Instructor m2 = new Instructor(50460,"Edward Newgate");
        Instructor m3 = new Instructor(43880,"Charlotte Linlin");
        Instructor[] sanko = {m1,m2,m3};

        for(Instructor emperor : sanko){ super.add(emperor); }
    }

    //Getter
    public static Instructors getInstance() {return INSTANCE; }

    public Instructor[] toArray() {
        Instructor[] sanko = new Instructor[INSTANCE.count()];
        for (int i = 0; i < sanko.length; i++) { sanko[i] = INSTANCE.get(i); }
        return sanko;
    }
}
