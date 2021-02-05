import java.io.*;
import java.util.*;

public class Actions {

    private final String fileWithVerse = "C:\\Study\\src\\Verse.txt";

    public List<String> printStringsFromFileTolist () throws FileNotFoundException {
        List<String> listOfStrings = new ArrayList<>();
        FileReader fileReader = new FileReader(fileWithVerse);
        Scanner readStringsFromFile = new Scanner(fileReader);
        while (readStringsFromFile.hasNextLine()) {
            listOfStrings.add(readStringsFromFile.nextLine());
        }
        return listOfStrings;
    }

    public void printStringsToFileFromListInReverseOrder(List<String> listOfStrings) {
        try (BufferedWriter bufferedWriter =
                     new BufferedWriter(new FileWriter(fileWithVerse, true))) {
            bufferedWriter.newLine();
            bufferedWriter.write("\nВывод строк в обратном порядке:" +
                    "\n______________________________");
            for (int i = listOfStrings.size() - 1; i >= 0; i--) {
                bufferedWriter.newLine();
                bufferedWriter.write(listOfStrings.get(i));
            }
        } catch (IOException ex) {
            System.out.println("Ошибка записи");
        }
    }

    public void sortStingsInListWithSortCollections(List<String> listOfStrings) {
        Collections.sort(listOfStrings);
        for (String string : listOfStrings){
            System.out.println(string);
        }
    }

    public void  sortStingsInListByLength (List<String> listOfStrings) {
        listOfStrings.sort(Comparator.comparingInt(String::length));
        System.out.println("\nСтроки отсортированы по длинные: " +
                " \n_____________________________");
        for (String string : listOfStrings) {
            System.out.println(string);
        }
    }
}
