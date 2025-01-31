import java.util.Scanner;

public class JavaM_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        double maior = nota1;
        double menor = nota1;

        if (nota2 > maior) maior = nota2;
        if (nota3 > maior) maior = nota3;

        if (nota2 < menor) menor = nota2;
        if (nota3 < menor) menor = nota3;

        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);

    }
}
