package home_work_5.comparators;

import home_work_5.objects.Person;

import java.util.Comparator;

public class PersonPasswordAndNicknameComparator implements Comparator<Person> {
    PersonPasswordLengthComparator passwordLengthComparator = new PersonPasswordLengthComparator();

    @Override
    public int compare(Person person1, Person person2) {
        int passwordLengthCompare = passwordLengthComparator.compare(person1, person2);
        if (passwordLengthCompare > 0) {
            return 1;
        }
        if (passwordLengthCompare < 0) {
            return -1;
        }
        return Integer.compare(person1.getNick().compareTo(person2.getNick()), 0);
    }
}
