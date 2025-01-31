import java.util.Scanner;

public class JavaM_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        double nota = sc.nextDouble();

        if (nota >= 10) {
            System.out.println("Aluno aprovado com nota máxima!");
        } else if (nota >= 7) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado.");
        }

    }
}
