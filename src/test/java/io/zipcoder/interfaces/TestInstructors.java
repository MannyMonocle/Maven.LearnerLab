package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test
    public void seasInBalanceTest() throws Exception {
        Long[] bounties = { (long) 55648, (long) 50460, (long) 43880};
        Instructors sanko = Instructors.getInstance();

        for(Long bounty : bounties){
            Instructor pirate = (Instructor) sanko.findById(bounty);
            Assert.assertTrue(sanko.contains(pirate));
        }
    }
}
