public class Aluno extends Pessoa {

    private int matricula;
    private String curso;

    public void cancelarMatricula() {
        System.out.println(" MaTricula sera cancelada");
    }

    // GETTERS
    public int getMatricula() {
        return matricula;

    }

    public String getCurso() {
        return curso;
    }

    // SETTERS
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}