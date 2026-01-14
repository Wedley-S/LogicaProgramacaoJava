public class Desafio01 {
    public static void main(String[] args) {

        //Crie um programa que realize a média de duas notas decimais e exiba o resultado.

        double nota01 = 6.83;
        double nota02 = 7.55;
        double media = (nota01 + nota02) / 2;
        System.out.println("the Media is: " + media);

        //Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.

        double numeroDouble = 17.6;
        int numeroInteiro = (int) numeroDouble;
        System.out.println("conversion: " + numeroInteiro);

        //Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as em uma mensagem.

        char palavra = 'A';
        String mensagem = "A Media de João é ";
        System.out.println(mensagem + palavra + "+");

        //Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.

        double precoProduto = 19.99;
        int quantidade = 10;
        double valor = precoProduto * quantidade;

        String text = "O valor da compra é " + valor;

        System.out.println(text);

        //Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o resultado formatado.

        double valorEmDolares = 100;
        double valorEmReais = 4.94;
        double conversaoEmReais = valorEmDolares * valorEmReais;

        double conversao = (int) (conversaoEmReais);
        System.out.println("A conversão de " + valorEmDolares + " Dolares para reais é " + conversao);

        //Segunda opção do codigo acima!!!

        double valorEmDolares2 = 100 * 4.94;
        double conversao2 = (int) (valorEmDolares2);
        System.out.println("A conversão de " + conversao2 + " Dolares para reais é " + conversao2);

        //Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.

        double precoOriginal = 100.00;
        double desconto = 27; // 27% de desconto
        double percentualQueVocePaga = 100 - desconto;
        double precoFinal = precoOriginal * (percentualQueVocePaga / 100);

        System.out.println("Preço Original: " + precoOriginal);
        System.out.println("desconto: " + desconto + "%");
        System.out.println("preco final: " + precoFinal);
    }
}
