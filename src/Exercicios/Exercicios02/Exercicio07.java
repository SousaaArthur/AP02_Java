package Exercicios.Exercicios02;

import java.util.Scanner;

/*
Faça um algoritmo para ler 20 números e armazenar em um
vetor. Após a leitura total dos 20 números, o algoritmo deve
escrever esses 20 números lidos na ordem inversa.
 */

public class Exercicio07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("*-----------------*");
    System.out.println("VETORES INVERTIDO");
    System.out.println("*-----------------*");

    int[] vetor = new int[20];

    for(int i = 0; i < 20; i++){
      System.out.print("Insira um número ná posição " + i + ": ");
      vetor[i] = sc.nextInt();
    }

    // System.out.println("Finalizando entrada");

    for(int i = 19; i > 0; i--){
      System.out.println("Número: " + vetor[i] + " | Posição: " + i);
    }

    sc.close();
  }
}
