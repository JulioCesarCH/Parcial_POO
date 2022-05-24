package parcial;

public class Main {
    public static void main(String arg[]){
        Alumno alumno = new Alumno("1","Julio","Cueva");

        System.out.println(alumno.getNombres());
        System.out.println(alumno.getIdAlumno());
        alumno.agregarCurso(new Curso("01","POO"));
        System.out.println(alumno.mostrarCurso().getidCurso());
        System.out.println(alumno.mostrarCurso().getnCurso());

        Docente docente = new Docente(12345678,"Julio","Cueva");

        System.out.println(docente.getNombres());
        System.out.println(docente.getdniDoc());
        docente.agregarCurso(new Curso("01","POO"));
        System.out.println(docente.mostrarCurso().getidCurso());
        System.out.println(docente.mostrarCurso().getnCurso());
    }
}
