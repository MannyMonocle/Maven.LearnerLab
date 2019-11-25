package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation(){
        Instructor mentor = new Instructor(0,"Silvers Rayleigh");

        Assert.assertTrue(mentor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        Instructor mentor = new Instructor(0,"Silvers Rayleigh");

        Assert.assertTrue(mentor instanceof Person);
    }

    @Test
    public void testTeach(){
        Instructor mentor = new Instructor(0,"Silvers Rayleigh");
        Student  s1 = new Student(1,"Monkey D. Luffy");

        mentor.teach(s1,10.0);

        Assert.assertEquals(10.0, s1.getTotalStudyTime(), 0.001);
    }

    @Test
    public void testLecture(){
        Instructor mentor = new Instructor(0,"Silvers Rayleigh");
        Student  s1 = new Student(1,"Monkey D. Luffy");
        Student s2 = new Student(2, "Eustass Kid");
        Student[] rookies = {s1,s2};

        mentor.lecture(rookies,20.0);

        Assert.assertEquals(10.0,s1.getTotalStudyTime(),0.001);
    }

}
