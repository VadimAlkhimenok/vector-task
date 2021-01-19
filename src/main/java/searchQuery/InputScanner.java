package searchQuery;

import java.util.Scanner;

public class InputScanner {
    public static String inputSearchWord() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input searching word: ");
        return sc.nextLine();
    }
}
