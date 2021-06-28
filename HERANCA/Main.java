public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

        Aluno p2 = new Aluno();

        Professor p3 = new Professor();

        Funcionario p4 = new Funcionario();

        p1.setNome("Bruna surfistinha");

        p2.setNome("Fagundes alemoes");

        p3.setNome("Mamadoour elementes");

        p4.setNome("Jubiscleiton machado");

        p1.setSexo("F");
        p2.setSexo("M");
        p3.setSexo("M");
        p4.setSexo("M");

        p2.setCurso(" Informatica ");

        p3.setSalario(2500);

        p4.setSetor(" Estoque ");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
