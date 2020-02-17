package com.wayne.box;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

        float length;
        float width;
        int height;

        Box box3 = new Box(23,14,13);
        Box box5 = new Box(39.5f,27.5f,23);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter object's length (Enter -1 to quit): ");

        length = scanner.nextFloat();

        while ( length != -1 ) {

            System.out.print("Please enter object's width: ");

            width = scanner.nextFloat();

            System.out.print("Please enter object's height: ");

            height = scanner.nextInt();

            if (box3.validate(length, width, height))

                System.out.println("Box3");

            else if (box5.validate(length, width, height))

                System.out.println("Box5");

            else

                System.out.println("No box can use!");

            System.out.println();

            System.out.print("Please enter object's length (Enter -1 to quit): ");

            length = scanner.nextFloat();

        }
        scanner.close();
    }
}
