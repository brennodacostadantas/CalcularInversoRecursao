package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número");
        double numero;
        numero = scanner.nextDouble();
            Main main = new Main();
            System.out.println(main.inverso(numero));
    }

    public double inverso(double numero) {
        if(numero != 0 && numero == 1){
            return 1;
        } else if(numero == -1){
            return -1;
        } else if(numero == 0){
            return 0;
        } else{
            return inverso(numero/ numero) / numero;
        }
    }
}