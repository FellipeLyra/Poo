import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int valor;
        int t;
        System.out.println("Qual valor você deseja sacar: ");
        valor = ler.nextInt();
        t = valor;
        if (t >= 50) {
            t = valor / 50;
            valor = valor % 50;
            System.out.println(t + " notas de 50");
        }
        if (valor >= 10) {
            t = valor / 10;
            valor = valor % 10;
            System.out.println(t + " notas de 10");

        }
        if (valor >= 5) {
            t = valor / 5;
            valor = valor % 5;
            System.out.println(t + " notas de 5");
        }
        if (valor >= 1) {
            t = valor / 1;
            valor = valor % 1;
            System.out.println(t + " notas de 1");
        }
        if (t == 0) {
            System.out.println("Você já sacou td");
        }

    }
}