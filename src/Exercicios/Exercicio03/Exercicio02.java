package Exercicios.Exercicio03;

import java.util.Scanner;

/*
Faça um algoritmo para ler e armazenar em uma matriz a
temperatura média de 30 dias do ano.
Calcular e escrever:
a) Menor temperatura
b) Maior temperatura
c) Temperatura média
d) O número de dias em que a temperatura foi inferior a média
 */

public class Exercicio02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] temperatura = new int[30];

    System.out.println("*--------------------------------------*");
    System.out.println("INSIRA A MEDIA DE TEMPERATURA DE 30 DIAS");
    System.out.println("*--------------------------------------*");

    int dias = 0;

    for(int i = 0; i < 30; i++){
      dias+=1;
      System.out.print("Insira a temperatura do dia " + dias + ": ");
      temperatura[i] = sc.nextInt();
    }

    int tempMedia = 0;
    int sum = 0;
    int menorTemp = tempMedia;
    int maiorTemp = tempMedia;
    int tempInferior = 0;

    for (int i = 0; i < 30; i++){
      sum += temperatura[i];
      tempMedia = sum / 30; 
      if (temperatura[i] <= menorTemp) {
        menorTemp = temperatura[i];
      }
      if(temperatura[i] >= maiorTemp) {
        maiorTemp = temperatura[i];
      }
      if(temperatura[i] < tempMedia){
        tempInferior += 1; 
      }
    }

    System.out.println("A menor temperatura é: " + menorTemp + "Cº");
    System.out.println("A maior temperatura é: " + maiorTemp + "Cº");
    System.out.println("A temperatura média é: " + tempMedia + "Cº");
    System.out.println("Dias com a temperatura inferior: " + tempInferior);

    sc.close();
  }
}
