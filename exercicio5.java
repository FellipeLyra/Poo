import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int cont = 0;
        int maior = 0;
        int menor = 0;
        double média = 0;
        double soma = 0;
        int x;
        System.out.println("Digite o numero desejado:");
        x = ler.nextInt();
        if (x != -1) {
            cont++;
            menor = x;
        }
        while (x != -1) {
            if (x > maior) {
                maior = x;
            }
            if (x < menor & x != -1) {
                menor = x;
            }
            soma = soma + x;
            média = soma / cont;
            System.out.println("Digite o numero desejado:");
            x = ler.nextInt();
            if (x != -1) {
                cont++;
            }
        }
        System.out.println("Qantidade digtada pelo usuário: " + cont);
        System.out.println("O maior número digitado: " + maior);
        System.out.println("O menor número digitado: " + menor);
        System.out.println("Média dos números digitados: " + média);
    }
}