public class Principal {
    
    public static void main(String[] args) {

        int op;

        do {
            System.out.println("\nFOLHA DE PAGAMENTO\n");
            System.out.println("1 - CALCULAR FOLHA DE PAGAMENTO");
            System.out.println("0 - SAIR");
            System.out.print("INFORME A OPCAO: ");
            op = Console.lerInt();
            switch (op) {
                case 1:
                    FolhaPagamento f1 = new FolhaPagamento();
                    System.out.print("INSIRA O NOME: ");
                    f1.setNome(Console.lerString());
                    System.out.print("INSIRA AS HORAS TRABALHADAS: ");
                    f1.setHoras(Console.lerFloat());
                    System.out.print("INSIRA O VALOR DA HORA: ");
                    f1.setValorHora(Console.lerFloat());
                    System.out.println("\nFOLHA DE PAGAMENTO DE " + f1.getNome());
                    System.out.println("SALARIO BRUTO: "+ f1.salarioBruto());
                    System.out.println("IR: " + f1.ir());
                    System.out.println("INSS: " + f1.inss());
                    System.out.println("FGTS: " + f1.fgts());
                    System.out.println("SALARIO LIQUIDO: " + f1.salarioLiquido());
                    break;
                
                case 0:
                    break;

                default:
                    System.out.println("OPCAO INVALIDA, TENTE NOVAMENTE!");
                    break;
            }
        } while (op != 0);

    }

}
