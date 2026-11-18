public class Operadores {
    public static void main(String[] args) {
        // operadores matemáticos +, -, *, /

        int a = 10, b = 3;

        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        int division = a / b;

        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multiplicacion);
        System.out.println(division);

        int modulo = a % b;

        System.out.println(modulo);

        // contador = contador + 1
        int contador = 5;
        System.out.println(contador);
        contador++; // contador = contador + 1
        contador--;

        ++contador;
        --contador;

        int x = 5;  
        System.out.println("x++ "+x++);
        System.out.println("valor final de x "+x);

        int y = 5;
        System.out.println("valor de y "+ ++y);
        System.out.println("valor final de y "+ y);

        //Operadores relacionales
        // true o false

        int edadUsuario = 20;
        int edadMinima = 18;

        boolean esMayor = edadUsuario > edadMinima; //true
        boolean esMenor = edadUsuario < edadMinima; //false
        boolean esMayorOIual = edadUsuario >= edadMinima; //true
        boolean esDiferente = edadUsuario != edadMinima; //true
        boolean esIgual = edadUsuario == edadMinima; //false

        System.out.println(esMayor);
        System.out.println(esMenor);
        System.out.println(esMayorOIual);
        System.out.println(esDiferente);
        System.out.println(esIgual);
        
    }
}
