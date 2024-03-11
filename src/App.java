import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        //API de direcciones
        System.out.println("API DE DIRECCCIONES");
        try{
                // Establece la URL de la API
                URL url = new URL("https://fakerapi.it/api/v1/addresses?_quantity=1");
                // Abre una conexión a la URL
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                // Configura el método de solicitud como GET
                connection.setRequestMethod("GET");
                // Establece la conexión
                connection.connect();
                // Obtiene el código de respuesta
                int responseCode = connection.getResponseCode();
                // Si el código de respuesta no es 200 (éxito), lanza una excepción
                if (responseCode != 200) {
                    throw new RuntimeException("Ocurrió un error: " + responseCode);
                }
                // Si la respuesta fue exitosa, crea un StringBuilder para almacenar la información
                StringBuilder informationString = new StringBuilder();
                // Crea un Scanner para leer la respuesta de la API
                Scanner scanner = new Scanner(url.openStream());
                // Recorre cada línea de la respuesta y la agrega al StringBuilder
                while (scanner.hasNext()) {
                    informationString.append(scanner.nextLine());
                }
                // Cierra el Scanner
                scanner.close();
                // Imprime la información de la dirección
                System.out.println(informationString);
                // Maneja cualquier excepción que pueda ocurrir
            } catch (Exception e) {
                // Omite la traza de la pila para simplificar la salida
                e.setStackTrace(null);
            }

            //API de libros
            System.out.println("API DE LIBROS");
            try{
                // Establece la URL de la API
                URL url = new URL("https://fakerapi.it/api/v1/books?_quantity=1&_locale=es_ES");
                // Abre una conexión a la URL
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                // Configura el método de solicitud como GET
                connection.setRequestMethod("GET");
                // Establece la conexión
                connection.connect();
                // Obtiene el código de respuesta
                int responseCode = connection.getResponseCode();
                // Si el código de respuesta no es 200 (éxito), lanza una excepción
                if (responseCode != 200) {
                    throw new RuntimeException("Ocurrió un error: " + responseCode);
                }
                // Si la respuesta fue exitosa, crea un StringBuilder para almacenar la información
                StringBuilder informationString = new StringBuilder();
                // Crea un Scanner para leer la respuesta de la API
                Scanner scanner = new Scanner(url.openStream());
                // Recorre cada línea de la respuesta y la agrega al StringBuilder
                while (scanner.hasNext()) {
                    informationString.append(scanner.nextLine());
                }
                // Cierra el Scanner
                scanner.close();
                // Imprime la información de la dirección
                System.out.println(informationString);
                // Maneja cualquier excepción que pueda ocurrir
            } catch (Exception e) {
                // Omite la traza de la pila para simplificar la salida
                e.setStackTrace(null);
            }

            //API de textos
            System.out.println("API DE TEXTOS");
            try{
                // Establece la URL de la API
                URL url = new URL("https://fakerapi.it/api/v1/texts?_quantity=1&_characters=500");
                // Abre una conexión a la URL
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                // Configura el método de solicitud como GET
                connection.setRequestMethod("GET");
                // Establece la conexión
                connection.connect();
                // Obtiene el código de respuesta
                int responseCode = connection.getResponseCode();
                // Si el código de respuesta no es 200 (éxito), lanza una excepción
                if (responseCode != 200) {
                    throw new RuntimeException("Ocurrió un error: " + responseCode);
                }
                // Si la respuesta fue exitosa, crea un StringBuilder para almacenar la información
                StringBuilder informationString = new StringBuilder();
                // Crea un Scanner para leer la respuesta de la API
                Scanner scanner = new Scanner(url.openStream());
                // Recorre cada línea de la respuesta y la agrega al StringBuilder
                while (scanner.hasNext()) {
                    informationString.append(scanner.nextLine());
                }
                // Cierra el Scanner
                scanner.close();
                // Imprime la información de la dirección
                System.out.println(informationString);
                // Maneja cualquier excepción que pueda ocurrir
            } catch (Exception e) {
                // Omite la traza de la pila para simplificar la salida
                e.setStackTrace(null);
            }


    }
}
