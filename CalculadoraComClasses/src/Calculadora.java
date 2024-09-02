import java.util.Scanner;

public class Calculadora {
    private int operacao;
    Scanner teclado;

    public Calculadora() {
        teclado = new Scanner(System.in);
    }

    public void defineOperacao(int operacao) {
        this.operacao = operacao;
    }

    void continuaParaOperar() {
        if(operacao <= 0) {
            System.out.println("Nenhuma operação definida.");
            return;
        }

        System.out.println("Digite o primeiro número:");
        float a = teclado.nextFloat();

        if(operacao != 6) {
            System.out.println("Digite o segundo número:");
            float b = teclado.nextFloat();

            switch (operacao) {
                case 1:
                    System.out.println(adicionarNumero(a, b));
                    break;
                case 2:
                    System.out.println(subtraiNumero(a, b));
                    break;
                case 3:
                    System.out.println(multiplicaNumero(a, b));
                    break;
                case 4:
                    System.out.println(divideNumero(a, b));
                    break;
                case 5:
                    System.out.println(calcularResto(a, b));
                    break;
            }
        } else {
            System.out.println(fatora(a));
        }
        operacao = -1;
    }

    public float adicionarNumero(float a, float b) {
        return a + b;
    }

    float subtraiNumero(float a, float b) {
        return a - b;
    }
    float multiplicaNumero(float a, float b) {
        return a * b;
    }
    float divideNumero(float a, float b) {
        if(a == 0 || b == 0) return 0;
        return a / b;
    }

    float calcularResto(float a, float b) {
        return a % b;
    }

    float fatora(float a) {
        float resultado = a;
        for(float i = a-1; i >= 1; i--) {
            resultado *= i;
        }
        return resultado;
    }
}
