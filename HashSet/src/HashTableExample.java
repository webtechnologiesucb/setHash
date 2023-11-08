
import java.util.HashMap;
import java.util.Map;

public class HashTableExample {
    public static void main(String[] args) {
        // Crear una instancia de HashMap
        Map<String, Integer> hashMap = new HashMap<>();

        // Agregar elementos a la Hash Table
        hashMap.put("Ariana", 25);
        hashMap.put("Roberto", 30);
        hashMap.put("Charlie", 28);
        hashMap.put("Mariana", 35);

        // Acceder a elementos por clave
        int ageOfAlice = hashMap.get("Ariana");
        System.out.println("Edad de Ariana: " + ageOfAlice);

        // Verificar si una clave existe en la Hash Table
        boolean containsKey = hashMap.containsKey("Daniel");
        System.out.println("¿Daniel está en la Hash Table? " + containsKey);

        // Iterar a través de las claves y valores
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            String name = entry.getKey();
            int age = entry.getValue();
            System.out.println(name + ": " + age);
        }

        // Eliminar un elemento por clave
        hashMap.remove("Charlie");

        // Tamaño de la Hash Table
        int size = hashMap.size();
        System.out.println("Tamaño de la Hash Table: " + size);
    }
}