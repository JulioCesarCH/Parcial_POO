package parcial;

public class Main2 {
    public static void main(String arg[]){
        ClienteControlador clientec = new ClienteControlador(1);

        System.out.println(clientec.getcontador());

        clientec.agregarCliente(new Cliente(12345678,"JULIO","CUEVA","HUERTO"));
        clientec.agregarCliente(new Cliente(25632542,"manuel","salas","cajas"));
        //listarcliente
        for(Cliente cliente: clientec.listarcliente()){
            System.out.println(cliente.getdni());
            System.out.println(cliente.getNombres());
            System.out.println(cliente.getApepat());
            System.out.println(cliente.getApemat());
        }
       

   }
}
