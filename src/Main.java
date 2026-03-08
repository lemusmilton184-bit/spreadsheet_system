import java.util.Optional;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static Empleado[] listaEmpleado = new Empleado[4];
    static int contador = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        boolean salir = false;


        while (!salir && contador < 5){
            System.out.println("=== Donmina Simple ===");

            System.out.println("1.Empleado ");
            System.out.println("2.Gerente ");
            System.out.println("3.Vendedor ");
            System.out.println("4.Freelancer");
            System.out.println("5.Mostrar informacion");
            System.out.println("0.Salir ");
            System.out.println("Elige: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            double sueldo = 0;
            if (opcion > 0 && opcion <= 5){
                String nombre = "";
               if (opcion != 5){
                   nombre = Utils.pedirNombreValido(scanner);
                   if (opcion == 4)
                       System.out.println("Ponga el valor de su hora: ");
                   else {
                       sueldo = Utils.pedirNumeroValido(scanner);
                   }
               }

                switch (opcion) {
                    case 1:
                        contratar(new Empleado(nombre, sueldo));
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
                    case 5:
                        System.out.println("=== Datos de empleados ===");

                        double totalnomina = 0;

                        for (int i = 0; i < contador; i++) {
                            System.out.println(listaEmpleado[i].toString());
                            System.out.println("-----------------------------------");
                            totalnomina += listaEmpleado[i].obtenerSueldo();
                        }

                        System.out.println("Total a desemblosar por la empresa $" + totalnomina);
                        contador++;
                        break;
                    default:
                        System.out.println("Opcion mal!!");
                        break;
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

            double bono;
            double ventas;
            double horasTrabajadas;
            double totalnomina = 0;
            String nombre = "";

            listaEmpleado[contador] = new Gerente(nombre, sueldo, bono);

            System.out.println("Contratado: " + nuevoEmpleado.getNombre());
        }else{
            System.out.println("Error no hay vacantes");
        }


    }
}