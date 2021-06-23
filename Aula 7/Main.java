

public class Main {
    public static void main(String[] args) {
        Lutador  l1 = new Lutador() ; 
        l1.setNome("cleitu rasta")  ;
        l1.setNacionalidade("pedrinhas ") ;
        l1.setIdade(31);
        l1.setAltura(1.75) ;
        l1.setPeso(68.9) ;
        l1.setCategoria("leve") ;
        l1.setVitorias(11);
        l1.setDerrotas(2) ;
        l1.setEmpates(1);

        System.out.println(l1.apresentar());
    }
}
