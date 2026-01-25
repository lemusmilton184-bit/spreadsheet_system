public class Empleado {
    private String nombre;
    private double sueldoBase;

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