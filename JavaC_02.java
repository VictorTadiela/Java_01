import java.util.Scanner;

public class JavaC_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        if (numero >= 1 && numero <= 10) {
            System.out.println(" A.");
        } else if (numero >= 11 && numero <= 20) {
            System.out.println("B.");
        } else if (numero >= 21 && numero <= 30) {
            System.out.println("C.");
        } else {
            System.out.println("invalido.");
        }
    }
}
