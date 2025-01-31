import java.util.Scanner;

public class JavaSiCo_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.print("Digite seu peso em kg: ");
        double peso = sc.nextDouble();

        if (idade >= 18 && idade <= 65 && peso >= 50) {
            System.out.println("Você está apto para doar sangue.");
        } else {
            System.out.println("Você não está apto para doar sangue.");
        }
    }
}
