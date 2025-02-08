package Exercicio;

import java.util.Scanner;

public class Exercicio01 {

  public static double Subratacao(double num1, double num2){
    double dif = 0;

    if(num1 > num2){
      dif = num1 - num2;
    } else {
      dif = num2 - num1;
    }

    return dif;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Insira o primeiro número: ");
    double num1 = sc.nextDouble();

    System.out.print("Insira o segundo número: ");
    double num2 = sc.nextDouble();

    double dif = Subratacao(num1, num2);
    
    System.out.println("A diferença do " + num1 + " para o " + num2 + " é de " + dif);

    sc.close();
  }
}
