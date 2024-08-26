import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a quantidade de números à ler:");
        int quantidadeDeNumeros = teclado.nextInt();
        if(quantidadeDeNumeros <= 0) {
            System.out.println("Você não digitou um número maior que zero... Que feio!");
            System.exit(0);
        }

        int somaNumerosPares = 0;
        int somaNumerosImpares = 0;
        int somaNumeros = 0;
        int contador = 1;
        while(contador <= quantidadeDeNumeros) {
            contador++;
            System.out.println("Digite um número:");
            int numeroDigitado = teclado.nextInt();

            somaNumeros += numeroDigitado;
            if(numeroDigitado % 2 == 0) {
                somaNumerosPares += numeroDigitado;
            } else  {
                somaNumerosImpares += numeroDigitado;
            }
        }
        System.out.println("Soma total dos números: " + somaNumeros+".\r\nSoma dos números pares: " + somaNumerosPares+".\r\nSoma dos números ímpares: " + somaNumerosImpares);
    }
}