package parcial;

public class Docente {
    private int dniDoc;
    private String nombres;
    private String apellidos;
    private Curso curso;
    public Docente(int dniDoc,String nomb, String apell){
        this.dniDoc=dniDoc;
        this.nombres=nomb;
        this.apellidos=apell;
    }
    public void agregarCurso(Curso curso){
        this.curso=curso;
    }
    public Curso mostrarCurso(){
        return this.curso;
    }
    public int getdniDoc(){
        return dniDoc;
    }
    public String getNombres(){
        return nombres;
    }
    public String getApellidos(){
        return apellidos;
    }
    public void setdniDoc(int dniDoc){
        this.dniDoc= dniDoc;
    }
    public void setNombres(String nombres){
        this.nombres= nombres;
    }
    public void setApellidos(String apellidos){
        this.apellidos=apellidos;
    }
}
