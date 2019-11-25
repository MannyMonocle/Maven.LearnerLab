package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {

    @Test
    public void testAdd(){
        People supernovas = new People();
        Person luffy = new Person(1,"Monkey D. Luffy");

        supernovas.add(luffy);

        Assert.assertTrue(supernovas.contains(luffy));
    }
}
