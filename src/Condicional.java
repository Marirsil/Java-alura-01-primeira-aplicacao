public class Condicional {
    public static void main(String[] args) {
        int anoLancamento = 2026;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoLancamento >= 2025){
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir");
        }

        if (incluidoNoPlano || tipoPlano.equals("plus") ){
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar locação");
        }
    }
}
