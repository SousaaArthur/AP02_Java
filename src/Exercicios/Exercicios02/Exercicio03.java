package Exercicios.Exercicios02;

import java.util.Scanner;

/* 
Escreva um algoritmo que permita a leitura das notas de uma
turma. Calcular a média da turma e contar quantos alunos
obtiveram nota acima desta média calculada. Mostre a média da
turma e o resultado da contagem.
*/

public class Exercicio03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("*-------------*");
    System.out.println("CALCULADORA DE MÉDIA DA TURMA");
    System.out.println("*-------------*");
    System.out.println("Escreva a quantidade de alunos.");
    System.out.println("*-------------*");
    System.out.print("Insira a quantidade: ");

    int alunos = sc.nextInt();

    double[] notasAlunos = new double[alunos];

    System.out.println("*-------------*");
    System.out.println("Insira a notas dos alunos.");
    System.out.println("*-------------*");

    double notas = 0;

    for(int i = 0; i < alunos; i++){
      System.out.print("Insira a notas: ");
      notasAlunos[i] = sc.nextDouble();
      notas += notasAlunos[i];
    }

    System.out.println("*-------------*");
    System.out.println("RESULTADO");
    System.out.println("*-------------*");

    double media = notas / alunos;

    System.out.println("Média das notas da turma: " + media);

    int acimaDaMedia = 0;

    for(int i = 0; i < alunos; i++){
      if (notasAlunos[i] > media) {
        acimaDaMedia++;
      }
    }

    System.out.println("Alunos acima da média: " + acimaDaMedia);

    sc.close();
  }
}
