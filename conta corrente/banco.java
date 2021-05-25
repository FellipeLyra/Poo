import java.util.Scanner;
public class banco {
    public static void main(String[]args){
    Scanner ler= new Scanner(System.in);
    double x;
    double s;
    int num;
    String no;
    Double cp;
    int numc;
    conta conta1= new conta();
    conta1.saldo = 0;
    conta1.depositar(0);
    conta1.sacar(0);
    cliente c = new cliente();
    c.nome="a";
    c.cpf=0;
    c.nconta=0;
    System.out.println("Digite seu nome: ");
    no=ler.next();
    c.nome=no;
    System.out.println("Digite seu cpf: ");
    cp=ler.nextDouble();
    c.cpf=cp;
    System.out.println("Digite seu numero da conta: ");
    numc=ler.nextInt();
    c.nconta=numc;
    do{
    System.out.println("Qual operação vc deseja realizar:");
    System.out.println("1 - depositar");
    System.out.println("2 - sacar");
    System.out.println("3 - ver saldo");
    System.out.println("4 - terminar operação");
    num =ler.nextInt();
    if(num == 1){
        System.out.println("Digite o valor que vc deseja depositar:");
        x= ler.nextDouble();
        conta1.depositar(x);
    }
    else if(num==2){
        System.out.println("qual valor que você deseja sacar:");
        s=ler.nextDouble();
        conta1.sacar(s);
    }
    else if(num==3){
        System.out.println(c.nome+" ,seu saldo é de: " + conta1.saldo);
    }
    else{
        System.out.println("Operação finalizada");
        break;
    }
    }while(num<4);
  }
}
