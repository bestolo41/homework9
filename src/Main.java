import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = generateRandomArray();
        int sum = task1(arr);
        task1(arr); // при вызове этого метода результат выводится два раза: наверное потому что и сам метод выводит на консоль сумму (sout), и
                    // и сам по себе вызов этого метода возвращает сумму (return sum). Удалив sout не выводится ничего. Как это исправить??
        task2(arr);
        task3(arr, sum);
        task4();

    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static int task1(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
        return sum;
    }

    public static void task2(int[] arr) {
        int max, min;
        max = min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.printf("Минимальная сумма трат за день составила %d рублей. Максимальная сумма трат за день составила %d рублей\n", min, max);
    }
    public static void task3(int[] arr, int sum) {
        double average = (double) sum / (double) arr.length; //не уверен что так правильно делать
        System.out.printf("Средняя сумма трат за месяц составила %f рублей\n", average);
    }

    public static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}