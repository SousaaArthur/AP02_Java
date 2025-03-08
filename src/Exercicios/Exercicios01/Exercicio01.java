package Exercicios.Exercicios01;

import java.util.Scanner;

/*
Elaborar um programa que leia 10 notas
de alunos armazenando-as em um vetor
notas[ ], imprimir as notas de índice 7 e
9 no final.
 */

public class Exercicio01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] vetor = new int[10];

    System.out.println("*----------------------*");
    System.out.println("INSIRA A NOTA DOS ALUNOS");
    System.out.println("*----------------------*");

    for(int i = 0; i < 10; i++){
      System.out.print("Insira uma nota: ");
      vetor[i] = sc.nextInt();
    }

    System.out.println("*---*");
    System.out.println("NOTAS");
    System.out.println("*---*");
    System.out.println("Nota: " + vetor[7] + " - Índice: 7");
    System.out.println("Nota: " + vetor[9] + " - Índice: 9");

    sc.close();
  }
}
