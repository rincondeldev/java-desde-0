import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Lambda {
    public static void main(String[] args) {
        ArrayList<String> lenguajes = new ArrayList<>();
        lenguajes.add("Java");
        lenguajes.add("Python");
        lenguajes.add("JavaScript");

        // for(String lenguaje : lenguajes) {
        //     System.out.println(lenguaje);
        // }

        Consumer<String> salida = lenguaje -> System.out.println(lenguaje);
        lenguajes.forEach(salida);

        Predicate<String> empiezaConP = texto -> texto.startsWith("P");
        System.out.println(lenguajes);
        lenguajes.removeIf(empiezaConP);

        System.out.println(lenguajes);
    }    
}
