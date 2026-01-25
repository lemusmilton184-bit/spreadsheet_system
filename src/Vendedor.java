public class Vendedor extends Empleado{

    private double ventas;

    public Vendedor(String nombre, double sueldoBase, double ventas){
        super(nombre, sueldoBase);
        setVentas(ventas);
    }

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }

    @Override
    public double obtenerSueldo(){
        return super.getSueldoBase() + (this.ventas * 0.15);
    }

    @Override
    public String toString() {
        return  "Nombre: " + getNombre() + '\n' +
                "sueldo: " + getSueldoBase() + '\n' +
                "Bono ventas: " + getVentas() +  '\n' +
                "Sueldo Total: " + obtenerSueldo();
    }
}
