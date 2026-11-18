import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        /*
            tipos primitivos:
                int, double, float, boolean..

            wrapper classes:
                Integer, Double, Float, Boolean
         */
        ArrayList<String> carrito = new ArrayList<>();
        /*
            Create
            Read
            Update
            Delete
         */

        // Create
        carrito.add("Celular");
        carrito.add("Bolsa");
        carrito.add("Zapatos");
        carrito.add("Libreta");

        //System.out.println(carrito);

        //Read
        // System.out.println(carrito.get(1));
        // System.out.println(carrito);
        // //Update
        // carrito.set(3, "Lápiz");
        // System.out.println(carrito);

        // //Delete
        // carrito.remove(1);
        // System.out.println(carrito);

        // for(String item : carrito) {
        //     System.out.println(item);
        // }

        for(int i = 0; i < carrito.size();i++){
            System.out.println(carrito.get(i));
        }
    }    
}
