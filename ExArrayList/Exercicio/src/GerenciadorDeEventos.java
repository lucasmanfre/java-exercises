import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeEventos {

    private static List<Evento> listaEventos = new ArrayList<>();

    public static void adicionarEvento(Evento evento) {

        listaEventos.add(evento);
        System.out.println("Evento " + evento.getNome() + " adicionado!");

    }

    public static void listarEventos() {

        if (listaEventos.size() == 0) {
            System.out.println("Não há eventos na lista");
            return;
        }

        System.out.println("\nEventos\n");

        for (Evento tempEvento : listaEventos) {

            tempEvento.mostrarDados();

        }
    }

    public static void buscarEvento(String nome) {

        for (Evento tempEvento : listaEventos) {
            if (tempEvento.getNome().equals(nome)) {
                tempEvento.mostrarDados();
                return;
            }
        }
        System.out.println("Evento " + nome + " não encontrado");

    }
}
