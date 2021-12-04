import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Declaración de variables y objetos
        Scanner scan = new Scanner(System.in);
        String producto[] = new String[3];
        double precio[] = new double[3];

        //Mensaje de bienvenida
        System.out.println("Bienvenido, en este programa deberas ingresar 3 productos y sus respectivos precios.");
        System.out.println();

        //Captura de datos
        int contador = 1;
        for (int i = 0; i < producto.length; i++) {
            System.out.println("Producto número "+contador);
            System.out.print("Ingresa el nombre del producto: ");
            producto[i] = scan.next();
            System.out.print("Ingresa el precio del producto: ");
            precio[i] = scan.nextFloat();
            System.out.println();
            contador++;
        }
        
        scan.close();

        //Almacenamiento y procesamiento de datos de en un LinkedHashMap
        Map<Integer, Double> ivaMap = new LinkedHashMap<Integer, Double>();
        double iva;

        //Se calcula el IVA y se guarda en el HashMap
        for (int i = 0; i < precio.length; i++) {
            iva = precio[i] * 0.13;
            ivaMap.put(i+1, iva);
        }

        // Imprimimos el HashMap con un Iterador
        Iterator it = ivaMap.keySet().iterator();
        int i = 0;
        double total = 0;
        String log = "";

        //Para formatear los decimales del IVA.
        DecimalFormat df = new DecimalFormat("#.00");

        while(it.hasNext()){
            Integer key = (Integer) it.next();
            total = ivaMap.get(key) + precio[i];
            log += key + ". Producto: " + producto[i] + ", Precio: $" + precio[i] + ", IVA: $" + df.format(ivaMap.get(key)) + ", Precio Total: $" + df.format(total) + "\n";
            System.out.println(key + ". Producto: " + producto[i] + ", Precio: $" + precio[i] + ", IVA: $" + df.format(ivaMap.get(key)) + ", Precio Total: $" + df.format(total));
            i++;
        }

        System.out.println();

        try {
            PrintWriter writer = new PrintWriter("log.txt", "UTF-8");
            writer.println("REGISTRO DE PRODUCTOS INGRESADOS");
            writer.println();
            writer.println(log);
            writer.close();
            System.out.println("¡IMPORTANTE! Se ha guardado una copia de los registros en el archivo log.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println();

    }
}
