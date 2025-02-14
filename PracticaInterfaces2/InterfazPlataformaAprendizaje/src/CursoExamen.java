public class CursoExamen implements Curso, Eveluable{

    @Override
    public void iniciar() {
        System.out.println("Iniciando Curso Examen");
    }
    public void completar() {
        System.out.println("Completando Curso Examen");
    }

    @Override
    public void calificar(int puntaje) {{
            System.out.println("Examen calificado con: " + puntaje + "/100");
        }
    }
}
