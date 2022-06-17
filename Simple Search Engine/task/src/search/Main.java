package search;

import java.util.Scanner;

public class Main {
    public static void findWord() {
        Scanner scanner = new Scanner(System.in);
        String stringInput = scanner.nextLine();
        String[] stringArray = stringInput.split(" ");
        String currentWord = scanner.nextLine();
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].equals(currentWord)) {
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println("Not found");
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
