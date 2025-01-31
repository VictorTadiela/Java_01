import java.util.Scanner;

public class JavaS_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite 'Sim' ou 'Não': ");
        String resposta = sc.nextLine();

        if (resposta.equalsIgnoreCase("Sim")) {
            System.out.println("Você digitou Sim.");
        } else if (resposta.equalsIgnoreCase("Não")) {
            System.out.println("Você digitou Não.");
        } else {
            System.out.println("Entrada inválida.");
        }


    }
}
