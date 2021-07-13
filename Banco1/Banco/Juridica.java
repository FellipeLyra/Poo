public class Juridica extends Pessoa {
    private String cnpj;

    public Juridica(String nome, Conta conta, String telefone, String email, String cnpj) {
        super(nome, conta, telefone, email);
        this.cnpj = cnpj;
    }

    public Juridica() {
        this.setConta(new Conta(0, cnpj));
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}