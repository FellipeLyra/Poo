public class Cliente extends Pessoa {
    private String cpf;

    public Cliente(String nome, Conta conta, String telefone, String email, String cpf) {
        super(nome, conta, telefone, email);
        this.cpf = cpf;
    }

    public Cliente() {
        this.setConta(new Conta(0, cpf));
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}