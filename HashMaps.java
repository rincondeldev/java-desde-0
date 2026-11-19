import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        // clave - valor
        HashMap<String, Double> productos = new HashMap<>();

        productos.put("Lapiz", 10.5);
        productos.put("Libreta", 15.5);
        productos.put("Borrador", 12.9);

        // Double precio = productos.get("Borrador");

        // System.out.println(precio);
        // for(String nombre : productos.keySet()){
        //     System.out.println("Clave " + nombre + " Precio " + productos.get(nombre));
        // }

        System.out.println(productos);
        productos.remove("Borrador");

        System.out.println(productos);

        productos.clear();
        System.out.println(productos);

    
        


        //System.out.println(productos);
    }    
}
