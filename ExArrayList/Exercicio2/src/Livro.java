public class Livro {
    
    private String titulo;
    private String autor;
    private boolean disponivel;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public boolean isDisponivel() {
        return disponivel;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void mostrarDados(){
        System.out.println("\nTítulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Disponível: " + isDisponivel());
    }
}
