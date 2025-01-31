import java.util.Scanner;

public class JavaSiCo_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigoDeAcesso = 9876;  // Código de acesso predefinido

        System.out.print("Digite o código de acesso: ");
        int codigoInformado = sc.nextInt();

        if (codigoInformado == codigoDeAcesso) {
            System.out.println("Acesso concedido.");
        } else {
            System.out.println("Código incorreto. Acesso negado.");
        }
    }
}
