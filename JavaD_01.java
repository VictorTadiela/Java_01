import java.util.Scanner;

public class JavaD_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a hora (0 a 23): ");
        int hora = sc.nextInt();

        System.out.print("Digite os minutos (0 a 59): ");
        int minutos = sc.nextInt();

        if (hora >= 0 && hora <= 23 && minutos >= 0 && minutos <= 59) {
            System.out.println("O horário informado é válido.");
        } else {
            System.out.println("O horário informado é inválido.");
        }
    }
}
