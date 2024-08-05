public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Santos");
        pessoa.dizerOla();
        pessoa.setNome("Sabrina");
        System.out.println("Nome alterado para " + pessoa.getNome());
    }
}