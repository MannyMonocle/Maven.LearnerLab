package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor(){
        Long expectedId = Long.MAX_VALUE;
        String expectedName = "Monkey D. Luffy";

        Person pirateKing = new Person(expectedId, expectedName);
        Long actualId = pirateKing.getId();
        String actulName = pirateKing.getName();

        Assert.assertEquals(expectedId,actualId);
        Assert.assertEquals(expectedName,actulName);
        
    }

    @Test
    public void testSetName(){
        Long expectedId = Long.MAX_VALUE;
        String oldName = "Monkey D. Luffy";
        String expectedName = "Gol D. Rogger";

        Person pirateKing = new Person(expectedId, oldName);
        pirateKing.setName(expectedName);
        String actulName = pirateKing.getName();

        Assert.assertEquals(expectedName,actulName);
    }
}
