public class Empleado {
    private String nombre;
    private double sueldoBase;

    private static final double SUELDO_MINIMO = 350;
    private static final String NOMBRE_POR_DEFECTO = "Sin nombre";

    public Empleado(String nombre, double sueldoBase){
        setNombre(nombre);
        setSueldoBase(sueldoBase);
    }

    public Empleado(){
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldoBase() {
        if (sueldoBase < 0){
            System.out.println("Alerta: Sueldo negativo detectado: " + sueldoBase +
                                " Asignar el minimo sueldo $" + SUELDO_MINIMO);
            this.sueldoBase = SUELDO_MINIMO;
        }
        return sueldoBase;
    }

    public double obtenerSueldo(){
        return sueldoBase;
    }


    public double setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
        return sueldoBase;
    }



    @Override
    public String toString() {
        return "Nombre = " + getNombre() + '\n' +
                "SueldoBase = $" + getSueldoBase();
    }
}