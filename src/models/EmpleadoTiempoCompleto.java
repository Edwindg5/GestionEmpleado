package models;

public class EmpleadoTiempoCompleto extends Empleado {
    private double bonificacion;

    public EmpleadoTiempoCompleto(String nombre, double salarioBase, double bonificacion) {
        super(nombre, salarioBase);
        this.bonificacion = bonificacion;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonificacion;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo: Tiempo Completo, Bonificación: " + bonificacion;
    }
}