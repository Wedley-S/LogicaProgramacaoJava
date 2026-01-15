import java.util.Scanner;

public class TreinamentoDeLoopFor {

    public static void main(String[] args) {
        //Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.


        Scanner ler = new Scanner(System.in);
        int numero = 0;

        System.out.println("Digite um numero para mostrar a tabuada: ");
        numero = ler.nextInt();

        for (int i = 0; i <= 50; i++) {
            System.out.println("Tabuada do " + numero + ";  " + numero + " x " + i + " = " + numero * i);
        }
    }
}

