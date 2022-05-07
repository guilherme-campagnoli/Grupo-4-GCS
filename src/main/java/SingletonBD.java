
import java.util.ArrayList;

public class SingletonBD {

    private static ArrayList<ONU> listaUsuario = new ArrayList<ONU>();

    private SingletonBD() { }

    public static void descobrirONU(){
        System.out.println("Usuário cadastrado com sucesso!");
        System.out.println("");
    }

    public static void deletarONU(){
        System.out.println("ONU deletada com sucesso!");
        System.out.println("");
    }

    public static void atualizarUsuario(){
        System.out.println("Usuário atualizado com sucesso!");
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
