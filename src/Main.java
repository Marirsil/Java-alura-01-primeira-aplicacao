//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Homem Aranha");

        int ano = 2022;
        System.out.println("Ano de lançamento: " + ano);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) /3;
        System.out.println(media);
        String sipnose;
        sipnose = """
                Filme: homem aranha
                Filme de super-heroi
                Muito bom
                Ano de lançamento = 2022
                """;
        System.out.println(sipnose);

        //conversao (casting) -> ver tabela
        double classificacao = (int)(media/2);
        System.out.println(classificacao);


    }
}