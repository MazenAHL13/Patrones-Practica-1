//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
                Empresa empresa = new Empresa();

                Empleado admin = new Administrativo(2000);
                Empleado tecnico = new Tecnico(1800);
                Empleado gerente = new Gerente(4000, 0.1); // Bono del 10%

                empresa.agregarEmpleado(admin);
                empresa.agregarEmpleado(tecnico);
                empresa.agregarEmpleado(gerente);

                empresa.mostrarEmpleados(admin);
            }
        }
