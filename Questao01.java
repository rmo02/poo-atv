package questao01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao01 {
  private static Pessoa[] pessoas = new Pessoa[3];
  private static Scanner sc = new Scanner(System.in);

  private static void recebeNome(int i, Pessoa[] pessoas) throws InputMismatchException {
    System.out.println("DIGITE O NOME DA PESSOA " + (i + 1));
    pessoas[i].setNome(sc.nextLine());
  }

  private static void recebeIdade(int i, Pessoa[] pessoas) throws InputMismatchException {
    System.out.println("DIGITE A IDADE DA PESSOA " + (i + 1));
    pessoas[i].setIdade(sc.nextInt());
  }

  private static void recebeCpf(int i, Pessoa[] pessoas) throws InputMismatchException {
    System.out.println("DIGITE O CPF DA PESSOA " + (i + 1));
    pessoas[i].setCpf(sc.nextInt());
  }

  private static void lerPessoa(int i, Pessoa[] pessoas) {
    recebeNome(i, pessoas);
    recebeIdade(i, pessoas);
    recebeCpf(i, pessoas);
  }

  private static void mostrarPessoas(int i) {
    System.out.println("NOME DA PESSOA" + (i + 1) + ": " + pessoas[i].getNome());
    System.out.println("IDADE DA PESSOA" + (i + 1) + ": " + pessoas[i].getIdade());
    System.out.println("CPF DA PESSOA" + (i + 1) + ": " + pessoas[i].getCpf());
  }

  public static void main(String args[]) {
    for (int i = 0; i < 3; i++) {
      pessoas[i] = new Pessoa();
      try {
        lerPessoa(i, pessoas);
      } catch (InputMismatchException e) {
        System.out.println("Os campos em questão têm tipos específicos, por favor preencha de acordo!");
        i -= 1;
      }
      sc.nextLine();
    }
    for (int i = 0; i < 3; i++) {
      mostrarPessoas(i);
    }
  }
}