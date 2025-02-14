public class Estudiante {
    private String nombre;

    public void inscribirse(Curso curso) {
        System.out.println("Estudiante inscribido");
        curso.iniciar();

    }
    public void completarCurso(Curso curso){
        System.out.println("Estudiante completando");
        curso.completar();

    }
    public void realizarExamen(CursoExamen examen, int puntaje) {
        System.out.println("Estudiante realizar examen");
        examen.iniciar();
        examen.completar();
        examen.calificar(puntaje);

    }
}
