public class Main {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(124324);
        p1.setDono("nicolau Fagundes");
        p1.setStatus(true);
        
        p1.abrirConta("cc");
        p1.estadoConta();
        
        //System.out.println(p1.numConta);

    }

}
