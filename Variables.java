public class Variables {

    int numeros = 1000000;
    byte edad = 25;
    long granosDeArena = 30000000000000L;
    double precioDolar = 20.40;
    float estatura = 1.90f;

    // caracteres y lógicos
    char seccion = 'A';
    boolean seccionActiva = true;

    // constates
    
    
    public static void main(String[] args) {
        //final double PI = 3.14159;
        double dolar = 20.5;
        //PI = 4;
        dolar = 19.9;

        String cadena = "Hola Mundo XD";

        int suma = (int)(dolar + Double.parseDouble("10"));
        double sumaD = dolar + Double.parseDouble("10");

        
        System.out.println("Hola Mundo");
        System.out.println(cadena);
        System.out.println(suma + "\n" + sumaD);
    }
}