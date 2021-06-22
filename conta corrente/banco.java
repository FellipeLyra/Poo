import java.util.Scanner;

public class Banco {
    private static Conta nConta;

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double x;
        double s;
        int num;
        Conta conta1 = new Conta();
        conta1.saldo = 0;
        conta1.depositar(0);
        conta1.sacar(0);
        conta1.transfere(nConta, 0);
        Cliente c = new Cliente();
        c.nome = "a";
        c.cpf = "0";
        c.nconta = "a";
        System.out.println("Digite seu nome: ");
        c.setNome(ler.next());
        System.out.println("Digite seu cpf: ");
        c.setCpf(ler.next());
        System.out.println("Digite seu numero da conta: ");
        c.setNconta(ler.next());
        do {
            System.out.println("Qual operação vc deseja realizar:");
            System.out.println("1 - depositar");
            System.out.println("2 - sacar");
            System.out.println("3 - ver saldo");
            System.out.println("4 - Transferencia");
            System.out.println("5 - terminar operação");
            num = ler.nextInt();
            if (num == 1) {
                System.out.print("Digite o valor que vc deseja depositar: ");
                x = ler.nextDouble();
                conta1.depositar(x);
            } else if (num == 2) {
                System.out.print("qual valor que você deseja sacar: ");
                s = ler.nextDouble();
                conta1.sacar(s);
            } else if (num == 3) {
                System.out.print(c.nome + " ,seu saldo é de: " + conta1.saldo);
            } else if (num == 4) {
                System.out.print("Conta para a tranferencia: ");
                c.setNconta(ler.next());
                System.out.print("Valor para transferencia: R$ ");
                float vt = ler.nextFloat();
                conta1.transfere(nConta, vt);
                break;
            } else {
                System.out.println("Operação finalizada");
                break;
            }
        } while (num < 5);
    }
}
