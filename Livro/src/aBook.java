public class aBook extends Livro {
    private String formatoLivro;
    private int tamanhoArquivo;
    private string linkDownload;

    public aBook(String titulo, String autor, String editora, String isbm, int ano, String formatoLivro, int tamanhoArquivo, string linkDownload) {
        super(titulo, autor, editora, isbm, ano);
        this.formatoLivro = formatoLivro;
        this.tamanhoArquivo = tamanhoArquivo;
        this.linkDownload = linkDownload;
    }

    public void baixar() {
        System.out.printf("Download do livro %s iniciado.", getTitulo());
    }

    public String getFormatoLivro() {
        return formatoLivro;
    }

    public int getTamanhoArquivo() {
        return tamanhoArquivo;
    }

}