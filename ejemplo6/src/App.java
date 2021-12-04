import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Declaracion de variables y objetos
        Scanner scan = new Scanner(System.in);
        String frase, preferencia;

        //Se pide al usuario que escriba una frase
        System.out.print("Escriba una frase: ");
        frase = scan.next();

        //Se pide al usuario como desea mostrar la frase (Minúsculas o Mayúsculas)
        System.out.print("¿La frase se mostrara en minúsculas o mayúsculas? Escriba (minus/mayus): ");
        preferencia = scan.next();
        scan.close();
        System.out.println();

        //Se evalua la preferencia y se procesan los resultados
        if (preferencia.equals("mayus")) {
            System.out.println(frase.toUpperCase());
        } else if (preferencia.equals("minus")) {
            System.out.println(frase.toLowerCase());
        } else {
            System.out.println("Opción invalida.");
        }
    }
}
