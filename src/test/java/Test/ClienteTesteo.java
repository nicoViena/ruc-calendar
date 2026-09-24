package Test;


import com.sistema_contable.Implements.ClienteDaoImpl;
import com.sistema_contable.interfaces.IClienteDao;
import java.util.List;
import com.sistema_contable.model.Cliente;

public class ClienteTesteo {

    static IClienteDao cl = new ClienteDaoImpl();

    public static void main(String[] args) {
        ClienteTesteo t = new ClienteTesteo();
//        t.insertar();
//        t.listar();
//        t.eliminar();
//        t.editar();
//        (t.listarClientePorId();) --> Por el momento no necesario
//        t.listarClientePorRUC();
    }

    public void insertar() {
        Cliente c = new Cliente();
        c.setRUC("12345678901");
        c.setNombre("HMF");
        boolean result = cl.insertar(c);
        if (result) {
            System.out.println("Registro exitoso");
        } else {
            System.out.println("Error en el registro");
        }
    }

    public void listar() {
        List<Cliente> lista = cl.listar();
        if (lista != null && !lista.isEmpty()) {
            for (Cliente cliente : lista) {
                System.out.println("ID CLIENTE: " + cliente.getIdCliente());
                System.out.println("RUC: " + cliente.getRUC());
                System.out.println("NOMBRE: " + cliente.getNombre());
            }
        } else {
            System.out.println("No hay registros");
        }
    }

    public void eliminar() {
        Cliente c = new Cliente();
        c.setIdCliente(3);
        boolean result = cl.eliminar(c);
        if (result) {
            System.out.println("Registro eliminado");
        } else {
            System.out.println("Error al eliminar");
        }
    }

    public void editar() {
        Cliente c = new Cliente();
        c.setRUC("20542255553");
        c.setNombre("Revicont EIRL");
        c.setIdCliente(2);
        boolean result = cl.editar(c);
        if (result) {
            System.out.println("Registro success");
        } else {
            System.out.println("Error de actualizacion");
        }
    }

//    --NO NECESARIO POR EL MOMENTO--
//    public void listarClientePorId() {
//        Cliente cliente = cl.BuscarPorId(1);
//        if (cliente != null) {
//            System.out.println("ID CLIENTE: " + cliente.getIdCliente());
//            System.out.println("RUC: " + cliente.getRUC());
//            System.out.println("NOMBRE: " + cliente.getNombre());
//        } else {
//            System.out.println("No hay registros");
//        }
//    }

    public void listarClientePorRUC() {
        Cliente cliente = cl.BuscarPorRUC("20542369648"); //COLOCAR RUC
        if (cliente != null) {
            System.out.println("ID CLIENTE: " + cliente.getIdCliente());
            System.out.println("RUC: " + cliente.getRUC());
            System.out.println("NOMBRE: " + cliente.getNombre());
        } else {
            System.out.println("No hay registros");
        }
    }
}
