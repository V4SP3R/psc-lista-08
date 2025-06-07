import java.util.Scanner;

public class Positivo_Negativo{
    
    public static char verficar(int numero){
        if (numero> 0) {
            return 'P';   

        }else{return 'N';}
    }
    public static void main(String[] args) {
        Scanner argumento = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int valor = argumento.nextInt();

        char resultado = verficar(valor);
        System.out.println(resultado);
        
        argumento.close();
    }
}