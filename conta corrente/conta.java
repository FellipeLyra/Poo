class Conta {
    double saldo;

    public double getsaldo() {
        return this.saldo;
    }

    void depositar(double quantidade) {
        this.saldo += quantidade;
    }

    void sacar(double quantidade) {
        double novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;
    }

    Cliente c = new Cliente();

    void transfere(Conta nConta, double valor) {
        this.saldo = this.saldo - valor;
        nConta.saldo = nConta.saldo + valor;
        if (this.saldo < valor) {
            System.out.println("Saldo insuficiente para a operação");
        } else {
            this.saldo = this.saldo - valor;
            System.out.println("Transferido o valor de " + this.saldo);
        }
    }
}
