import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quicksort {

    public static void main(String[] args) {
        System.out.println("Inicio ");

        
        List<Integer> numeros = new ArrayList<>();
        String nombreArchivo = "datos.txt";

        
        try {
            Scanner scanner = new Scanner(new File(nombreArchivo));
            System.out.println("Leyendo'" + nombreArchivo + "'...");
            
            while (scanner.hasNextInt()) {
                numeros.add(scanner.nextInt());
            }
            scanner.close();

            
            System.out.println("Datos:");
            System.out.println(numeros);

        } catch (FileNotFoundException e) {
            System.err.println("Error: No se pudo encontrar el archivo " + nombreArchivo);
            e.printStackTrace();
        }

       

        System.out.println("Fin ");
    }

    
}