package io.zipcoder.interfaces;

public interface Teacher {

    //Methods
    void teach(Learner learner, double numberOfHours);

    void lecture(Learner[] learners, double numberOfHours);

}
