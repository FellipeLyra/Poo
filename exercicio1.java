import java.util.Scanner;
public class exercicio1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float etanol;
        float gasolina;
        float valor;
        System.out.println("Digite o valor da etanol: ");
        etanol = ler.nextFloat();
        System.out.println("Digite o valor da gasolina: ");
        gasolina = ler.nextFloat();
        valor = etanol / gasolina;
        if (valor <= 0.7) {
            System.out.println("Abasteça com etanol");
        } else {
            System.out.println("Abasteça com gasolina");
        }
    }
}