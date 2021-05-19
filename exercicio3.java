import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n = 3;
        int n1 = 0;
        int n2 = 1;
        System.out.println("Digite um número inteiro: ");
        n = ler.nextInt();
        int soma = n1 + n2;
        if (n == 1) {
            System.out.println(n1);
        } else if (n == 2) {
            System.out.println(n2);
        } else if (n == 3) {
            System.out.println(soma);
        } else {
            for (int i = 3; i <= n; i++) {
                n1 = n2;
                n2 = soma;
                soma = n1 + n2;
            }
            System.out.println(soma);
        }
    }
} 
