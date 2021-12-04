import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Declaracion de objetos y variables
        Scanner scan = new Scanner(System.in);
        String password;
        int intentos = 0;

        //Se pide la contraseña
        do {
            System.out.print("Escriba la contraseña: ");
            password = scan.next();

            if (password.equals("1234")) {
                intentos = 3;
                System.out.println("Contraseña correcta.");
            } else {
                intentos++;
                System.out.println("Contraseña incorrecta, ha usado "+intentos+" intentos. (En total son 3 intentos disponibles).");
                System.out.println();
                if (intentos == 3) {
                    System.out.println("Se han acabado sus intentos:(");
                } 
            }
        } while (intentos < 3);

        scan.close();
    }
}
