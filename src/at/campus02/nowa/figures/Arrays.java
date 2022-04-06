package at.campus02.nowa.figures;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 4, 6, 7};


        Scanner scanner = new Scanner(System.in);
     /*   int myNumber = scanner.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == myNumber) {
                System.out.println(i);
            }
        } */
        int myNumber;
        do {
             myNumber = scanner.nextInt();

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == myNumber) {
                    System.out.println(i);
                }
            }
        } while (myNumber != 0);
    }
}
