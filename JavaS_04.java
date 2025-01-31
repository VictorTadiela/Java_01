import java.util.Scanner;

public class JavaS_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();

        if (palavra.length() > 5) {
            System.out.println("A palavra contém mais de 5 caracteres.");
        } else {
            System.out.println("A palavra não contém mais de 5 caracteres.");
        }

    }
}
