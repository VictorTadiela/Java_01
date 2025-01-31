import java.util.Scanner;

public class JavaF_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário da pessoa: R$ ");
        double salario = sc.nextDouble();

        if (salario >= 3000) {
            System.out.println("A pessoa pode financiar o imóvel.");
        } else {
            System.out.println("A pessoa não pode financiar o imóvel.");
        }
    }
}
