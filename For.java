public class For {
    public static void main(String[] args) {
        // int contador = 1;
        // while (contador <= 5) {
        //     System.out.println("Número de vuelta " + contador);
        //     contador++;
        // }

        // for (int i = 1 ; i <= 5; i++) { //scope o ámbito
        //     System.out.println("Númeor de vuelta " + i);
        // }

        String palabra = "Mundo";// [M,u,n,d,o]
        for(String letra : palabra.split("")) {
            System.out.println(letra);
        }
    }    
}
