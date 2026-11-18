public class Condicionales {
    public static void main(String[] args) {
        // int edad = 16;
        // boolean tieneBoleto = true; //false

        /*
            and (&&), or (||), not (!)

            and
            true && true = true
            true && false = false
            false && true = false
            false && false = false

            or
            true or true = true
            true or false = true
            false or true = true
            false or false = false

            not
            not true = false
            not false = true
         */

        // if (tieneBoleto == true) {
        //     System.out.println("Acceso concedido. Bienvenido");
        // } else if(edad >= 18) {
        //     System.out.println("Eres Mayor de edad y puedes pasar");
        // } 
        // else {
        //     System.out.println("Acceso denegado");
        // }

        int calificacion = 6;
        boolean calificacionAprobatoria = calificacion >= 7;

        String resultado;// = calificacionAprobatoria ? "Aprobado" : "Reprobado";

        if (calificacionAprobatoria){
            resultado = "Aprobado";
        }else { 
            resultado = "Reprobado";
        }

        System.out.println(resultado);
    }
}
