package parcial;

public class Alumno {
    private String idAlumno;
    private String nombres;
    private String apellidos;
    private Curso curso;
    public Alumno(String idAl,String nomb, String apell){
        this.idAlumno=idAl;
        this.nombres=nomb;
        this.apellidos=apell;
    }
    public void agregarCurso(Curso curso){
        this.curso=curso;
    }
    public Curso mostrarCurso(){
        return this.curso;
    }
    public String getIdAlumno(){
        return idAlumno;
    }
    public String getNombres(){
        return nombres;
    }
    public String getApellidos(){
        return apellidos;
    }
    public void setIdAlumno(String idAl){
        this.idAlumno= idAl;
    }
    public void setNombres(String nombres){
        this.nombres= nombres;
    }
    public void setApellidos(String apellidos){
        this.apellidos=apellidos;
    }
}
