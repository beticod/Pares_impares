package Pares_impares;

import java.util.Scanner;
import java.util.ArrayList;

public class Pares_impares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<Integer>();
        
        System.out.println("Introduzca números (finaliza con un número negativo):");
        int num = sc.nextInt();
        while (num >= 0) {
            lista.add(num);
            System.out.println("Se ha introducido: " + num);
            num = sc.nextInt();
        }
        Metodos metodos = new Metodos();
        int totalNumeros = metodos.contarNumeros(lista);
        double mediaImpares = metodos.calcularMediaImpares(lista);
        int mayorPares = metodos.mayorDePares(lista);
        System.out.println("Cantidad de números introducidos: " + totalNumeros);
        System.out.println("Media de los números impares: " + mediaImpares);
        System.out.println("El mayor de los números pares es: " + mayorPares);
    }
}