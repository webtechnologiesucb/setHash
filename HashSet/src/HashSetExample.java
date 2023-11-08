import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // Crear una instancia de HashSet
        Set<String> hashSet = new HashSet<>();

        // Agregar elementos al HashSet
        hashSet.add("Manzana");
        hashSet.add("Banana");
        hashSet.add("Cereza");
        hashSet.add("Durazno");

        // Mostrar los elementos del HashSet
        System.out.println("Elementos en el HashSet: " + hashSet);

        // Verificar si un elemento existe en el HashSet
        boolean contieneBanana = hashSet.contains("Banana");
        System.out.println("¿El HashSet contiene Banana? " + contieneBanana);

        // Eliminar un elemento del HashSet
        hashSet.remove("Cereza");

        // Iterar a través de los elementos del HashSet usando un Iterator
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            String fruta = iterator.next();
            System.out.println(fruta);
        }

        // Tamaño del HashSet
        int tamano = hashSet.size();
        System.out.println("Tamaño del HashSet: " + tamano);
    }
}

