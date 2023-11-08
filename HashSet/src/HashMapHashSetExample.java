import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapHashSetExample {
    public static void main(String[] args) {
        // Crear un HashMap para asociar nombres con edades
        Map<String, Integer> hashMap = new HashMap<>();

        // Agregar elementos al HashMap
        hashMap.put("Alice", 25);
        hashMap.put("Bob", 30);
        hashMap.put("Charlie", 28);
        hashMap.put("David", 35);

        // Crear un HashSet para almacenar algunos intereses
        Set<String> hashSet = new HashSet<>();

        // Agregar elementos al HashSet
        hashSet.add("Música");
        hashSet.add("Deportes");
        hashSet.add("Viajes");

        // Acceder a elementos en el HashMap
        int edadDeAlice = hashMap.get("Alice");
        System.out.println("Edad de Alice: " + edadDeAlice);

        // Verificar si un nombre existe en el HashMap
        boolean contieneEve = hashMap.containsKey("Eve");
        System.out.println("¿El HashMap contiene a Eve? " + contieneEve);

        // Iterar a través de los nombres y edades en el HashMap
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            String nombre = entry.getKey();
            int edad = entry.getValue();
            System.out.println(nombre + ": " + edad);
        }

        // Verificar si un interés existe en el HashSet
        boolean contieneDeportes = hashSet.contains("Deportes");
        System.out.println("¿El HashSet contiene Deportes? " + contieneDeportes);

        // Iterar a través de los intereses en el HashSet
        System.out.println("Intereses en el HashSet:");
        for (String interes : hashSet) {
            System.out.println(interes);
        }
    }
}

