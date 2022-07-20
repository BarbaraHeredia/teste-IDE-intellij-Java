package br.com.br.calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double a, b;

        System.out.println("Informe dois numeros.\n");
        System.out.println("Informe o primeiro numero: ");
        a = scan.nextDouble();

        System.out.println("Informe o segundo numero: ");
        b = scan.nextDouble();

        double soma = soma (a,b);
        double subtracao = subtracao (a,b);
        double multiplicacao = multiplicacao (a,b);
        double divisao = divisao (a,b);

        System.out.println(a +  " + " + b  + " = " + soma);
        System.out.println(a +  " - " + b  + " = " + subtracao);
        System.out.println(a +  " * " + b  + " = "+ multiplicacao);
        System.out.println(a +  " / " + b  + " = " + divisao);


    }
    public static double soma(double a, double b){

        return a + b;
    }

    public static double subtracao(double a, double b){

        return a - b;
    }

    public static double multiplicacao(double a, double b){

        return a * b;
    }

    public static double divisao(double a, double b){

        return a / b;
    }
}
