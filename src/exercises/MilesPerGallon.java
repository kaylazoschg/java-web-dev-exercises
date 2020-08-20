package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Miles driven:");
        int milesDriven = input.nextInt();
        System.out.println("Gallons gas used:");
        int gasUsed = input.nextInt();
        int milesPerGallon = milesDriven / gasUsed;
        System.out.println("Miles per gallon: " + milesPerGallon);
    }
}
