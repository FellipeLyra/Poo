public class Pessoa {
    private String nome;
    private Conta conta;
    private String telefone;
    private String email;

    public Pessoa(String nome, Conta conta, String telefone, String email) {
        this.nome = nome;
        this.conta = conta;
        this.telefone = telefone;
        this.email = email;
    }

    public Pessoa() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Conta getConta() {
        return this.conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
}