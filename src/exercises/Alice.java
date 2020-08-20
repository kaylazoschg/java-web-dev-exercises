package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was " +
                "reading, but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'";
        System.out.println("What word would you like to search for?");
        String searchWord = input.nextLine();
        String searchToLower = searchWord.toLowerCase();
        String sentenceToLower = sentence.toLowerCase();
        int searchIndex = sentenceToLower.indexOf(searchToLower);
        System.out.println("Index of search word: " + searchIndex);
        int searchLength = searchToLower.length();
        System.out.println("Length of search word: " + searchLength);
        String newSentence = sentenceToLower.replaceFirst(searchToLower, "");
        System.out.println(newSentence);
//        System.out.println(sentenceToLower.contains(searchToLower));
    }
}
