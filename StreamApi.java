import java.util.ArrayList;
import java.util.List;

public class StreamApi {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Carlos");
        nombres.add("Luis");
        nombres.add("Fernanda");
        nombres.add("Sofía");

        // List<String> nombresLargos = nombres.stream()
        //                              .filter(nombre -> nombre.length() > 4)
        //                              .toList();

        // System.out.println(nombres);
        // System.out.println(nombresLargos);


        ArrayList<Double> precios = new ArrayList<>();
        precios.add(15.0);
        precios.add(50.0);
        precios.add(100.0);
        precios.add(25.0);

        List<Double> precioConDesc = precios.stream()
                                     .filter(precio -> precio > 20)
                                     .map(precio -> precio * 0.85)
                                     .sorted()
                                     .toList();

        System.out.println(precios);
        System.out.println(precioConDesc);
    }
}
