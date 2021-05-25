class conta {
    double saldo;
    public double getsaldo(){
        return this.saldo;
    }
    void depositar(double quantidade){
        this.saldo += quantidade;
    }
    void sacar (double quantidade){
        double novoSaldo = this.saldo - quantidade;
        this.saldo= novoSaldo;
    }
    void transfere(conta destino, double valor) {
        this.saldo = this.saldo - valor;
        destino.saldo = destino.saldo + valor;
    }
}
