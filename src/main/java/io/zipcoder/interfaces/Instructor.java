package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher{

    //Constructor
    public Instructor(long id, String name){
        super(id,name);
    }

    //Methods
    public void teach(Learner learner, double numberOfHours){
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours/learners.length;
        for(Learner student : learners){ student.learn(numberOfHoursPerLearner); }
    }


}
