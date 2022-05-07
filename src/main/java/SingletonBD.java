
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

    public static void atualizarUsuario(){
        System.out.println("Usuário atualizado com sucesso!");
        System.out.println("");
    }

    public static void listarUsuarios(){
        System.out.println("Usuário listado com sucesso!");
        System.out.println("");
    }

}
