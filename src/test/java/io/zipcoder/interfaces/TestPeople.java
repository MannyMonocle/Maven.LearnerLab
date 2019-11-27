package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {

    @Test
    public void testAdd(){
        People supernovas = Students.getInstance();
        Person luffy = new Person(1,"Monkey D. Luffy");

        supernovas.add(luffy);

        Assert.assertTrue(supernovas.contains(luffy));
        supernovas.removeAll();
    }

    @Test
    public void testRemove(){
        People supernovas = Students.getInstance();
        Person luffy = new Person(1,"Monkey D. Luffy");

        supernovas.add(luffy);
        supernovas.remove(luffy);

        Assert.assertFalse(supernovas.contains(luffy));
        supernovas.removeAll();
    }

    @Test
    public void testFindById() throws Exception {
        People supernovas = Students.getInstance();
        Person luffy = new Person(1,"Monkey D. Luffy");
        //Person kid = new Person(2, "Eustass Kid");

        supernovas.add(luffy);
        //supernovas.add(kid);

        Person actual = supernovas.findById(1);

        Assert.assertEquals(luffy,actual);
        supernovas.removeAll();
    }
}
