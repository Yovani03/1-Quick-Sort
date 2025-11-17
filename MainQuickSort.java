import java.util.List;

public class MainQuickSort {

    public static void main(String[] args) {
        System.out.println("--- Inicio del Programa Quicksort ---");

        String ruta = "C:\\TrabajosGabriela\\1 Quick sort\\resources\\datos.txt";
        
        Quicksort sorter = new Quicksort();

        
        List<Integer> misNumeros = sorter.leerDatos(ruta);
        
        System.out.println("Datos (sin ordenar):");
        sorter.imprimirLista(misNumeros);
        
        System.out.println("ordenanding...");
        sorter.sort(misNumeros);
        
        System.out.println("Datos ordenados:");
        sorter.imprimirLista(misNumeros);

        
    }
}