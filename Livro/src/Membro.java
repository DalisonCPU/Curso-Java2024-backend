public class Membro {
    private String nome;
    private String endereco;
    private String telefone;
    private String observacoes;

    public Membro(String nome, String endereco, String telefone, String observacoes) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.observacoes = observacoes;
    }

    public void adicionarObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
