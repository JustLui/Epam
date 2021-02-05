import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class OptionalTask {
    public static int getCountsOfDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    public static void main(String[] args) throws Exception {
        BufferedReader goes = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите размерность массива: ");
        int sizeOfArray = Integer.parseInt(goes.readLine());
        int[] array = new int[sizeOfArray];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите число: ");
            array[i] = Integer.parseInt(goes.readLine());
        }

        Arrays.sort(array);
        int minNumber = array[0];
        int maxNumber = array[array.length - 1];
        System.out.println("Минимальное число: " + minNumber + " | " +
                "Его длинна равна: " + OptionalTask.getCountsOfDigits(minNumber));
        System.out.println("Минимальное число: " + maxNumber + " | "
                + "Его длинна равна: " + OptionalTask.getCountsOfDigits(maxNumber));


// Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.

        double average = 0;
        for (int number : array) {
            average += getCountsOfDigits(number);
        }
        average = average / array.length;

        System.out.println("Средняя длинна чисел: " + average);
        for (int i = 0; i < array.length; i++) {
            if (getCountsOfDigits(array[i])<average) {
                System.out.println("Число меньшее средней длинны: " + array[i] + " | " +
                        "Его длинна равна: " + OptionalTask.getCountsOfDigits(array[i]));
            }
            if (getCountsOfDigits(array[i])>average) {
                System.out.println("Число больше средней длинны: " + array[i] + " | " +
                        "Его длинна равна: " + OptionalTask.getCountsOfDigits(array[i]));
            }
        }
    }
}