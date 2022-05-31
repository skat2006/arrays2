import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        int[] array = randomIntArray();

        // задача 1
        int totalSum = 0;
        for (int value : array) {
            totalSum += value;
        }
        System.out.println("Сумма трат за месяц составила " + totalSum + " рублей\n");

        // задача 2
        int maxNum = array[0];
        int minNum = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minNum) {
                minNum = array[i];
            }
            if (array[i] > maxNum) {
                maxNum = array[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minNum + " рублей.\nМаксимальная сумма трат за день составила " + maxNum + " рублей");

        // задача 3
        int summary = 0;
        for (int value : array) {
            summary += value;
        }
        float res = (float) summary / (float) array.length;
        System.out.println("\nСредняя сумма трат за месяц составила " + res + " рублей\n");

        // задача 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i > -1; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    private static int[] randomIntArray() {
        int[] arr = new int[30];
        System.out.println("Случайные числа в массиве: ");
        for (int i = 0; i < 30; i++) {
            arr[i] = (int) (Math.random() * ((200000 - 100000) + 1)) + 100000;
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
        return arr;
    }
}