package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double radius = input.nextInt();
        System.out.println("Area: " + Circle.getArea(radius));
    }
}
