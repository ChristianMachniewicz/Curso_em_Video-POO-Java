public class Professor extends Pessoa {
    private String especialidade;
    private float salario;

    public void receberAum(float salario ) {
        this.salario += salario ;
    }

    // GETTERS
    public String getEspecialidade() {
        return especialidade;
    }

    public float getSalario() {
        return salario;
    }

    // SETTERS
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

}
