import java.util.Scanner;

public class JavaOp_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        double raizQuadrada = Math.sqrt(numero);

        if (raizQuadrada == (int) raizQuadrada) {
            System.out.println("O número é um quadrado perfeito.");
        } else {
            System.out.println("O número não é um quadrado perfeito.");
        }
    }
}
