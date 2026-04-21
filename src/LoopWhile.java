import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvalicao = 0;
        double nota = 0;
        int i = 0;

        while(nota != -1) {
            System.out.println("Qual sua avaliação para o filme? Ou -1 para encerrar");
            nota = leitura.nextDouble();

            if (nota != -1) {
                mediaAvalicao += nota;
                i++;
            }

        }


        System.out.println("Media de avaliacoes" + mediaAvalicao/i); //
    }
}
