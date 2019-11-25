package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher{

    public Instructor(long id, String name){
        super(id,name);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours/learners.length;
        for(Learner student : learners){ student.learn(numberOfHoursPerLearner); }
    }


}
