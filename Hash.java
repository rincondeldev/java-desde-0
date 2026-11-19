import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<String> correos = new HashSet<>();

        correos.add("ana@hotmail.com");
        correos.add("juan@hotmail.com");
        correos.add("ana@hotmail.com");

        // System.out.println("Número de elementos " + correos.size());
        System.out.println("Lista de elementos " + correos);

        // for(String correo : correos) {
        //     System.out.println(correo);
        // }

        // System.out.println(correos.contains("juan@hotmail.com"));

        correos.remove("ana@hotmail.com");
        System.out.println("Lista de elementos " + correos);
        correos.clear();
        System.out.println("Lista de elementos " + correos);
    }
}
