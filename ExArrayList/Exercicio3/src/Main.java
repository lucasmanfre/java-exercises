public class Main {
    
    public static void main(String[] args) {

        int op;
        String email;

        do {
            System.out.println("1 - Adicionar cliente");
            System.out.println("2 - Buscar cliente");
            System.out.println("3 - Listar clientes");
            System.out.println("4 - Apagar cliente");
            System.out.println("0 - Sair");
            op = Console.lerInt();

            switch (op) {
                case 1:

                    Cliente cliente = new Cliente();

                    System.out.print("Nome: ");
                    cliente.setNome(Console.lerString());
                    System.out.print("Email: ");
                    cliente.setEmail(Console.lerString());
                    System.out.print("Endereco: ");
                    cliente.setEndereco(Console.lerString());
                    CadastroClientes.adicionarCliente(cliente);
                    break;

                case 2:
                    System.out.print("Email do cliente que deseja buscar: ");
                    email = Console.lerString();
                    CadastroClientes.buscarCliente(email);
                    break;

                case 3:
                    CadastroClientes.listarCliente();
                    break;

                case 4:
                    System.out.print("Email do cliente que deseja apagar: ");
                    email = Console.lerString();
                    CadastroClientes.removerCliente(email);
                    break;
                    
                case 0:
                    return;

                default:
                    System.out.println("Resposta inválida! Tente novamente.");
                    break;
            }
        } while (op != 0);
    }

}
