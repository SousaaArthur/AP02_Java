package Aulas.Aula03;

public class Pilha {
  static final int MAX = 10;
  int top;
  int a[] = new int[MAX]; // Define tamanho máximo da pilha
  // Construtor
  Pilha() {
  top = -1;
  }
  // Métodos da pilha
  boolean isEmpty() {
  return (top < 0);
  }
  boolean push(int x){
    if(top >= (MAX-1)){
      System.out.println("Estouro de pilha");
      return false;
    } else {
      a[++top] = x;
      return true;
    }
  }
  int pop(){
    if(top < 0){
      System.out.println("Pilha vazia!");
      return 0;
    } else {
      int x = a[top--];
      return x;
    }
  }
  int peek(){
    if(top < 0){
      System.out.println("Pilha Vazia!");
      return 0;
    } else {
      return a[top];
    }
  }
}