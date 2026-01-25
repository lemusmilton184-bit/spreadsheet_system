public class Gerente extends Empleado{

    private double bono;

    public Gerente(String nombre, double sueldoBase, double bono) {
        super(nombre, sueldoBase);
        setBono(bono);
    }


    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    @Override
    public double obtenerSueldo(){
        return super.getSueldoBase() + this.bono;
    }


    @Override
    public String toString() {
        return  "Nombre: " + getNombre() + '\n' +
                "Sueldo: " + getSueldoBase() + '\n' +
                "Bono: " + getBono() + '\n' +
                "Sueldo Total: " + (super.getSueldoBase() + getBono());
    }
}
