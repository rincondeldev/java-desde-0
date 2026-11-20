import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        do{
            try {
                System.out.println("Ingrese un denominador");
                input = scanner.nextLine();

                int resultado = 100 / Integer.parseInt(input);
                System.out.println(resultado);  
            } catch (InputMismatchException e) {
                System.out.println("Error de formato, debes ingresar sólo números!!.");
            } catch (ArithmeticException e) {
                System.out.println("No se puede dividir un número por 0");
            } catch (Exception e) {
                System.err.println("Ocurrió un error inesperado " + e);
            } finally {
                System.out.println("Recursos liberados correctamente");
            } 
            
        } while (input != "close");
        scanner.close();
    }    
}
