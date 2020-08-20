package exercises3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListWords {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("words", "hi", "house", "big"));
        Scanner input = new Scanner(System.in);
        System.out.println("How many letters in word?");
        int wordLength = input.nextInt();
        for (String i : words) {
            if (i.length()==wordLength) {
                System.out.println(i);
            }
        }
    }
}
