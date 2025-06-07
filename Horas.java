import java.util.Scanner;

public class Horas{
public static String converterHoras(int hora24, int minuto) {
        String periodo = (hora24 < 12) ? "A.M." : "P.M.";
        int hora12 = (hora24 == 0) ? 12 : (hora24 > 12 ? hora24 - 12 : hora24);
        return String.format("%02d:%02d %s", hora12, minuto, periodo);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;

        do {
            System.out.print("Digite a hora (0 a 23) e os minutos (0 a 59) (Separadamente): ");
            int hora = scanner.nextInt();
            int minuto = scanner.nextInt();

            if (hora < 0 || hora > 23 || minuto < 0 || minuto > 59) {
                System.out.println("Horário inválido. Tente novamente.");
            } else {
                String horaConvertida = converterHoras(hora, minuto);
                System.out.println("Hora convertida: " + horaConvertida);
            }

            System.out.print("Deseja converter outro horário? (S/N): ");
            continuar = scanner.next().toUpperCase().charAt(0);

        } while (continuar == 'S');

        System.out.println("Até Breve...Programa encerrado!");
        scanner.close();
    }
}
