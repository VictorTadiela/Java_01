import java.util.Scanner;

public class JavaS_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String senhaCorreta = "1234";

        System.out.print("Digite a senha: ");
        String senhaDigitada = sc.nextLine();

        if (senhaDigitada.equals(senhaCorreta)) {
            System.out.println("Senha correta!");
        } else {
            System.out.println("Senha incorreta.");
        }
    }
}
