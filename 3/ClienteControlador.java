package parcial;

public class ClienteControlador {
    private int contador;
    private Cliente[] cliente;

    public ClienteControlador(int cont){
        this.contador=cont;
    }
    public void agregarCliente(Cliente cliente){
        this.cliente[this.contador]=cliente;
        this.contador++;
    }
    public Cliente[] listarCLiente(){
        return this.cliente;
    }

    public Cliente[] buscarCLiente(){
        return this.cliente;
    }

    public Cliente[] editarCLiente(){
        return this.cliente;
    }

    public Cliente[] eliminarCLiente(){
        return this.cliente;
    }
    public int getcontador(){
        return contador;
    }
    
    public void setcontador(int contador){
        this.contador= contador;
    }
}
