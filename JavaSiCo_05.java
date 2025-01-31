import java.util.Scanner;

public class JavaSiCo_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String usuarioCorreto = "admin";
        String senhaCorreta = "1234";

        System.out.print("Digite seu usuário: ");
        String usuario = sc.nextLine();

        System.out.print("Digite sua senha: ");
        String senha = sc.nextLine();

        if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
            System.out.println("Acesso concedido.");
        } else {
            System.out.println("Usuário ou senha incorretos. Acesso negado.");
        }
    }
}
