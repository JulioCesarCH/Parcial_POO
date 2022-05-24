package parcial;

public class Cliente {
    private int dni;
    private String nombres;
    private String apepat;
    private String apemat;
    public Cliente(int dni,String nomb, String app,String apm){
        this.dni=dni;
        this.nombres=nomb;
        this.apepat=app;
        this.apemat=apm;
    }
    public int getdni(){
        return dni;
    }
    public String getNombres(){
        return nombres;
    }
    public String getApepat(){
        return apepat;
    }
    public String getApemat(){
        return apemat;
    }
    public void setdni(int dni){
        this.dni= dni;
    }
    public void setNombres(String nombres){
        this.nombres= nombres;
    }
    public void setApepat(String apepat){
        this.apepat=apepat;
    }
    public void setApemat(String apemat){
        this.apemat=apemat;
    }
}
