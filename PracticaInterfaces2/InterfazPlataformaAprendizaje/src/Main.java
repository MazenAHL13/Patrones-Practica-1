//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("OpenEnglish.com");
        Estudiante estudiante = new Estudiante();
        CursoExamen cursoExamen = new CursoExamen();
        CursoPDF cursoPDF = new CursoPDF();
        CursoVideo cursoVideo = new CursoVideo();

        estudiante.inscribirse(cursoVideo);
        estudiante.completarCurso(cursoVideo);

        estudiante.inscribirse(cursoPDF);
        estudiante.completarCurso(cursoPDF);

        estudiante.inscribirse(cursoExamen);
        estudiante.realizarExamen(cursoExamen, 85);
    }
    }