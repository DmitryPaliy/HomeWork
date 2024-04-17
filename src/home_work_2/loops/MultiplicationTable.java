package home_work_2.loops;
//1.6. Вывести таблицу умножения в консоль. В консоли должно получиться также, как и на картинке
// (динозаврика рисовать не надо): https://www.dropbox.com/s/ibakfuppvy2w32g/multiplication_table.jpeg?dl=0
public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            for (int k = 2; k < 6; k++) {
                System.out.print(k + " x " + i + " = " + k * i + "      ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        for (int i = 1; i < 11; i++) {
            for (int k = 6; k < 10; k++) {
                System.out.print(k + " x " + i + " = " + k * i + "      ");
            }
            System.out.println(" ");
        }
    }
}
