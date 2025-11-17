import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Quicksort {

    public List<Integer> leerDatos(String rutaArchivo) {
        List<Integer> numeros = new ArrayList<>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo))) {
            
            String linea = reader.readLine();
            
            if (linea != null && !linea.isEmpty()) {
                String[] valores = linea.split(" ");
                
                for (String valor : valores) {
                    numeros.add(Integer.parseInt(valor.trim()));
                }
            } else {
                System.out.println("El archivo está vacío o no se pudo leer la línea.");
            }

        } catch (IOException e) {
            System.err.println("Error : ");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println("Error");
            e.printStackTrace();
        }
        
        return numeros;
    }

    public void imprimirLista(List<Integer> lista) {
        System.out.println(lista);
    }
}