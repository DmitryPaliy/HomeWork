package home_work_5.comparators;

import home_work_5.objects.Person;

import java.util.Comparator;

public class PersonPasswordLengthComparator implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
        return (person1.getPassword().length() - person2.getPassword().length());
    }
}
