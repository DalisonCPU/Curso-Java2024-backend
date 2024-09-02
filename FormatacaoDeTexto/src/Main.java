import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int valor = teclado.nextInt();

        if(valor <=0) {
            System.out.println("Digite um número maior que 0.");
        } else {
            System.out.println("O decimal de " + valor+" é " + String.format("%d", valor));
            System.out.println("O hexadecimal de " + valor + " é " + Integer.toHexString(valor));
            System.out.println("O valor de " + valor + " em octal é " + Integer.toOctalString(valor));
            System.out.println(String.format("O decimal de %d é %u", valor, valor));
        }

    }
}