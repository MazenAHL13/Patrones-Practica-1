public class Administrativo implements Empleado{
    private double salario;

    public Administrativo(double salario){
        this.salario = salario;
    }
    @Override
    public double calcularSalario() {


        return salario;
    }

    @Override
    public Object obtenerCargo() {

        return "Administrativo";
    }
}
