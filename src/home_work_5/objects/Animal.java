package home_work_5.objects;

public class Animal {
    int age; // - возраст (от 1 до 15 лет)
    String nick; // - кличка

    public Animal(int age, String nick) {
        this.age = age;
        this.nick = nick;
    }

    public int getAge() {
        return age;
    }

    public String getNick() {
        return nick;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "возраст " + age +
                ", кличка " + nick + '\'' +
                '}';
    }
}
