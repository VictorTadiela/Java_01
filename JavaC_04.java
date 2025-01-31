import java.util.Scanner;

public class JavaC_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a pressão arterial sistólica (primeiro número): ");
        int n1 = sc.nextInt();

        System.out.print("Digite a pressão arterial diastólica (segundo número): ");
        int n2 = sc.nextInt();

        if (n1 < 120 && n2< 80) {
            System.out.println("A pressão arterial é normal.");
        } else if ((n1>= 120 && n1 < 130) && n2 < 80) {
            System.out.println("A pressão arterial está moderada.");
        } else if (n1 >= 130 || n2 >= 80) System.out.println("A pressão arterial está alta.");
        else {
            System.out.println("Valores inválidos para pressão arterial.");
        }
    }
}
