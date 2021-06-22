
public class ContaBanco {
    public int numConta;
    protected String tipoConta;
    private String dono;
    private Double saldo;
    private Boolean status;
    public Double saque;

    public void estadoConta() {
        
        System.out.println("conta :" + this.getNumConta());
        System.out.println("conta :" + this.getDono());
        System.out.println("conta :" + this.getSaldo());
        this.verifEstatus();
        

    }

    public void tipoConta() {
        this.saldo = 0.0;
        this.status = false;
    }

    public void abrirConta(String t) {

        setTipoConta(t);
        setStatus(true);

        if (tipoConta == "cc") {
            this.saldo = 50.0;
        } else if (tipoConta == "cp") {
            this.saldo = 150.0;
        } else {
            System.out.println("esse tipo de conta nao existe ");
        }

    }

    public void fecharConta() {
        if (saldo > 0) {
            System.out.println("voce nao pode fechar a conta com saldo nela !");
        } else {
            setStatus(false);
            System.out.println("sua conta foi encerrada !");
        }
    }

    public void depositar(double v) {
        if (status == true) {
            // System.out.println("qual o valor que deseja depositar ? ");
            saldo = saldo + v;
            System.out.println("valor depositado na conta de :" + getDono());

        } else {
            System.out.println("voce nao pode depositar em uma conta nao aberta");
        }

    }

    public void sacar(double v) {
        System.out.println("qual o valor que deseja sacar");

        if (status = false) {
            System.out.println("nao tem como sacar dinheiro de uma conta que nao esta aberta seu animal");
        }

        else if (saldo < saque) {
            System.out.println("voce nao pode sacar a mais do que voce nao tem ne animal ");
        } else if (saque > 1500) {
            System.out.println("o limite diario de saques e 1500 bonoros");
        } else {
            System.out.println("saque efetuado com sucesso");

        }

    }

    public void pagarMensalidade() {
        int v = 0;
        if (this.getTipoConta() == "cc") {
            v = 12;
        } else if (this.getTipoConta() == "cp") {
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("mensalidade paga mermao");
        } else {
            System.out.println("voce nao pagou a mensalidade meramon , ta maluco , vo te mata se voce nao paga");
        }
    }

    public ContaBanco() {
        this.saldo = 0.0;
        this.status = false;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getSaque() {
        return saque;
    }

    public void setSaque(Double saque) {
        this.saque = saque;
    }

    public Boolean getStatus() {

        return status;

    }

    public void setStatus(Boolean status) {

        this.status = status;

    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String t) {
        this.tipoConta = t;
    }

    public void verifEstatus() {
        if (getStatus() == true) {
            System.out.println("aberta");
        } else {
            System.out.println("fechada");
        }
       
    }

}
