package Test;

import com.sistema_contable.Implements.VencimientosDaoImpl;
import com.sistema_contable.interfaces.IVencimientosDao;
import com.sistema_contable.model.Vencimientos;
import com.sistema_contable.model.PLE;
//import java.util.List;

public class VencimientosTest {

    static IVencimientosDao dao = new VencimientosDaoImpl();

    public static void main(String[] args) {
        VencimientosTest t = new VencimientosTest();
        t.buscarRUC();
    }

    public void buscarRUC() {
        String ruc = "20542369648";
        int año = 2026;
        String tipo = "AMBOS";
        Vencimientos v = dao.buscarPorRUC(ruc, año, tipo);
        if (v != null) {
            System.out.println("RUC: " + ruc);
            System.out.println("Ult_digit: " + v.getUltimo_digito());
            if (tipo.equalsIgnoreCase("VENCIMIENTO")|| tipo.equalsIgnoreCase("AMBOS")) {
                System.out.println("\n--- VENCIMIENTOS ---");
                System.out.println("Enero: " + v.getEnero());
                System.out.println("Febrero: " + v.getFebrero());
                System.out.println("Marzo: " + v.getMarzo());
                System.out.println("Abril: " + v.getAbril());
                System.out.println("Mayo: " + v.getMayo());
                System.out.println("Junio: " + v.getJunio());
                System.out.println("Julio: " + v.getJulio());
                System.out.println("Agosto: " + v.getAgosto());
                System.out.println("Septiembre: " + v.getSeptiembre());
                System.out.println("Octubre: " + v.getOctubre());
                System.out.println("Noviembre: " + v.getNoviembre());
                System.out.println("Diciembre: " + v.getDiciembre());
            }
            if (tipo.equalsIgnoreCase("PLE")|| tipo.equalsIgnoreCase("AMBOS")) {
                PLE ple = v.getPle();
                if (ple != null) {
                    System.out.println("\n--- PLE ---");
                    System.out.println("Enero: " + ple.getEnero());
                    System.out.println("Febrero: " + ple.getFebrero());
                    System.out.println("Marzo: " + ple.getMarzo());
                    System.out.println("Abril: " + ple.getAbril());
                    System.out.println("Mayo: " + ple.getMayo());
                    System.out.println("Junio: " + ple.getJunio());
                    System.out.println("Julio: " + ple.getJulio());
                    System.out.println("Agosto: " + ple.getAgosto());
                    System.out.println("Septiembre: " + ple.getSeptiembre());
                    System.out.println("Octubre: " + ple.getOctubre());
                    System.out.println("Noviembre: " + ple.getNoviembre());
                    System.out.println("Diciembre: " + ple.getDiciembre());
                }
            }
        } else {
            System.out.println(
                    "No se encontraron vencimientos para el RUC."
            );
        }
    }
}
