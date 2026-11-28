import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import java.io.BufferedReader;
import java.io.FileReader;

public class Persistencia {
    public static void main(String[] args) {
        String ruta = "notas.txt";

        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(ruta, true))) {
            escritor.write("Capítulo 15: aprendiendo persistencia en Java");
            escritor.newLine();
            escritor.write("Guardando datos en el disco duro desde VS Code");
            escritor.newLine();
            
            System.out.println("Datos se guardaron correctamente en el archivo");
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo" + e.getMessage());
        }

        try (BufferedReader lector = new BufferedReader(new FileReader(ruta))) {
            String linea;

            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
            
        } catch (Exception e) {
            System.out.println("Error al leer el archivo "+ e.getMessage());
        }
    }
}
