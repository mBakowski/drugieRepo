package logic;

import java.util.Scanner;

public class Zadanie7b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wysokość twojej wieży: ");
        int height = scanner.nextInt();


        for(int i=0; i<height; i++){
            for(int j=0; j<height-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<=i*2; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
