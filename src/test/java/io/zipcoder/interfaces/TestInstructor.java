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


}
