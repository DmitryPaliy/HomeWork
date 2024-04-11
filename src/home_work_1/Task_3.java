package home_work_1;

public class Task_3 {
    public static void main(String[] args) {
        double a = Math.abs(-10); //возвращает абсолютное значение числа
        System.out.println(a);
        double b = Math.cbrt(8); //возвращает кубический корень числа
        System.out.println(b);
        double c = Math.ceil(1.35); //возвращает наименьшее целое число с плавающей точкой, которое не меньше значения
        System.out.println(c);
        double d = Math.max(10, 4); //возвращает максимальное число из двух
        System.out.println(d);
        double e = Math.pow(3, 2); //возвращает первое число, возведенное в степень второго
        System.out.println(e);
        System.out.println(Math.signum(-2.3)); //возвращает число 1, если число value положительное, и -1,
        //если значение value отрицательное. Если value равно 0, то возвращает 0
        double f = Math.sqrt(25); //возвращает квадратный корень числа
        System.out.println(f);
    }
}
