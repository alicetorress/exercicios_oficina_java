package application;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dogite um numero natural");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Não é possível calcular o fatorial de um número negativo.");
        } else {
            
            long resultado = fatorial(numero);
            System.out.println("O fatorial de " + numero + " é: " + resultado);
        }

        scanner.close();

    }
    public static long fatorial(int num) {
       
        if (num == 0) {
            return 1;
        }
        
        return num * fatorial(num - 1);
    }

}
