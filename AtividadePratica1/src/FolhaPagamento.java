public class FolhaPagamento {
    
    private String nome;
    private float horas;
    private float valorHora;
    private float salarioBruto;
    private double ir;
    private double inss;
    private double fgts;
    private double salarioLiquido;

    public float getHoras() {
        return horas;
    }
    public void setHoras(float horas) {
        this.horas = horas;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValorHora() {
        return valorHora;
    }
    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }


    public float salarioBruto(){
        salarioBruto = horas * valorHora;
        return salarioBruto;
    }

    public double ir(){
        if (salarioBruto <= 1372.81){
            ir = 0;
        }
        else if (salarioBruto >= 1372.82 && salarioBruto <=  2743.25){
            ir = (salarioBruto * 0.15) - 205.92;
        }
        else if (salarioBruto > 2743.25){
            ir = (salarioBruto * 0.275) - 548.82;
        }
        return ir;
    }

    public double inss(){
        if (salarioBruto <= 868.29){
            inss = salarioBruto * 0.08;
        }
        else if (salarioBruto >= 868.30 && salarioBruto <= 1447.14){
            inss = salarioBruto * 0.09;
        }
        else if (salarioBruto >= 1447.15 && salarioBruto <= 2894.27){
            inss = salarioBruto * 0.11;
        }
        else if (salarioBruto >= 2894.28){
            inss = 318.37;
        }
        return inss;
    }

    public double fgts(){
        fgts = salarioBruto * 0.08;
        return fgts;
    }

    public double salarioLiquido(){
        salarioLiquido = salarioBruto - (ir + inss);
        return salarioLiquido;
    }

}
