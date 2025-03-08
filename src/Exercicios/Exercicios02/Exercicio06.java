package Exercicios.Exercicios02;

import java.util.Scanner;

/*
Ler um vetor A de 10 números. Após, ler mais um número e
guardar em uma variável X. Armazenar em um vetor M o
resultado de cada elemento de A multiplicado pelo valor X. Logo
após, imprimir o vetor M.
 */

public class Exercicio06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("*------------------------*");
    System.out.println("MULTIPLICADOR DE VETORES");
    System.out.println("*------------------------*");

    int[] mainVetor = new int[10];

    System.out.println("*----------------*");
    System.out.println("Insira 10 números");
    System.out.println("*----------------*");

    for(int i = 0; i < 10; i++){
      System.out.print("Insira um número: ");
      mainVetor[i] = sc.nextInt();
    }

    System.out.println("*--------------------------------*");
    System.out.println("Insira um número para multiplica");
    System.out.println("*--------------------------------*");

    int multi = sc.nextInt();
    
    System.out.println("Insira um número: ");
    
    int secondVetor[] = new int[10];

    for(int i = 0; i < 10; i++){
      secondVetor[i] = mainVetor[i] * multi;
      System.out.println(mainVetor[i] + " x " + multi + " = " + secondVetor[i]);
    }


    sc.close();
  }
}
