import java.util.Scanner;

public class Imposto{

    public static double somaImposto(double taxaImposto, double custo) {
        double Imposto = (taxaImposto/100)*custo;
        return custo + Imposto;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o custo do item, sem imposto: ");
        double custo = scanner.nextDouble();
        System.out.println("Digite a taxa do imposto em porcentagem: ");
        double taxaImposto = scanner.nextDouble();

        double custofinal = somaImposto(taxaImposto, custo);
        System.out.println("O custo final com imposto é: R$ " + custofinal);
        scanner.close();
    }
}