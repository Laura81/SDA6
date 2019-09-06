package statistics;

public class PersonStatistics {

    Person[] persons;

    public PersonStatistics(Person[] persons) {
        this.persons = persons;
    }

    public Person oldestPerson() {
        Person oldest = new Person();
        for (int i = 0; i <= persons.length; ++i) {
            if (persons[i].getAge() > oldest.getAge()) {
                oldest = persons[i];
            }
        }
        return oldest;
    }

   /* public Person countPeople() {
        int maleCount = 0;
        int femaleCount = 0;
        for (int i = 0; i <= persons.length; ++i) {
            if (persons[i].getSex().contains("M")) {
                maleCount++;
            }
            if (persons[i].getSex().contains("F")) {
                femaleCount++;
            }
        }

    }*/
}

