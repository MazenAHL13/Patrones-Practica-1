import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Empleado> empleados;

    public Empresa() {
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void mostrarEmpleados(Empleado e) {
        System.out.println(new StringBuilder().append(e.obtenerCargo()).append(" - Salario: $").append(e.calcularSalario()).toString());
    }
}
