package studios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Studio3HashMaps {
    public static void main(String[] args) {
        HashMap<Character, Integer> countingChar = new HashMap<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a phrase to count: ");
        String userPhrase = input.nextLine();

        char[] charsInString = userPhrase.toCharArray();
        for (char letter : charsInString) {
            if (countingChar.containsKey(letter)) {
                countingChar.put(letter, countingChar.get(letter) + 1);
            } else {
                countingChar.put(letter, 1);
            }
        }
        for (Map.Entry<Character, Integer> oneChar : countingChar.entrySet()) {
            System.out.println(oneChar.getKey() + ": " + oneChar.getValue());
        }
    }
}
