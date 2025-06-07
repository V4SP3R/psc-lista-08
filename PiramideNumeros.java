import java.util.Scanner;

public class PiramideNumeros{


    static void piramide(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
    Scanner numeros = new Scanner(System.in);
    System.out.println("Digite um numero: ");
    int numero = numeros.nextInt();

    piramide(numero);
    numeros.close();
}
    
}