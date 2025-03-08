package Exercicios.Exercicios02;

/* 
O mesmo exercício anterior, mas agora deve mostrar o menor
elemento do vetor e a respectiva posição dele nesse vetor.
*/

import java.util.Scanner;

public class Exercicio05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] vetor = new int[10];

    System.out.println("*-------------*");
    System.out.println("LEITOR DE VETOR");
    System.out.println("*-------------*");

    for(int i = 0; i < 10; i++){
      int num;
      boolean negativo;
      do{
        System.out.print("Insira um número: ");
        num = sc.nextInt();
        if (num > 0) {
          vetor[i] = num;
          negativo = false;
        } else {
          System.out.println("Número invalido! Insira um número positivo.");
          negativo = true;
        }
      }while(negativo);
    }

    int minNum = vetor[0];
    int posicao = 0;
    for(int i = 1; i < 10; i++){
      if (vetor[i] < minNum) {
      minNum = vetor[i];
      posicao = i;
      }
    }

    System.out.println("O menor número: " + minNum + " = Posição: " +  posicao);

    sc.close();
  }
}
