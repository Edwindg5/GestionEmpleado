package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import models.Empleado;
import models.EmpleadoMedioTiempo;
import models.EmpleadoTiempoCompleto;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoTiempoCompleto("Juan", 2000, 500));
        empleados.add(new EmpleadoMedioTiempo("María", 1500, 10));

        int opcion;
        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Registrar Empleado de Tiempo Completo");
            System.out.println("2. Registrar Empleado de Medio Tiempo");
            System.out.println("3. Visualizar Detalles del Empleado");
            System.out.println("4. Eliminar Registro de Empleado");
            System.out.println("5. Generar Reporte de Nómina");
            System.out.println("6. Salir");
            System.out.print("Ingrese la opción deseada: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    scanner.nextLine();
                    System.out.print("Ingrese el nombre del empleado: ");
                    String nombreTiempoCompleto = scanner.nextLine();
                    System.out.print("Ingrese el salario base del empleado: ");
                    double salarioBaseTiempoCompleto = scanner.nextDouble();
                    System.out.print("Ingrese la bonificación del empleado de tiempo completo: ");
                    double bonificacion = scanner.nextDouble();
                    empleados.add(new EmpleadoTiempoCompleto(nombreTiempoCompleto, salarioBaseTiempoCompleto, bonificacion));
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.print("Ingrese el nombre del empleado: ");
                    String nombreMedioTiempo = scanner.nextLine();
                    System.out.print("Ingrese el salario base del empleado: ");
                    double salarioBaseMedioTiempo = scanner.nextDouble();
                    System.out.print("Ingrese el salario por hora del empleado de medio tiempo: ");
                    double salarioPorHora = scanner.nextDouble();
                    EmpleadoMedioTiempo empleadoMedioTiempo = new EmpleadoMedioTiempo(nombreMedioTiempo, salarioBaseMedioTiempo, salarioPorHora);
                    System.out.print("Ingrese las horas trabajadas del empleado de medio tiempo: ");
                    int horasTrabajadas = scanner.nextInt();
                    empleadoMedioTiempo.registrarHorasTrabajadas(horasTrabajadas);
                    empleados.add(empleadoMedioTiempo);
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.print("Ingrese el índice del empleado a visualizar: ");
                    int indice = scanner.nextInt();
                    if (indice >= 0 && indice < empleados.size()) {
                        System.out.println("Detalles del empleado:");
                        System.out.println(empleados.get(indice));
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;
                case 4:
                    scanner.nextLine(); 
                    System.out.print("Ingrese el índice del empleado a eliminar: ");
                    int indiceEliminar = scanner.nextInt();
                    if (indiceEliminar >= 0 && indiceEliminar < empleados.size()) {
                        empleados.remove(indiceEliminar);
                        System.out.println("Empleado eliminado exitosamente.");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;
                case 5:
                    System.out.println("Reporte de Nómina:");
                    for (Empleado empleado : empleados) {
                        System.out.println(empleado);
                        System.out.println("Salario Total: " + empleado.calcularSalario());
                    }
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
            }
        } while (opcion != 6);
    }
}
