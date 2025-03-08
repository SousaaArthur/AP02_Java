package Aulas.Aula03;

import java.util.Scanner;

public class Exemplo03 {
  public static void main(String args[]) {
  Scanner entrada = new Scanner(System.in);
  System.out.println("Entre com um número:");
  int valor = entrada.nextInt();
  Pilha novaPilha = new Pilha();
  novaPilha.push(valor);
  novaPilha.push(70);
  novaPilha.push(88);
  System.out.println("Item de valor " + novaPilha.pop() + " retirado da pilha");
  System.out.println("Item restante: " + novaPilha.peek());
  System.out.println("Item de valor " + novaPilha.pop() + " retirado da pilha");
  System.out.println("Item restante: " + novaPilha.peek());
  entrada.close();
  }
}
