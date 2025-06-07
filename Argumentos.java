import java.util.Scanner;

public class Argumentos{
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        System.out.println("Digite 3 numeros: ");
        int numero1 = numeros.nextInt();
        int numero2 = numeros.nextInt();
        int numero3 = numeros.nextInt();

        numero(numero1, numero2, numero3);


    }
    public static void numero(int a, int b, int c){
        System.out.println(a+b+c);
    }
}