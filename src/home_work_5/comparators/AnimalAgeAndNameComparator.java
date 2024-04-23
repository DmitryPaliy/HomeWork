package home_work_5.comparators;

import home_work_5.objects.Animal;
import java.util.Comparator;

public class AnimalAgeAndNameComparator implements Comparator<Animal> {
    AnimalAgeComparator ageComparator = new AnimalAgeComparator();

    @Override
    public int compare(Animal animal1, Animal animal2) {
        int ageCompare = ageComparator.compare(animal1, animal2);
        if (ageCompare > 0) {
            return 1;
        }
        if (ageCompare < 0) {
            return -1;
        }
        return Integer.compare(animal1.getNick().compareTo(animal2.getNick()), 0);
    }
}
