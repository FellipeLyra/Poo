public class Poupança extends Conta {
    public Poupança(double saldo, String numero){
        super (saldo, numero);
    }
    public void gerarTaxa() {
        saldo += saldo * .005;
    }
}
