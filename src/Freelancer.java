public class Freelancer extends Empleado {
    private double horasTrabajadas;
    private double valorHora;

    public Freelancer(String nombre, double horasTrabajadas, double valorHora){
        super(nombre, 0.0);
        setHorasTrabajadas(horasTrabajadas);
        setValorHora(valorHora);
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        return  "Nombre: " + getNombre() + '\n' +
                "Valor de horas: $" + getValorHora() +  '\n' +
                "horas trabajadas: " + getHorasTrabajadas() + '\n' +
                "Sueldo total: $" + getSueldo();
    }


    public double getSueldo(){
        return (double)Math.round((getValorHora() * getHorasTrabajadas() ) * 100d) / 100d;
    }
}