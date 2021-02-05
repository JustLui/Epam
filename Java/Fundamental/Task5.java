import java.util.Scanner;

public class Task5 {
    private static void getMonths(int numberOfMonth) throws ArrayIndexOutOfBoundsException{
        String[] yearMonth = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь",
                "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
        String month;
        month = yearMonth[numberOfMonth - 1];
        System.out.println("Месяц: " + month);
    }

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число месяца(1-12): ");
        int numberOfMonth = scanner.nextInt();
        try {
            getMonths(numberOfMonth);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Не правильно введенное число месяца.");
        }
    }
}
