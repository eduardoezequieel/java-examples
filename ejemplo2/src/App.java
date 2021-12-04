import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Declaracion de variables y objetos
        Scanner scan = new Scanner(System.in);
        int num;
        double num2;

        //Pide el numero
        System.out.print("Ingresa un número: ");
        num = scan.nextInt();

        //Cerramos el scanner
        scan.close();

        //Obtiene el resto de dividir el numero entre dos
        num2 = num % 2;

        //Evalua si el numero es divisible entre dos
        if (num2 == 0) {
            System.out.println("El número "+num+" es divisible entre 2.");
        } else {
            System.out.println("El número "+num+" no es divisible entre 2.");
        }
    }
}
