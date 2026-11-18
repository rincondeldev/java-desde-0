import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa una opción");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Cargando tu saldo");
                break;
            case 2:
                System.out.println("Hablando con un asesor");

            case 3:
                System.out.println("Buzon de quejas y sugerencias");
                break;
            default:
                System.out.println("Opción no válida, digite un número de 1 - 3");
                break;
        }

        scanner.close();
    }    
}
