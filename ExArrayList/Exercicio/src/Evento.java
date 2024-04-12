public class Evento {

    private String nome;
    private String data;
    private String local;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }

    public void mostrarDados(){
        System.out.println("Nome do evento: " + getNome());
        System.out.println("Data: " + getData());
        System.out.println("Local: " + getLocal());
    }

}
