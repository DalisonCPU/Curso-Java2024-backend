public class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void dizerOla() {
        System.out.println("Olá, meu nome é " + nome +"!");
    }
}
