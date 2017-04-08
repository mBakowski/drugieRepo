package logic;

import java.util.Scanner;

public class Zadanie7a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wielkoœæ wie¿y:");
        int height = scanner.nextInt();

        for (int i = 1; i <= height; i++) {
            if (i == 1) {                           //if zosta³ wstawiony tylko po to aby od góry nie by³o odstêpu
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
