import java.util.Scanner;

public class JavaF_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o saldo da conta: ");
        double saldo = sc.nextDouble();

        System.out.print("Digite o valor do saque: ");
        double saque = sc.nextDouble();

        if (saque <= saldo) {
            saldo -= saque;
            System.out.println("Saque realizado com sucesso. Novo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }
}
