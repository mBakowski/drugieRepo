package logic;

import java.util.Scanner;

public class Zadanie7a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wielko�� wie�y:");
        int height = scanner.nextInt();

        for (int i = 1; i <= height; i++) {
            if (i == 1) {                           //if zosta� wstawiony tylko po to aby od g�ry nie by�o odst�pu
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("\n");
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            }
        }
    }
}
