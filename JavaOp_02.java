import java.util.Scanner;

public class JavaOp_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = sc.nextInt();

        int diferenca = numero1 - numero2;

        if (diferenca < 0) {
            System.out.println("A diferença é negativa.");
        } else {
            System.out.println("A diferença não é negativa.");
        }

    }
}
