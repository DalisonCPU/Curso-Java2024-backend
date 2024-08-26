import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculadora c = new Calculadora();

        Scanner teclado = new Scanner(System.in);
        while(true) {

            System.out.println("Escolha uma operação ou 0 para sair:\r\n1. Somar.\r\n2. Subtrair.\r\n3. Multiplicar.\r\n4. Dividir.\r\n5. Calcular resto.\r\n6. Fatorial.");
            int opcao = teclado.nextInt();
            if(opcao == 0) break;

                c.defineOperacao(opcao);
                c.continuaParaOperar();
        }
    }
}