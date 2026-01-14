import java.util.Scanner;

public class Projeto01 {
    public static void main(String[] args) {

        String mensagem = """
                *******************************
                Dados iniciais do cliente:
                
                Nome:              Wedley de Sousa Barbosa
                Tipo de Conta:     Corrente
                Saldo Atual:       2.500 R$
                *******************************
                """;

        System.out.println(mensagem);

        int opcao = 0;

        double transferirSaldo = 0;
        double saldo = 0;
        double saldoAtual = 2500;

        while (opcao != 4) {
            String mensagem01 = """
                    
                    operações
                    
                    1- Consultar Saldo:
                    2- Receber Saldo:
                    3- Transferir Saldo:
                    4- Sair Do App:
                    
                    escolha uma das operações:
                    """;
            System.out.println(mensagem01);
            Scanner ler = new Scanner(System.in);
            opcao = ler.nextInt();

            if (opcao == 1) {
                System.out.println("O seu saldo atual é de " + saldoAtual + " R$");
            } else if (opcao == 2) {
                System.out.println("Quanto de saldo a ser recebido: ");
                saldo = ler.nextInt();
                saldoAtual = saldoAtual + saldo;
                System.out.println("Novo saldo atual de " + saldoAtual + " R$");
            }  else if (opcao == 3) {

                System.out.println("Quanto de saldo a ser transferido: ");
                transferirSaldo = ler.nextDouble();
                if(transferirSaldo > saldoAtual){
                    System.out.println("Saldo insuficiente para a transferencia!");
                } else {
                    System.out.println("transferencia de " + transferirSaldo + " R$ concluida");
                    saldoAtual -= transferirSaldo;  // o operador -= tambem pode ser saldoAtual = saldoAtual - transferirSaldo
                    System.out.println("o seu saldo atual é de " + saldoAtual + " R$");
                }
            }else if (opcao != 4) {
                System.out.println("opção invalida!");
            } else {
                System.out.println("fechando o app!");
            }
        }
    }
}