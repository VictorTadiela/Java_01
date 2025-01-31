import java.util.Scanner;

public class JavaF_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor total da compra: R$ ");
        double valorCompra = sc.nextDouble();

        double valorFinal = valorCompra;

        if (valorCompra > 500) {
            double desconto = valorCompra * 0.10; // 10% de desconto
            valorFinal = valorCompra - desconto;
            System.out.println("Você recebeu um desconto de R$ " + desconto);
        }

        System.out.println("Valor final após desconto: R$ " + valorFinal);
    }
}
