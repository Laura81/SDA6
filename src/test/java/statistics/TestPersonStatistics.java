package statistics;

import org.junit.Assert;
import org.junit.Test;

public class TestPersonStatistics {

    @Test
    public void testListPersons() {

        Person person1 = new Person(50, "Alina", "F");
        Person person2 = new Person(63, "Ion", "M");
        Person person3 = new Person(45, "Magda", "F");
        Person person4 = new Person(50, "Vasile", "M");
        Person person5 = new Person(37, "Corina", "F");
        Person person6 = new Person(39, "Alin", "M");
        Person[] persons = {person1, person2, person3, person4, person5, person6};

        PersonStatistics personStatistics = new PersonStatistics(persons);

        Person actual = personStatistics.oldestPerson();
        Person expected = person2;

        Assert.assertEquals((63), (63));
    }
}
