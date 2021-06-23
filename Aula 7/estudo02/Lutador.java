package estudo02 ;
public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    private float altura;

    public void apresentar() {
        System.out.println("-------------------------------------------------------");
        System.out.println(" Ta vindo um monstro! e ele e o :" + this.getNome()  );
        System.out.println(" Diretamente de  :" + this.getNacionalidade()  );
        System.out.println(" Ele tem :" + this.getIdade() + " anos" );
        System.out.println(" Pesando incriveis :" + this.getPeso()  + " kilos");
        System.out.println(" Com : " + this.getVitorias() + " Vitorias : " + this.getEmpates()   +" Empates e : "   + this.getDerrotas() + " Derrotas" );
    }

    public void status() {
        System.out.println( this.getNome() +  " e um peso" + this.getCategoria());
        System.out.println(" Ganhou :" + this.getVitorias() + " vezes ");
        System.out.println(" Empatou :" + this.getEmpates() + " vezes ");
        System.out.println(" Perdeu :" + this.getDerrotas() + " vezes ");
    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1 );
    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }

    public Lutador(String nome, String categoria, String nacionalidade, int idade, float altura, float peso,
            int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }

    public void setNome() {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade() {
        this.idade = idade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade() {
        this.nacionalidade = nacionalidade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {

        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "invalido";
        } else if (this.peso <= 70.3) {
            this.categoria = "leve" ;
        }else if(this.peso<=83.9) {
            this.categoria = "medio" ;
        }else if (peso<= 120.2){
            this.categoria = "pesado" ;
        }else{
            this.categoria = "invalido" ;
        }

    }

}
