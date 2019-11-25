package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation(){
        Student weirdKid = new Student(123456789, "Foxy Silver");
        Assert.assertTrue(weirdKid instanceof Learner);
    }

    @Test
    public void testInheritance(){
        Student weirdKid = new Student(123456789, "Foxy Silver");
        Assert.assertTrue(weirdKid instanceof Person);
    }

    @Test
    public void testLearn(){
        Student weirdKid = new Student(123456789, "Foxy Silver");
        weirdKid.learn(10.0);
        weirdKid.learn(12.3);
        Double actual = weirdKid.getTotalStudyTime();

        Assert.assertEquals(22.3,actual,0.001);
    }
}
