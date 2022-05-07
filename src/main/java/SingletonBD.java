
import java.util.ArrayList;

public class SingletonBD {

    private static ArrayList<ONU> listaUsuario = new ArrayList<ONU>();

    private SingletonBD() { }

    public static void descobrirONU(){
        System.out.println("Usuário cadastrado com sucesso!");
        System.out.println("");
    }

    public static void deletarUsuario(){
        // teste Lais - adicionar usuario

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
