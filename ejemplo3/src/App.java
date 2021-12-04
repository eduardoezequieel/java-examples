import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Declaracion de objetos y variables
        Scanner scan = new Scanner(System.in);
        int num1, num2;

        //Captura los numeros
        System.out.print("Ingrese un número: ");
        num1 = scan.nextInt();
        System.out.print("Ingrese otro número: ");
        num2 = scan.nextInt();
        scan.close();

        //Se evalua cual de los dos numeros es mayor y menor.
        if (num1>num2) {
            ArrayList<Integer> nums = generaNumeroAleatorio(num2, num1); 
            System.out.println(nums);
        } else {
            ArrayList<Integer> nums = generaNumeroAleatorio(num1, num2); 
            System.out.println(nums);
        }
    }

    //Metodo que genera numeros aleatorios
    public static ArrayList<Integer> generaNumeroAleatorio(int minimo,int maximo){
        ArrayList<Integer> nums = new ArrayList<Integer>(); 
        do {
            int num=(int) Math.floor(Math.random()*(maximo-minimo+1)+minimo);
            if (nums.contains(num)) {
                //No se guarda un número duplicado
            } else {
                nums.add(num);
            }
        } while (nums.size() <= maximo - minimo);
        Collections.sort(nums);
        return nums;
    }
}
