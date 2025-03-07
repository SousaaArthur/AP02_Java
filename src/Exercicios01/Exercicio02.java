package Exercicios01;

import java.util.Scanner;

/*
Modificar o programa anterior para que
informe quantos alunos foram aprovados
e reprovados, ao final liste todas as
notas, a quantidade de aprovados e
reprovados, sendo que a média é 7.
 */

public class Exercicio02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] notas = new int[10];

    System.out.println("*----------------------*");
    System.out.println("INSIRA A NOTA DOS ALUNOS");
    System.out.println("*----------------------*");

    for(int i = 0; i < 10; i++){
      System.out.print("Insira uma nota: ");
      notas[i] = sc.nextInt();
    }

    int aprovados = 0;
    int reprovados = 0;

    for(int i = 0; i < 10; i++){
      if(notas[i] >= 7){
        aprovados++;
      } else {
        reprovados++;
      }
    }

    System.out.println("*-------*");
    System.out.println("RESULTADO");
    System.out.println("*-------*");
    System.out.println("\nNotas dos alunos:");
    for(int i = 0; i < 10; i++){
      System.out.printf("%dº nota: %d\n", i+1, notas[i]);
    }
    System.out.println("\nAvaliações:");
    System.out.println("Aprovados: " + aprovados);
    System.out.println("Reprovados: " + reprovados);
    sc.close();
  }
}
