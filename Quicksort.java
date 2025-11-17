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
                System.out.println("El archivo no ta.");
            }

        } catch (IOException e) {
            System.err.println("Error al leer el archivo: ");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println("Error los datos solo deben ser enteros: ");
            e.printStackTrace();
        }
        
        return numeros;
    }

    public void imprimirLista(List<Integer> lista) {
        System.out.println(lista);
    }

    public void sort(List<Integer> lista) {
        quickSort(lista, 0, lista.size() - 1);
    }

    private void quickSort(List<Integer> lista, int bajo, int alto) {
        if (bajo < alto) {
            int indicePivote = particion(lista, bajo, alto);
            
            quickSort(lista, bajo, indicePivote - 1);
            quickSort(lista, indicePivote + 1, alto);
        }
    }

    private int particion(List<Integer> lista, int bajo, int alto) {
        int pivote = lista.get(alto);
        int i = (bajo - 1);

        for (int j = bajo; j < alto; j++) {
            if (lista.get(j) < pivote) {
                i++;
                swap(lista, i, j);
            }
        }

        swap(lista, i + 1, alto);
        return (i + 1);
    }

    private void swap(List<Integer> lista, int i, int j) {
        int temp = lista.get(i);
        lista.set(i, lista.get(j));
        lista.set(j, temp);
    }
}