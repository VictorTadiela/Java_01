import java.util.Scanner;

public class JavaJ_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        if (num1 > 2 * num2) {
            System.out.println("O primeiro número é maior que o dobro do segundo.");
        } else {
            System.out.println("O primeiro número não é maior que o dobro do segundo.");
        }
    }
}
