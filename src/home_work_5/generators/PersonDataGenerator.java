package home_work_5.generators;

import java.util.Random;

public class PersonDataGenerator {
    private final String[] listName = new String[] {"Акулина", "Александр", "Александра", "Алексей", "Алена", "Алина",
            "Алиса", "Алла", "Алсу", "Альберт", "Альбина", "Амалия", "Анастасий", "Анастасия", "Анатолий", "Ангелина",
            "Андрей", "Анжела", "Анжелика", "Анисий", "Анна", "Антон", "Антонина", "Анфиса", "Аполлинарий",
            "Аполлон", "Арина", "Аристарх", "Аркадий", "Арсен", "Арсений", "Артем", "Артемий", "Артур", "Архип",
            "Ася", "Бенедикт", "Богдан", "Божена", "Болеслав", "Борис", "Борислав", "Бронислав", "Бронислава",
            "Булат", "Вадим", "Валентин", "Валентина", "Валерий", "Валерия", "Ванда", "Варвара", "Василий",
            "Василиса", "Венера", "Вениамин", "Вера", "Вероника", "Викентий", "Виктор", "Виктория", "Вилен",
            "Виолетта", "Виссарион", "Вита", "Виталий", "Влад", "Владимир", "Владислав", "Владислава", "Владлен",
            "Вольдемар", "Всеволод", "Вячеслав", "Гавриил", "Галина", "Гелла", "Геннадий", "Георгий", "Герман",
            "Гертруда", "Глафира", "Глеб", "Гордей", "Григорий", "Давид", "Даниил", "Дарина", "Дарья", "Демьян",
            "Денис", "Диана", "Дина", "Динара", "Дмитрий", "Добрыня", "Дора", "Ева", "Евгений", "Евгения", "Евдоким",
            "Евдокия", "Егор", "Екатерина", "Елена", "Елизавета", "Елисей", "Есения", "Ефим", "Ефрем", "Ефросинья",
            "Жанна", "Ждан", "Захар", "Зинаида", "Зиновий", "Злата", "Зорий", "Зоряна", "Зоя", "Иван", "Иветта",
            "Игнатий", "Игорь", "Изольда", "Илга", "Илларион", "Илона", "Илья", "Инга", "Инесса", "Инна",
            "Иннокентий", "Иосиф", "Ираида", "Ирина", "Казимир", "Калерия", "Капитолина", "Карина", "Каролина",
            "Касьян", "Кир", "Кира", "Кирилл", "Клавдия", "Клара", "Клим", "Климент", "Кондрат", "Константин",
            "Кристина", "Ксения", "Кузьма", "Лада", "Лариса", "Лев", "Леонид", "Леонтий", "Леся", "Лидия", "Лика",
            "Лилия", "Лина", "Лолита", "Луиза", "Лукьян", "Любовь", "Людмила", "Магдалина", "Майя", "Макар",
            "Максим", "Марат", "Маргарита", "Марианна", "Марина", "Мария", "Марк", "Марта", "Марфа", "Матвей",
            "Милана", "Милена", "Мирон", "Мирослава", "Мирра", "Митрофан", "Михаил", "Модест", "Моисей", "Надежда",
            "Назар", "Наталия", "Наталья", "Наум", "Нелли", "Ника", "Никанор", "Никита", "Никифор", "Николай",
            "Никон", "Нина", "Нинель", "Нонна", "Нора", "Оксана", "Олег", "Олеся", "Ольга", "Павел", "Парамон",
            "Петр", "Платон", "Полина", "Прасковья", "Прохор", "Рада", "Радмила", "Раиса", "Раяна", "Регина", "Ренат",
            "Рената", "Римма", "Ринат", "Рита", "Родион", "Роза", "Роксана", "Роман", "Россияна", "Ростислав",
            "Руслан", "Рустам", "Савва", "Савелий", "Самсон", "Светлана", "Святослав", "Севастьян", "Семен",
            "Серафима", "Сергей", "Снежана", "София", "Софья", "Станислав", "Стелла", "Степан", "Стефания",
            "Таисия", "Тамара", "Тамила", "Тарас", "Татьяна", "Терентий", "Тимофей", "Тимур", "Тихон", "Трофим",
            "Ульяна", "Фаддей", "Фаина", "Федор", "Федот", "Феликс", "Филат", "Филимон", "Филипп", "Фома", "Фрида",
            "Чарли", "Эдита", "Эдуард", "Элеонора", "Элина", "Эльвира", "Эльдар", "Эльза", "Эмма", "Эрик", "Эрика",
            "Юлиан", "Юлиана", "Юлий", "Юлия", "Юрий", "Яков", "Ян", "Яна", "Янина", "Ярослав"};

    public String passwordGenerator() {
        StringBuilder line = new StringBuilder();
        Random rnd = new Random();
        for (int i = 0; i < (5 + rnd.nextInt(11)); i++) {
            line.append((char) (33 + rnd.nextInt(94)));
        }
        return line.toString();
    }

    public String rusLetterLineGenerator() {
        StringBuilder line = new StringBuilder();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                line.append((char) (1040 + rnd.nextInt(1073 - 1040)));
            }
            line.append((char) (1072 + rnd.nextInt(1104 - 1072)));
        }
        return line.toString();
    }

    public String nameGenerator() {
        Random rnd = new Random();
        int element = rnd.nextInt(listName.length - 1);
        return listName[element];
    }

    public String nameGeneratorFromAcceptedList(String[] listName) {
        Random rnd = new Random();
        int element = rnd.nextInt(listName.length - 1);
        return listName[element];
    }
}
