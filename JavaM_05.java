import java.util.Scanner;

public class JavaM_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota da primeira disciplina: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a nota da segunda disciplina: ");
        double nota2 = sc.nextDouble();

        if (nota1 >= 7 && nota2 >= 7) {
            System.out.println("Aluno aprovado nas duas disciplinas!");
        } else if (nota1 >= 7) {
            System.out.println("Aluno aprovado na primeira disciplina e reprovado na segunda.");
        } else if (nota2 >= 7) {
            System.out.println("Aluno aprovado na segunda disciplina e reprovado na primeira.");
        } else {
            System.out.println("Aluno reprovado nas duas disciplinas.");
        }

    }
}
