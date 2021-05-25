import java.util.ArrayList;
class cliente {
    String nome;
    double cpf;
    int nconta;
    void dados(String nome, int cpf, int nconta){
        this.nome=nome;
        this.cpf=cpf;
        this.nconta=nconta;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void getCpf(int cpf){
        this.cpf=cpf;
    }
    public void getNconta(int nconta){
        this.nconta=nconta;
    }
    ArrayList <cliente> c = new ArrayList();
    public void cadastrarc(cliente cn){
        c.add(cn);
    }
}
