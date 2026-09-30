package Test;

import com.sistema_contable.Implements.UsuarioDaoImpl;
import com.sistema_contable.interfaces.IUsuarioDao;
import com.sistema_contable.model.Rol;
import com.sistema_contable.model.Usuario;
import java.util.List;

public class UsuarioTest {

    static IUsuarioDao dao = new UsuarioDaoImpl();

    public static void main(String[] args) {
        UsuarioTest t = new UsuarioTest();
//        t.insertar();
//        t.listar();
//        t.editar();
//        t.validarUsuario();
//        t.eliminar();
    }

    public void insertar() {
        Usuario u = new Usuario();
        u.setUsuario("????");
        u.setContraseña("????");
        boolean resultado = dao.insertar(u);
        if (resultado) {
            System.out.println("Usuario insertado correctamente");
        } else {
            System.out.println("Error al insertar");
        }
    }

    public void listar() {
        List<Usuario> lista = dao.listar();
        for (Usuario u : lista) {
            System.out.println("ID: " + u.getIdUsuario());
            System.out.println("Usuario: " + u.getUsuario());
            System.out.println("Rol: "+u.getRol());
        }
    }

    public void validarUsuario() {
        String usuario = "????";
        String password = "????";
        Usuario u = dao.validarUsuario(usuario, password);
        if (u != null) {
            System.out.println("LOGIN CORRECTO");
            System.out.println("Usuario: " + u.getUsuario());
            System.out.println("Rol: " + u.getRol());
        } else {
            System.out.println("Usuario o contraseña incorrectos");
        }
    }

    public void editar() {
        Usuario u = new Usuario();
        u.setIdUsuario(0);
        u.setUsuario("????");
        u.setContraseña("????");
        u.setRol(Rol.USUARIO);
        boolean resultado = dao.editar(u);
        if (resultado) {
            System.out.println("Usuario editado correctamente");
        } else {
            System.out.println("Error al editar usuario");
        }
    }

    public void eliminar() {
        int idUsuario = 0;
        boolean resultado = dao.eliminar(idUsuario);
        if (resultado) {
            System.out.println("Usuario eliminado correctamente");
        } else {
            System.out.println("Error al eliminar");
        }
    }
}
