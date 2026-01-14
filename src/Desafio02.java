import java.util.Scanner;


public class Desafio02 {
    public static void main(String[] args) {



        //Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".

        int numero = 0;
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        numero = ler.nextInt();
        if (numero % 2 == 0) {
            System.out.println("O numero " + numero + " é Par");
        } else {
            System.out.println("O numero " + numero + " é Impar");
        }



        //Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.

        int num1 = 0;
        int num2 = 0;
        Scanner ler1 = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        num1 = ler1.nextInt();

        System.out.print("Digite um numero: ");
        num2 = ler1.nextInt();

        if (num1 > num2 && num2 != num1) {
            System.out.println("O " + num1 +  " é Maior que o numero " + num2 + " e são totalmente diferentes");
        } else if (num1 < num2 && num2 != num1) {
            System.out.println("O " + num1 +  " é Menor que o numero " + num2 + " e são praticamente diferentes");
        } else {
            System.out.println("Os dois numeros são praticamente iguais");
        }

        //Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.



        Scanner Menu = new Scanner(System.in);

        System.out.println("Bem vindo ao Menu, escolha um numero entre 1 e 2 para qual area deseja calcular");

        System.out.println("Digite 1 para calcular a area do quadrado ou 2 para calcular a area do circulo: ");
        int opcao = 0;
        opcao = Menu.nextInt();

        if (opcao == 1){
            System.out.print("Digite um numero: ");
            numero = Menu.nextInt();
            int AreaDoQuadrado = numero * numero;
            System.out.println("A area do quadrado é a base multiplicado pela base" + AreaDoQuadrado);
        } else {
            System.out.print("Digite um numero: ");
            int raio = Menu.nextInt();
            double Pi = 3.14;


            double AreaDoCirculo = Pi * (raio * 2);
            System.out.println("A area do circulo é Pi vezes a area  " + raio + " ao quarado que é igual a area que é " + AreaDoCirculo);
        }



    }
}

