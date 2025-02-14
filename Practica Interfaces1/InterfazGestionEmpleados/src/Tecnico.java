public class Tecnico implements Empleado {
    private double salario;

    public Tecnico(double salario){
        this.salario = salario;
    }

    @Override
    public double calcularSalario() {

        return 0;
    }

    @Override
    public Object obtenerCargo() {

        return null;
    }
}