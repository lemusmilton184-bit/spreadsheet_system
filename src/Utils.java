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





}
