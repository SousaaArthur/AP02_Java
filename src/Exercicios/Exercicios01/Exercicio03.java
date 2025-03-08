package Exercicios.Exercicios01;

import java.util.Scanner;

/*
Desenvolver um programa que leia 10 números inteiros digitados pelo usuário.
Se o número informado for par, o valor deve ser multiplicado por 10 e
armazenado no vetor. Se for ímpar deve ser somado com 5 e armazenado no
vetor. Ao final mostrar o conteúdo do vetor.
 */

public class Exercicio03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] vetor = new int[10];
    int num;

    System.out.println("*---------------*");
    System.out.println("Insira 10 números");
    System.out.println("*---------------*");

    for(int i =0; i < 10; i++){
      System.out.print("Insira um número: ");
      num = sc.nextInt();
      if (num % 2 == 0) {
        vetor[i] = num * 10;
      } else {
        vetor[i] = num + 5;
      }
    }

    for(int i = 0; i < 10; i++){
      System.out.printf("Posição: %d | Número: %d%n", i, vetor[i]);
    }

    sc.close();
  }
}
