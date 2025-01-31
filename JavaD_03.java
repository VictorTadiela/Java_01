import java.util.Scanner;

public class JavaD_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número do mês (1 a 12): ");
        int mes = sc.nextInt();

        System.out.print("Digite o ano: ");
        int ano = sc.nextInt();

        System.out.print("Digite o dia do mês: ");
        int dia = sc.nextInt();

        if (mes < 1 || mes > 12) {
            System.out.println("Mês inválido.");
        } else {
            int diasNoMes = getDiasNoMes(mes, ano);

            if (dia >= 1 && dia <= diasNoMes) {
                System.out.println("O dia informado é válido.");
            } else {
                System.out.println("O dia informado é inválido para o mês.");
            }
        }
    }

    public static int getDiasNoMes(int mes, int ano) {
        switch (mes) {
            case 1: // Janeiro
            case 3: // Março
            case 5: // Maio
            case 7: // Julho
            case 8: // Agosto
            case 10: // Outubro
            case 12: // Dezembro
                return 31;
            case 4: // Abril
            case 6: // Junho
            case 9: // Setembro
            case 11: // Novembro
                return 30;
            case 2: // Fevereiro
                if (isAnoBissexto(ano)) {
                    return 29; // Ano bissexto
                } else {
                    return 28; // Ano não bissexto
                }
            default:
                return 0; // Mês inválido
        }
    }

    public static boolean isAnoBissexto(int ano) {
        return (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0));
    }
}
