package home_work_5.main;

import home_work_5.comparators.PersonPasswordAndNicknameComparator;
import home_work_5.generators.NicknameGenerator;
import home_work_5.generators.PersonDataGenerator;
import home_work_5.objects.Person;
import java.util.*;


public class Main {
    public static void main(String[] args) {

        PersonPasswordAndNicknameComparator personPasswordAndNicknameComparator = new PersonPasswordAndNicknameComparator();

        List<Person> linkedList = generateLinkedList(); // LinkedList
        linkedList.sort(personPasswordAndNicknameComparator); // сортировка LinkedList

        List<Person> arrayList = generateArrayList(); // ArrayList
        arrayList.sort(personPasswordAndNicknameComparator); // сортировка ArrayList

        HashSet<Person> hashSet = generateHashSet(); // HashSet
        List<Person> hashSetlist = new ArrayList<>(hashSet); // сортировка HashSet
        hashSetlist.sort(personPasswordAndNicknameComparator);

        TreeSet<Person> treeSet = generateTreeSet(); // TreeSet отсортирован при создании

        long start1 = System.currentTimeMillis();
        generateLinkedList();
        long finish1 = System.currentTimeMillis();
        System.out.println("Операция заполнения коллекции linkedList заняла " + (finish1 - start1) + " мс");

        long start2 = System.currentTimeMillis();
        linkedList.iterator();
        long finish2 = System.currentTimeMillis();
        System.out.println("Операция итерирования коллекции linkedList заняла " + (finish2 - start2) + " мс");

        long start3 = System.currentTimeMillis();
        linkedList.clear();
        long finish3 = System.currentTimeMillis();
        System.out.println("Операция удаления всех элементов коллекции linkedList заняла " + (finish3 - start3) + " мс");
    }
    public static List<Person> generateLinkedList() {
        List<Person> list = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            list.add(generatePerson());
        }
        return list;
    }

    public static List<Person> generateArrayList() {
        List<Person> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(generatePerson());
        }
        return list;
    }

    public static HashSet<Person> generateHashSet() {
        HashSet<Person> list = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            list.add(generatePerson());
        }
        return list;
    }

    public static TreeSet<Person> generateTreeSet() {
        TreeSet<Person> list = new TreeSet<>(new PersonPasswordAndNicknameComparator());
        for (int i = 0; i < 5; i++) {
            list.add(generatePerson());
        }
        return list;
    }

    public static Person generatePerson() {
        PersonDataGenerator generator = new PersonDataGenerator();
        NicknameGenerator nicknameGenerator = new NicknameGenerator();
        return new Person(nicknameGenerator.angLetterLineGenerator(),
                generator.passwordGenerator(), generator.nameGenerator());
    }
}



