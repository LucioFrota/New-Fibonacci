package view;

import java.util.Scanner;

import static util.fibonacci.Fibonacci.fibonacciCalc;

public class FbView {
    public static void start() {
        Scanner scan = new Scanner(System.in);
        int cod = -1;
        while (cod != 0) {
            System.out.println("----- Calculo Fibonacci -----");
            System.out.println("Digite um limite para a sequência (Entre 0 e 100).");
            System.out.println("Digite 0 para sair");
            try {
                cod = scan.nextInt();
            } catch (Exception e) {
                System.out.println("Valor inválido - Digite um numero - " + e);
            }finally {
                if(cod > 0 && cod <=100) fibonacciCalc(cod).forEach(System.out::println);
            }
        }
        System.out.println("O B R I G A D O !");

    }
}
