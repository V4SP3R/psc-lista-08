import java.util.Scanner;

public class PiramideN {

    
    static void piramide(int n){

        for(int i = 1; i <=n; i++){
            for(int j = 1; j <=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int numero = numeros.nextInt();

        piramide(numero);
        numeros.close();
    }
}


