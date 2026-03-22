import java.util.Optional;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static Empleado[] listaEmpleado = new Empleado[4];
    static int contador = 0;
    static double totalnomina = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean salir = false;

        while (!salir && contador < 5){

            menu(scanner);

            int opcion = scanner.nextInt();
            scanner.nextLine();
            double sueldo = 0;
            if (opcion > 0 && opcion <= 5){
                String nombre = "";
               if (opcion == 5){
                   informacionEmpl();
               }else{
                   nombre = Utils.pedirNombreValido(scanner);
                   if (opcion != 4){
                       sueldo = Utils.pedirNumeroValido(scanner);
                   }
                   tipoEmpleado(scanner, opcion, nombre, sueldo);
               }
            }else{
                System.out.println("finalizacion programa.");
                salir = true;
            }
        }
    }

    public static void contratar(Empleado nuevoEmpleado){

        if (contador < listaEmpleado.length){
            listaEmpleado[contador] = nuevoEmpleado;

            contador++;

            System.out.println("Contratado: " + nuevoEmpleado.getNombre());
        }else{
            System.out.println("Error no hay vacantes");
        }
    }

    public static void informacionEmpl(){
        System.out.println("=== Datos de empleados ===");

        for (int i = 0; i < contador; i++) {
            System.out.println(listaEmpleado[i].toString());
            System.out.println("-----------------------------------");
            totalnomina += listaEmpleado[i].obtenerSueldo();
        }
        System.out.println("Total a desemblosar por la empresa $" + totalnomina);
    }

    public static void menu(Scanner scanner){
        System.out.println("=== Donmina Simple ===");

        System.out.println("1.Empleado ");
        System.out.println("2.Gerente ");
        System.out.println("3.Vendedor ");
        System.out.println("4.Freelancer");
        System.out.println("5.Mostrar informacion");
        System.out.println("0.Salir ");
        System.out.println("Elige: ");
    }

    public static void tipoEmpleado(Scanner scanner, int opcion, String nombre, double sueldo){

        switch (opcion) {
            case 1:
                contratar(new Empleado(nombre, sueldo));
                break;
            case 2:
                System.out.println("Inglese el bono del gerente: ");
                double bono = scanner.nextDouble();
                contratar(new Gerente(nombre, sueldo, bono));
                break;
            case 3:
                System.out.println("Inglese la venta del vendedor: ");
                double ventas = scanner.nextDouble();
                contratar(new Vendedor(nombre, sueldo, ventas));
                break;
            case 4:
                System.out.println("Ponga el valor de su hora: ");
                double valorHora = scanner.nextDouble();
                System.out.println("Cuantas horas has trabajado? ");
                double horasTrabajadas = scanner.nextDouble();
                contratar(new Freelancer(nombre, horasTrabajadas, valorHora));
                break;
            default:
                System.out.println("Opcion mal!!");
                break;
        }
    }
}