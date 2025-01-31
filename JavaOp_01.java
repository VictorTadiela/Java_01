import java.util.Scanner;

public class JavaOp_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = sc.nextInt();

        int soma = numero1 + numero2;

        if (soma > 100) {
            System.out.println("A soma é maior que 100.");
        } else {
            System.out.println("A soma não é maior que 100.");
        }

    }
}
