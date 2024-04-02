package home_work_4;

import java.lang.reflect.Array;

//1. Создать класс DataContainer у которого есть один дженерик (обобщение). Например, литерал T. Данный класс как раз и
// будет решать задачу поставленную перед нами: хранить неограниченное количество передаваемых объектов обобщённого
// типа.
//2. Внутри DataContainer должно быть поле T[] data, внутренний массив, которое предназначено для хранения передаваемых
// объектов. Да, именно T[] а не Object[]. Если использовать Object[], то это будет опасно и постоянно придётся делать
// приведение типов. Поле обязательно не static и private
//3. Из-за особенностей дженериков в данном классе обязательно будет присутствовать один конструктор DataContainer(T[]).
// Есть и другие способы, но в рамках обучения они будут сложными и с ними мы разбираться будем слишком сложно.
//4. В данном классе должен быть метод int add(T item) который добавляет данные во внутреннее поле data и возвращает
// номер позиции в которую были вставлены данные, начиная с 0.
//	4.1 Если поле data не переполнено то данные нужно добавлять в первую позицию (ячейку) после последней заполненной
//	позиции (ячейки).
//		4.1.1 Пример: data = [1, 2, 3, null, null, null]. Вызвали add(777). Должно получиться data = [1, 2, 3, 777,
//		null, null]. Метод add вернёт число 3.
//		4.1.2 Пример: data = [1, 2, 3, null, null, null]. Вызвали add(null). Должно получиться data = [1, 2, 3, null,
//		null, null]. Метод add вернёт число -1. -1 будет индикатором того что данный элемент в наш контейнер вставлять
//		нельзя.
//		4.1.3 Пример: data = [1, null, 3, null, null, null]. Вызвали add(777). Должно получиться data = [1, 777, 3,
//		null, null, null]. Метод add вернёт число 1.
//	4.2 В случае если поле data переполнено, нужно придумать механизм, который будет расширять пространство для новых
//	элементов. Тут вам поможет Arrays.copyOf.
//		4.2.1 Пример: data = [1, 2, 3]. Вызвали add(777). Должно получиться data = [1, 2, 3, 777]. Метод add вернёт
//		число 3.
//		4.2.2 Пример: data = []. Вызвали add(777). Должно получиться data = [777]. Метод add вернёт число 0.
//5. В данном классе должен быть метод T get(int index). Данный метод получает из DataContainer'а, из поля data,
// предварительно сохранённый объект который мы передали на предыдущем шаге через метод add.
//	5.1 Пример: data = []. Вызвали add(9999). Получили data = [9999]. Метод add вернул число 0. Вызываем get(0). Метод
//	get возвращает 9999
//	5.2 Пример: data = [9999]. Вызываем get(1). Метод get возвращает null
//6. В данном классе должен быть метод T[] getItems(). Данный метод возвращает массив из поля data.
//7. Добавить метод boolean delete(int index) который будет удалять элемент из нашего поля data по индексу.
//	7.1 Метод возвращает true если у нас получилось удалить данные.
//		7.1.1 Пример data = [1, 2, 3, 777]. Вызывают delete(3). Должно получиться data = [1, 2, 3]. Метод delete
//		вернёт true
//	7.2 Метод возвращает false если нет такого индекса.
//		7.2.1 Пример data = [1, 2, 3, 777]. Вызывают delete(9). Должно получиться data = [1, 2, 3, 777]. Метод delete
//		вернёт false
//	7.3. Освободившуюся ячейку в поеле data необходимо удалить полностью. Пустых элементов не должно быть.
//		7.3.1 Пример data = [1, 2, 3, 777]. Вызывают delete(2). Должно получиться data = [1, 2, 777]. Метод delete
//		вернёт true
//8. Добавить метод boolean delete(T item) который будет удалять элемент из нашего поля data.
//	8.1 Метод возвращает false если передают null.
//		8.1.1 Пример data = [1, 2, 3, 777]. Вызывают delete(null). Метод delete вернёт false a data = [1, 2, 3, 777]
//		8.1.2 Пример data = [1, 2, 3, 777, null]. Вызывают delete(null). Метод delete вернёт false a data = [1, 2, 3,
//		777, null]
//	8.2 Метод возвращает true если у нас получилось удалить данные.
//		8.2.1 Пример data = [1, 2, 3, 777]. Вызывают delete(777). Должно получиться data = [1, 2, 3]. Метод delete
//		вернёт true
//	8.3 Метод возвращает false если нет такого элемента.
//		8.3.1 Пример data = [1, 2, 3, 777]. Вызывают delete(111). Должно получиться data = [1, 2, 3, 777]. Метод delete
//		вернёт false
//	8.4 Освободившуюся ячейку необходимо удалить полностью. Пустых элементов не должно быть.
//		8.4.1 Пример data = [1, 2, 3, 777, 3]. Вызывают delete(3). Должно получиться data = [1, 2, 777, 3]. Метод
//		delete вернёт true
//9. Добавить НЕ СТАТИЧЕСКИЙ метод void sort(Comparator<.......> comparator). Данный метод занимается сортировкой
// данных записанных в поле data используя реализацию сравнения из ПЕРЕДАННОГО объекта comparator. Классом Arrays
// пользоваться запрещено. Интерфейс Comparator обязательно должен быть реализован отдельным классом. Для каждого типа
// данных и сравнений программист создаёт отдельную реализацию интерфейса Comparator.
//	9.1 Пример data = [3, 1, 3, 777]. Вызывают sort(....) передавая компаратор чисел. Должно получиться
//	data = [1, 3, 3, 777]
//	9.2 Пример data = ["i", "hello", "1", "Как домашка"]. Вызывают sort(....) передавая компаратор строк по длине.
//	Должно получиться data = ["i", "1", "hello", "Как домашка"]
//10. Переопределить метод toString() в классе и выводить содержимое data без ячеек в которых хранится null. Запрещено
// использовать Arrays.toString()
//	10.1 Пример data = [1, 2, 3, 777, 3]. Вызывают toString() у созданного DataContainer. Возвращается строка
//	[1, 2, 3, 777, 3]
//	10.2 Пример data = [1, 2, 3, null]. Вызывают toString() у созданного DataContainer. Возвращается строка [1, 2, 3]
//	10.3 Пример data = []. Вызывают toString() у созданного DataContainer. Возвращается строка []
public class DataContainer <T> {
    private T[] data;
    private T[] temporary;
    private int n = 0;
    public DataContainer (Class<T> dataIn, int size) {
        data = (T[]) Array.newInstance(dataIn, size);
    }
    public int add(T item) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) { //в ближайшую пустую ячейку записываем ссылку на item
                data[i] = item;
                n = i; //записываем индекс ячейки с новым элементом
                break;
            } else if (i == data.length - 1) {
                Class<T> tempData = null;
                int a = data.length + 1; //можно добавить любое количество ячеек код ниже не изменится
                IncreaseDataContainer<T> var1 = new IncreaseDataContainer<>(tempData, a);
                temporary = var1.getIncData();
                for (int j = 0; j < data.length; j++) {
                    temporary[j] = data[j];
                }
                temporary[data.length] = item;
                n = data.length; //записываем индекс ячейки с новым элементом
                data = temporary; //переносим увеличенный массив в поле data
            }
        }
        return n;
    }
    public T get(int index) {
        return data[index];
    }
    public T[] getItems() {
        return data;
    }
    public boolean delete(int index) {
        if (index >= data.length) {
            return false;
        } else {
            Class<T> tempData1 = null;
            int a = data.length - 1;
            IncreaseDataContainer<T> var1 = new IncreaseDataContainer<>(tempData1, a);
            temporary = var1.getIncData();
            for (int i = 0; i < a; i++) {
                if (i != index) { // Копируем всё кроме index, элементы после index смещаются влево
                    int newIndex = i < index ? i : i - 1;
                    temporary[newIndex] = data[i];
                }
            }
            data = temporary;
        }
        return true;
    }
    public boolean delete(T item) {
        boolean b = false;
        if (item == null) {
            return false;
        } else {
            for (T dat : data) {
                if (dat.equals(item)) {
                    b = true;
                    break;
                } else {
                    return false;
                }
            }
        }
        if (b) {
            Class<T> tempData1 = null;
            int a = data.length - 1;
            IncreaseDataContainer<T> var2 = new IncreaseDataContainer<>(tempData1, a);
            temporary = var2.getIncData();
            int i = 0;
            for (; i < a; i++) {
                if (!data[i].equals(item)) {
                    temporary[i] = data[i];
                } else {
                    break;
                }
            }
            int newIndex = i - 1;
            for (; i < a; i++) {
                temporary[newIndex] = data[i];
            }
            data = temporary;
        }
        return false;
    }
    //void sort(Comparator<.......> comparator) {

    }
