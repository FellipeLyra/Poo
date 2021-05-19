import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n = 9;
        int v[] = new int[10];
        int x[] = new int[10];
        System.out.println("digite 10 números: ");
        for (int i = 0; i < 10; i++) {
            v[i] = ler.nextInt();
        }
        for (int j = 0; j < 10; j++) {
            x[n--] = v[j];
        }
        System.out.println("Vetor original:");
        for (int i = 0; i < 10; i++) {
            System.out.print(v[i] + "|");
        }
        System.out.println("    ");
        System.out.println("Vetor invertido:");
        for (int i = 0; i < 10; i++) {

            System.out.print(x[i] + "|");
        }
    }

}