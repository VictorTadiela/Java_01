import java.util.Scanner;

public class JavaC_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a altura da pessoa em metros: ");
        double altura = sc.nextDouble();

        if (altura < 1.60) {
            System.out.println("baixa.");
        } else if (altura >= 1.60 && altura < 1.80) {
            System.out.println("média.");
        } else {
            System.out.println(" alto.");
        }
    }
}
