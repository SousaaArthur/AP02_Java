package Exercicios02;

import java.util.Scanner;
/*
Escreva um algoritmo que permita a leitura dos nomes de 3
pessoas e armazene os nomes lidos em um vetor. Após isto, o
algoritmo deve solicitar a leitura de mais 1 nome de qualquer
pessoa e depois escrever a mensagem ACHEI, se o nome estiver
entre os nomes lidos anteriormente (guardados no vetor), ou NÃO
ACHEI caso contrário.
*/

public class Exercicio02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int tamanho = 3;
    String[] nomes = new String[tamanho];

    System.out.println("*-------------*");
    System.out.println("Insira 3 nomes para adicionar no vetor.");
    System.out.println("*-------------*");
    for(int i = 0; i < tamanho; i++){
      System.out.print("Insira um nome: ");
      nomes[i] = sc.next();
    }

    System.out.println("*-------------*");
    System.out.println("Insira um nome para buscar na lista.");
    System.out.println("*-------------*");

    System.out.print("Procurar: ");
    String procurar = sc.next();

    boolean found = false;
    for(int i = 0; i < tamanho; i++){
      if (procurar.equals(nomes[i])) {
        System.out.println("Nome encontrado com sucesso!");
        found = true;
        break;
      }
    }
    if (!found) {
      System.out.println("Esse nome não pertence a lista de vetores!");
    }

    sc.close();
  }
}