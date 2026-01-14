import java.util.Random;
import java.util.Scanner;

public class JogoDeAdvinhacao {
    public static void main(String[] args){

        int gerarNumeroSecreto = new Random().nextInt(10);
        int numeroAleatorio = 0;
        int tentativas = 0;

        while(gerarNumeroSecreto != numeroAleatorio) {

            System.out.println("Digite um numero");
            Scanner digite = new Scanner(System.in);
            numeroAleatorio = digite.nextInt();

            if (numeroAleatorio > gerarNumeroSecreto) {
                System.out.println("O numero secreto é menor que " + numeroAleatorio);
            } else if (numeroAleatorio < gerarNumeroSecreto) {
                System.out.println("O numero secreto é maior que " + numeroAleatorio);
            }
            tentativas++;
        }
        System.out.println("Parabens voce Acertou o numero secreto " + gerarNumeroSecreto + " com " + tentativas + " tentativas");
    }
}