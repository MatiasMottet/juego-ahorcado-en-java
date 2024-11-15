import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {

        // Clase Scanner que permite que el usuario escriba
        Scanner scanner = new Scanner(System.in);

        // Declaraciones y asginaciones
        String palabraSecreta = "guerrero";
        int intentosMaximos = 7;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // Arreglos
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        // Estructura de control Iterativa (Bucle)
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        // Estructura de control Iterativa
        while (!palabraAdivinada && intentos < intentosMaximos) {
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " (" + palabraSecreta.length() + " letras)");

            System.out.println("Introduzca una letra: ");

            // Usamos la clase Scanner para solicitar una letra al usuario
            // Character.toLowerCase para transformar en caso de que ingrese una letra en mayúscula en minúscula
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;

            // Estructura de control Iterativa
            for (int i = 0; i < palabraSecreta.length(); i++) {
                // Estructura de control condicional
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }

            if (!letraCorrecta) {
                intentos++;
                System.out.println("¡Letra incorrecta! Te quedan " + (intentosMaximos - intentos) + " intentos.");
            }

            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("¡Felicidades! La palabra secreta era: " + palabraSecreta);
            }
        }
            
        if (!palabraAdivinada) {
            System.out.println("Lo siento, te has quedado sin intentos :(");
        }
        scanner.close();
    }

}
