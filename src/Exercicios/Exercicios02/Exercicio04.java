package Exercicios.Exercicios02;

import java.util.Scanner;

/*
Ler um vetor Q de 10 posições (aceitar somente números
positivos). Mostre a seguir o valor do maior elemento de Q e a
respectiva posição que ele ocupa no vetor.
*/

public class Exercicio04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] vetor = new int[10];

    System.out.println("*-------------*");
    System.out.println("LEITOR DE VETOR");
    System.out.println("*-------------*");

    for(int i = 0; i < 10; i++){
      int num = 0;
      boolean negativo;
      do{
        System.out.print("Insira um número: ");
        num = sc.nextInt();

        if (num >= 0) {
          vetor[i] = num;
          negativo = false;
        } else {
          System.out.println("Número invalido! Insira um número positivo.");
          negativo = true;
        }
        
      } while (negativo);
    }

    int maiorNum = 0;
    int posicao = 0;
    for(int i = 0; i < 10; i++){
      if(vetor[i] > maiorNum){
        maiorNum = vetor[i];
        posicao = i;
      }
    }

    System.out.println("Maior número: " + maiorNum + " = " + "Posição: " + posicao);

    sc.close();
  }
}
