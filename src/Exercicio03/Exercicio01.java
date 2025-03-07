package Exercicio03;

import java.util.Scanner;

/*
Faça um algoritmo para ler um valor N qualquer (que será o
tamanho das Matrizes). Solicite ao usuário para digitar valores
para carregar esses vetores A e B e depois armazenar em um
terceiro vetor Soma, a soma dos elementos do vetor A com os do
vetor B (respeitando as mesmas posições). Mostre a somatória
do vetor Soma.
 */

public class Exercicio01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("*-----------------------*");
    System.out.println("INSIRA O TAMANHO DO VETOR");
    System.out.println("*-----------------------*");

    System.out.print("Insira o número do vetor: ");
    int num = sc.nextInt();

    int[] valueA = new int[num];
    int[] valueB = new int[num];

    int[] sum = new int[num];

    System.out.println("*----------------*");
    System.out.println("PREENCHA O VETOR A");
    System.out.println("*----------------*");

    for(int i = 0; i < num; i++){
      System.out.print("Insira um número na posição [" + i + "]:");
      valueA[i] = sc.nextInt();
    }

    System.out.println("*----------------*");
    System.out.println("PREENCHA O VETOR B");
    System.out.println("*----------------*");

    for(int i = 0; i < num; i++){
      System.out.print("Insira um número na posição [" + i + "]:");
      valueB[i] = sc.nextInt();
    }

    System.out.println("*--------------*");
    System.out.println("SOMA DOS VETORES");
    System.out.println("*--------------*");

    for(int i = 0; i < num; i++){
      sum[i] = valueA[i] + valueB[i];
      System.out.println("A soma dos vetores da posição " + i + " é: " + valueA[i] + " + " + valueB[i] + " = " + sum[i]);
    }

    sc.close();
  }
}
