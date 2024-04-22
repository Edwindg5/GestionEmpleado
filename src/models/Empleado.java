package models;

public class Empleado {
    private String nombre;
    double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Salario Base: " + salarioBase;
    }
}
