public class Especial extends Conta {

    public Especial(double saldo2, String numero2) {
        super(saldo2, numero2);
        
    }
    public void cheque(){
        this.saldo = saldo*2 ;
    }

public static void main(String[]args){
    System.out.println(saldo);
    Conta get;
    get.depositar(500);

}}
