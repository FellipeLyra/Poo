import java.util.ArrayList;

public class Cliente {
    String nome;
    String cpf;
    String nconta;
    String x, y, z;

    public Cliente(String nome, String cpf, String nconta) {
        this.nome = nome;
        this.cpf = cpf;
        this.nconta = nconta;
    }

    public Cliente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNconta() {
        return nconta;
    }

    public void setNconta(String nconta) {
        this.nconta = nconta;
    }

    public void criarBanco() {
        ArrayList<Cliente> lista = new ArrayList<Cliente>();
        // Cliente c1 = new Cliente("Maria", "921.427.654-58", "453");
        Cliente c1 = new Cliente(nome, cpf, nconta);
        lista.add(c1);
    }
}