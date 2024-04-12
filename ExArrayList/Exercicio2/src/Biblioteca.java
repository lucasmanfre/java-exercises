import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private String local;
    private List<Livro> biblioteca;

    public Biblioteca(String local) {

        this.local= local;

        biblioteca = new ArrayList<>();
    }

    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }


    public void adicionarLivro(Livro livro) {
        biblioteca.add(livro);
        System.out.println("\nLivro adicionado!");
    }

    public void buscarLivro(String nomeLivro){
        for (Livro tempLivro : biblioteca){
            if (tempLivro.getTitulo().equals(nomeLivro)){
                tempLivro.mostrarDados();
                return;
            }
        }
        System.out.println("Livro não encontrado!");
    }

    public void listarLivros(){
        if (biblioteca.size() == 0){
            System.out.println("Biblioteca vazia!");
            return;
        }
        
        System.out.println("\nLista de Livros\n");

        for (Livro tempLivro : biblioteca){
            tempLivro.mostrarDados();
        }
    }
}
