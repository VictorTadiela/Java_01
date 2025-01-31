import java.util.Scanner;

public class JavaS_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um nome: ");
        String nome = sc.nextLine();

        if (nome.length() > 0 && nome.toUpperCase().charAt(0) == 'A') {
            System.out.println("O nome começa com a letra A.");
        } else {
            System.out.println("O nome não começa com a letra A.");
        }

    }
}
