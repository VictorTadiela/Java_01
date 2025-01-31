import java.util.Scanner;

public class JavaSiCo_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número da placa do veículo (último dígito): ");
        int ultimoDigito = sc.nextInt();

        if (ultimoDigito % 2 == 0) {
            System.out.println("O veículo pode passar no pedágio (placa termina com número par).");
        } else {
            System.out.println("O veículo pode passar no pedágio (placa termina com número ímpar).");
        }
    }
}
