package models;

public class EmpleadoMedioTiempo extends Empleado {
    private double salarioPorHora;
    private int horasTrabajadas;

    public EmpleadoMedioTiempo(String nombre, double salarioBase, double salarioPorHora) {
        super(nombre, salarioBase);
        this.salarioPorHora = salarioPorHora;
    }

    public void registrarHorasTrabajadas(int horas) {
        this.horasTrabajadas = horas;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (salarioPorHora * horasTrabajadas);
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo: Medio Tiempo, Salario por Hora: " + salarioPorHora +
                ", Horas Trabajadas: " + horasTrabajadas;
    }
}