package parcial;

public class Curso {
    private String idCurso;
    private String nCurso;

    public Curso(String idCu,String NCu){
        this.idCurso=idCu;
        this.nCurso=NCu;
    }
    public String getidCurso(){
        return idCurso;
    }
    public String getnCurso(){
        return nCurso;
    }
    public void setidCurso(String idCur){
        this.idCurso= idCur;
    }
    public void setnCurso(String nCur){
        this.nCurso=nCur;
    }
}
