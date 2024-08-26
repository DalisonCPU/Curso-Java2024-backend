import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número para saber sua tabuada:");
            int numero = teclado.nextInt();
            for(int contador = 1; contador <= 10; contador++) {
                int resultadoAdicao = numero + contador;
                int resultadoSubtracao = numero - contador;
                int resultadoMultiplicacao = numero * contador;
                double resultadoDivisao = numero / contador;
                System.out.println(numero + " + " + contador + " = " + resultadoAdicao);
                System.out.println(numero + " - " + contador + " = " + resultadoSubtracao);
                System.out.println(numero + "*" + contador + " = " + resultadoMultiplicacao);
                System.out.println(numero + " / " + contador + " = " + resultadoDivisao);
            }
    }
}