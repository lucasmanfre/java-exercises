import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int op;
        List<Biblioteca> listaBibliotecas = new ArrayList<>();

        do {
            System.out.println("1 - Criar Biblioteca");
            System.out.println("2 - Adicionar Livro");
            System.out.println("3 - Listar Livros");
            System.out.println("4 - Buscar Livros");
            System.out.println("0 - Sair");
            op = Console.lerInt();
            switch (op) {
                case 1:
                    
                    break;
                
                case 2:
                    
                    break;

                case 3:
                    
                    break;
                
                case 4:
                    
                    break;

                default:
                    System.out.println("Opção Inválida! Tente novamente.");
                    break;
            }
        } while (op != 0);

    }

}
