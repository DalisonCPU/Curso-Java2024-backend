public class Livro {
    private String titulo;
    private String autor;
    private String editora;
    private String isbm;
    private int ano;

    public Livro(String titulo, String autor, String editora, String isbm, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.isbm = isbm;
        this.ano = ano;
    }


    public void exibirDetalhes() {
        System.out.printf("Título: %s. Autor: %s. Editora: %s. Ano de publicação: %i. ISBM: %s.", titulo, autor, editora, ano, isbm);
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getIsbm() {
        return isbm;
    }

    public void setIsbm(String isbm) {
        this.isbm = isbm;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
