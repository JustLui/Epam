package presentation;
import entitites.Jewellery;
import entitites.Stone;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static int taskMenu(BufferedReader read) throws IOException {
        System.out.println("1. Total price and weight: ");
        System.out.println("2. Sort stones by value: ");
        System.out.println("3. Sort stones in the transparency range: ");
        System.out.print("What Do you need ? ( Enter number): ");

        int task = Integer.parseInt(read.readLine());
        while (task < 1 || task > 3) {
            System.out.print("Incorrect number of the task. Try again: ");
            task = Integer.parseInt(read.readLine());
        }
        return task;
    }

    public static void printStonesSortByPrice(List<Stone> stones){
        stones.sort(Comparator.comparingInt(Stone::getPrice));
        for (Stone stone : stones) {
            System.out.println(stone);
        }
    }
    
    public static void printPriceAndWeight(Jewellery jewellery){
        int totalPrice = 0;
        int totalWeight = 0;
        for (Stone stone : jewellery.getStones()) {
            totalPrice+= stone.getPrice();
            totalWeight+= stone.getWeight();
        }

        double totalWeightCarat = totalWeight / 0.2;

        System.out.println("Total price: " + totalPrice + "\nTotal weight(Carat): " + totalWeightCarat);
    }

    public static void printStonesTransparencyRange(Jewellery jewellery) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the transparency range(Min): ");
        int rangeMin = Integer.parseInt(read.readLine());
        System.out.println("Enter the transparency range(Max): ");
        int rangeMax = Integer.parseInt(read.readLine());

        for (Stone stone : jewellery.getStones()) {
            if ((rangeMin <= stone.getTransparency()) && (stone.getTransparency() <= rangeMax)) {
                stone.getPrice();
                System.out.println(stone);
            }
        }
        System.out.println("No stone in this range");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        Jewellery jewellery = new Jewellery();

        int taskNumber = taskMenu(read);
        switch (taskNumber)   {
            case 1:
                printPriceAndWeight(jewellery);
                break;
            case 2:
                printStonesSortByPrice(jewellery.getStones());
                break;
            case 3:
                printStonesTransparencyRange(jewellery);
                break;
        }
    }
}