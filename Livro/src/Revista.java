public class Revista extends Livro {

    private String mesPublicacao;
    private int edicao;

    public Revista(String titulo, String autor, String editora, String isbm, int ano, String mesPublicacao, int edicao) {
        super(titulo, autor, editora, isbm, ano);
        this.mesPublicacao = mesPublicacao;
        this.edicao = edicao;
    }
}