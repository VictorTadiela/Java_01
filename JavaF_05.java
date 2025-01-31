import java.util.Scanner;

public class JavaF_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor total da compra: R$ ");
        double valorCompra = sc.nextDouble();

        double valorMinimo = 100.0;

        if (valorCompra >= valorMinimo) {
            System.out.println("Você ganhou um brinde!");
        } else {
            System.out.println("O valor da compra não atinge o mínimo para ganhar o brinde.");
        }
    }
}
