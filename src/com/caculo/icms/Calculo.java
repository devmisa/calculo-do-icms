package com.caculo.icms;

import java.util.Scanner;

public class Calculo {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int a,b;

            System.out.println("Digite o valor da mercadoria: ");
            a = scan.nextInt();
            System.out.println("Digite o valor da alíquota: ");
            b = scan.nextInt();

        float total;
        total = (a * b)/100 + a;

        System.out.println("O custo total da mercadoria é = "+total);


    }

}