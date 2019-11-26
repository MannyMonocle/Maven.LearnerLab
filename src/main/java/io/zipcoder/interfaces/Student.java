package io.zipcoder.interfaces;

public class Student extends Person implements Learner {
    //Field
    private double totalStudyTime;

    //Constructor
    public Student(long id, String name){
        super(id, name);
        totalStudyTime = 0;
    }

    //Method
    public void learn(Double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    //Getter
    public Double getTotalStudyTime(){
        return totalStudyTime;
    }
}
