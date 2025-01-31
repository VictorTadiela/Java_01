import java.util.Scanner;

public class JavaOp_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = sc.nextInt();

        if (numero2 != 0 && numero1 % numero2 == 0) {
            System.out.println("O primeiro número é divisível pelo segundo.");
        } else if (numero1 != 0 && numero2 % numero1 == 0) {
            System.out.println("O segundo número é divisível pelo primeiro.");
        } else {
            System.out.println("Nenhum dos números é divisível pelo outro.");
        }
    }
}
