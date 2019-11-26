package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class TestGrandLine {

    @Test
    public void testHostLecture()throws Exception {
        GrandLine seas = new GrandLine();
        seas.hostLecture(43880,60);
        HashMap studyMap = seas.getStudyMap();
        Student blackbeard = (Student) Students.getInstance().findById(224760);
        Double actual = (Double) studyMap.get(blackbeard);

        Assert.assertEquals(10.0,actual,0.0001);
    }
}
