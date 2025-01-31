import java.util.Scanner;

public class JavaC_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa: ");
        int idade = sc.nextInt();

        if (idade >= 0 && idade <= 12) {
            System.out.println("A pessoa é uma criança.");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("A pessoa é um adolescente.");
        } else if (idade >= 18 && idade <= 59) {
            System.out.println("A pessoa é um adulto.");
        } else if (idade >= 60) {
            System.out.println("A pessoa é um idoso.");
        } else {
            System.out.println("Idade inválida.");
        }
    }
}
