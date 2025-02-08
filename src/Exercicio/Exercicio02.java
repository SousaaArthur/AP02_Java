package Exercicio;

import java.util.Scanner;

public class Exercicio02 {

  public static int Resto(int num1, int num2){
    return num1 % num2;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Insira o primeiro número: ");
    int num1 = sc.nextInt();

    System.out.print("Insira o segundo número: ");
    int num2 = sc.nextInt();

    int result = Resto(num1, num2);

    System.out.println("O resto da divisão entre o " + num1 + " e " + num2 + " é de: " + result);

    sc.close();
  }
}
