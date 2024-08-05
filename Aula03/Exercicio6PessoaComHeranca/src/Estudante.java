public class Estudante extends Pessoa {
    private int matricula;

    public Estudante(String nome, int matricula) {
        super(nome);
        this.matricula = matricula;
    }

    public void mostrarMatricula() {
        System.out.println("Matrícula de " +getNome() +": " + matricula);
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
