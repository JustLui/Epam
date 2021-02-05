import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Actions actions = new Actions();
        List<String> list = actions.printStringsFromFileTolist();
        actions.printStringsToFileFromListInReverseOrder(list);
        actions.sortStingsInListWithSortCollections(list);
        actions.sortStingsInListByLength(list);
    }
}