package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestStudentsSingleton {

    @Test
    public void gangsAllHereTest() throws Exception {
        Long[] bounties = { (long) 224760, (long) 470000, (long) 350000, (long) 320000, (long) 321000, (long) 300000};
        Students generation = Students.getInstance();

        for(Long bounty : bounties){
            Student pirate = generation.findById(bounty);
            Assert.assertTrue(generation.contains(pirate));
        }
    }
}
