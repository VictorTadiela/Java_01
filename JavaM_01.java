import java.util.Scanner;

public class JavaM_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de notas
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        // Cálculo da média
        double media = (nota1 + nota2) / 2;

        // Verificação da aprovação
        if (media >= 7) {
            System.out.println("Aluno aprovado! Média: " + media);
        } else {
            System.out.println("Aluno reprovado! Média: " + media);
        }

        scanner.close();
    }
}
