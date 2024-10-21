import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Esta clase lee un archivo de texto, reemplaza los espacios con guiones y escribe el resultado en otro archivo.
 */
public class Main {

    /**
     * Método principal que ejecuta la operación de copia y reemplazo.
     *
     * @param args Argumentos de línea de comandos (no utilizados en este caso)
     * @throws IOException Si ocurre un error al leer o escribir en los archivos
     */
    public static void main(String[] args) throws IOException {
        // Especificamos las rutas de los archivos de origen y destino
        String archivoOrigen = "M2_T02_Origen.txt";
        String archivoDestino = "M2_T02_Destino.txt";

        // Utilizamos try-with-resources para asegurar el cierre automático de los archivos
        try (FileReader lector = new FileReader(archivoOrigen);
             FileWriter escritor = new FileWriter(archivoDestino)) {

            // Leemos el archivo de origen carácter a carácter
            int caracter;
            while ((caracter = lector.read()) != -1) {
                // Si el carácter es un espacio, escribimos un guión en el archivo de destino
                if (caracter == ' ') {
                    escritor.write('-');
                } else {
                    // Si no es un espacio, escribimos el carácter tal cual
                    escritor.write(caracter);
                }
            }
        } catch (IOException e) {
            System.out.println("Se produjo un error al procesar los archivos: " + e.getMessage());
        }
    }
}
