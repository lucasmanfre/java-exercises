import java.util.ArrayList;
import java.util.List;

public class CadastroClientes {
    
    private static List<Cliente> listaClientes = new ArrayList<>();

    public static void adicionarCliente(Cliente cliente){
        listaClientes.add(cliente);
        System.out.println("Cliente " + cliente.getNome() + " adicionado com sucesso!");
    }

    public static void buscarCliente(String email){
        for (Cliente tempCliente : listaClientes){
            if (tempCliente.getEmail().equals(email)){
                tempCliente.mostrarDados();
                return;
            }
        }
        System.out.println("Cliente não encontrado!");
    }

    public static void listarCliente(){
        if(listaClientes.size()==0){
            System.out.println("\nLista vazia!");
            return;
        }
        for (Cliente tempCliente : listaClientes){
            tempCliente.mostrarDados();
        }
    }

    public static void removerCliente(String email){
        for (Cliente tempCliente : listaClientes){
            if (tempCliente.getEmail().equals(email)){
                listaClientes.remove(tempCliente);
                System.out.println( tempCliente.getEmail() + " removido com sucesso!");
                return;
            }
        }
        System.out.println("Cliente não encontrado!");
    }


}
