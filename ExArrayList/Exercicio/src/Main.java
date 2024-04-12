public class Main {

    public static void main(String[] args) {

        int op;
        String nome;

        do {
            System.out.println("\n1 - ADICIONAR EVENTO");
            System.out.println("2 - LISTAR EVENTOS");
            System.out.println("3 - BUSCAR EVENTO");
            System.out.println("0 - SAIR");
            op = Console.lerInt();

            switch (op) {
                case 1:

                    Evento evento = new Evento();

                    System.out.print("Nome: ");
                    evento.setNome(Console.lerString());
                    System.out.print("Data: ");
                    evento.setData(Console.lerString());
                    System.out.print("Local: ");
                    evento.setLocal(Console.lerString());
                    GerenciadorDeEventos.adicionarEvento(evento);
                
                case 2:
                    GerenciadorDeEventos.listarEventos();
                    break;

                case 3:
                    System.out.print("Nome que deseja buscar: ");
                    nome = Console.lerString();
                    GerenciadorDeEventos.buscarEvento(nome);
                    break;

                case 0:
                    return;

                default:
                    System.out.println("OPÇÃO INVÁLIDA! TENTE NOVAMENTE.");
                    break;
            }

        } while (op != 0);

    }

}
