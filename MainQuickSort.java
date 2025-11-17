import java.util.List;

public class MainQuickSort {

    public static void main(String[] args) {
        System.out.println("Llavaso");

        
        String ruta = "C:\\TrabajosGabriela\\1 Quick sort\\datos.txt";
        
       
        Quicksort sorter = new Quicksort();

       
        System.out.println("Leyendo datos de '" + ruta + "'...");
        List<Integer> misNumeros = sorter.leerDatos(ruta);
        
       
        System.out.println("Datos leídos");
        sorter.imprimirLista(misNumeros);
        
        
        
        System.out.println("Fin");
    }
}