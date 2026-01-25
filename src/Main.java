import java.util.Optional;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Empleado[] listaEmpleado = new Empleado[4];

        boolean salir = false;

        int contador = 0;

        while (!salir && contador < 4) {
            System.out.println("=== Donmina Simple ===");

            System.out.println("1.Empleado ");
            System.out.println("2.Gerente ");
            System.out.println("3.Vendedor ");
            System.out.println("4.Freelancer");
            System.out.println("0.Salir ");
            System.out.println("Elige: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            String nombre = "";
            double sueldo = 0; if (opcion != 0){
                System.out.println("Ponga un nombre: ");
                nombre = scanner.nextLine();

                if (opcion == 4)
                    System.out.println("Ponga el valor de su hora: ");
                else{
                    System.out.println("Ponga el sueldo: ");
                    sueldo = scanner.nextDouble();
                }
            }

            switch (opcion){
                case 0:
                    System.out.println("Adios! ");
                    salir = true;
                    break;
                case 1:
                    listaEmpleado[contador] = new Empleado(nombre, sueldo);
                    contador++;
                    break;
                case 2:
                    System.out.println("Inglese el bono del gerente: ");
                    double bono = scanner.nextDouble();
                    listaEmpleado[contador] = new Gerente(nombre, sueldo, bono);
                    contador++;
                    break;
                case 3:
                    System.out.println("Inglese la venta del vendedor: ");
                    double ventas = scanner.nextDouble();
                    listaEmpleado[contador] = new Vendedor(nombre, sueldo, ventas);
                    contador++;
                    break;
                case 4:
                    double valorHora = scanner.nextDouble();
                    System.out.println("Cuantas horas has trabajado? ");
                    double horasTrabajadas = scanner.nextDouble();
                    listaEmpleado[contador] = new Freelancer(nombre, horasTrabajadas, valorHora);
                    contador++;
                    break;
                default:
                    System.out.println("Opcion mal!!");
                    break;
            }
        }

        System.out.println("=== Datos de empleados ===");

        for (int i = 0; i < contador; i++) {
            System.out.println();
            System.out.println(listaEmpleado[i].toString());
            System.out.println();
            System.out.println("-----------------------------------");
        }
    }
}