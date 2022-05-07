import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opcao = 0;
        Scanner sc = new Scanner(System.in);

        while(opcao != 9) {

            System.out.println("**** MENU ****");
            System.out.println("(1) Discover ONU");
            System.out.println("(2) Listar ONU");
            System.out.println("(3) Deletar ONU");
            System.out.println("(4) Atualizar Firmware ONU");
            System.out.println("(5) Status ONU\n");
            System.out.println("(9) Sair\n");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            if(opcao == 1) {
                SingletonBD.descobrirONU();
            }
            else if(opcao == 2) {
                SingletonBD.listarONUs();
            }
            else if(opcao == 3) {
                SingletonBD.deletarUsuario();
            }
            else if(opcao == 4) {
                SingletonBD.atualizarUsuario();
            }
            else if(opcao == 9) {
                System.exit(0);
            }
            else{
                System.out.println("\n\n\n\n\n\n\n\n\n");
            }
        }
    }
}