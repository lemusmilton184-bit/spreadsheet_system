public class Empleado {
    private String nombre;
    private double sueldoBase;

    private static final double SUELDO_MINIMO = 500;
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
        if (nombre == null || nombre.trim().isEmpty()){
            this.nombre = NOMBRE_POR_DEFECTO;
        }else if (!nombre.matches("!@##$%^&*1234567890")){
            System.out.println("Alerta: El nombre no puede contener numeros ni caracteres especilales");
        }else{
            this.nombre = nombre;
        }

    }

    public double getSueldoBase() {
        if (sueldoBase > 0){
            this.sueldoBase = SUELDO_MINIMO;
            System.out.println("Alerta: Sueldo negativo detectado. " +
                                "Sasigna el minimo sueldo $" + SUELDO_MINIMO);
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
                "SueldoBase = " + getSueldoBase();
    }
}