import java.util.Scanner;

public class Utils {

    public static String pedirNombreValido(Scanner leer){
        String nombre = "";
        boolean nombreValido = false;

        while (!nombreValido) {
            System.out.println("Ponga un nombre: ");
            nombre = leer.nextLine();

            if(!nombre.isEmpty() && nombre.matches("[a-zA-Z áéíóúÁÉÍÓÚñÑ]+")){
                nombreValido = true;
            }else{
                System.out.println("Error: el nombre no puede llevar numeros ni caracteres especiales.");
            }
        }

        return nombre;
    }

    public static int pedirNumeroValido(Scanner leerNumero){
        String numero = "";
        boolean numeroValido = false;

        while (!numeroValido){
            System.out.println("Ponga un sueldo: ");
            numero = leerNumero.nextLine();

            if (numero.matches("[0-9]+")){
                numeroValido = true;
            }else{
                System.out.println("Error: Solo se permite numero. ");
            }
        }
        return Integer.parseInt(numero);
    }
}
