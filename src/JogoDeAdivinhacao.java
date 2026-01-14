import java.util.Random;
import java.util.Scanner;
public class JogoDeAdivinhacao {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int gerarNumeroSecreto = new Random().nextInt(10);
        int tentativas = 0;
        int chuteNumero = 0;
        while (tentativas < 5) {
            System.out.println("Digite um numero: ");
            ler = new Scanner(System.in);
            chuteNumero = ler.nextInt();
            tentativas++;

            if (chuteNumero == gerarNumeroSecreto) {
                System.out.println("Parabens você acertou o numero secreto " + gerarNumeroSecreto + " com " +  tentativas + " tentativas.");
                break;
            } else if (chuteNumero < gerarNumeroSecreto) {
                System.out.println("O numero secreto é maior que " + chuteNumero);
            } else {
                System.out.println("O numero secreto é menor que " + chuteNumero);
            }
        }
        if (tentativas == 5 && chuteNumero != gerarNumeroSecreto) {
            System.out.println("Infelizmente você não acertou o numero secreto com apenas 5 tentativas!");
        }
    }
}
