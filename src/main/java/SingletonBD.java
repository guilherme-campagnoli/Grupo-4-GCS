
import java.util.ArrayList;

public class SingletonBD {

    private static ArrayList<ONU> listaUsuario = new ArrayList<ONU>();

    private SingletonBD() { }

    public static void descobrirONU(){
        System.out.println("ONU encontrada com sucesso!");
        System.out.println("");
    }

    public static void deletarONU(){
        System.out.println("ONU deletada com sucesso!");
        System.out.println("");
    }

    public static void atualizarFirmware(){
        System.out.println("???? com sucesso!");
        System.out.println("");
    }

    public static void status(){
        System.out.println("NAME   | STATUS");
        System.out.println("ONU 1    ACTIVE");
        System.out.println("ONU 2    UNKNOW");
        System.out.println("ONU 3    ACTIVE");
        System.out.println("ONU 4    BLOCKED");
        System.out.println("");
    }

    public static void listarONUs(){
        System.out.println("ONU1");
        System.out.println("ONU2");
        System.out.println("ONU3");
        System.out.println("ONU4");
        System.out.println("");
    }

}
