import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite uma frase:");

        String frase = teclado.nextLine();
        frase.trim();
        int quantidadePalavras = 1;
        int contador = 0;

        while (contador < frase.length()) {
            if(frase.charAt(contador) == ' ' && frase.charAt(contador + 1) != ' ') quantidadePalavras++;
            contador++;
        }
        System.out.println("A frase " + frase + " possui " + quantidadePalavras + " palavra" + (quantidadePalavras > 1? "s": "") + ".");
    }
}