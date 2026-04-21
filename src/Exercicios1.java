public class Exercicios1 {
    public static void main(String[] args) {
        double nota1 = 8.9;
        double nota2 = 7.7;
        double media = (nota1 + nota2) / 2;

        String salda = "Ola, Mary";
        char exclamacao = '!';

        System.out.println(salda + exclamacao + " sua média é de " + media);
    }
}

class Multi {
    public static void main(String[] args) {
        double precoProduto = 10.50;
        int quantidade = 2;
        System.out.println(precoProduto * quantidade);

        double valorEmDolares = 6.74;
        double conversao = 4.94;
        System.out.println(valorEmDolares * conversao);
    }
}

class Desconto {
    public static void main(String[] args) {
        double precoOriginal = 18.63;
        double percentualDesconto = 10;
        double desconto = precoOriginal - ((precoOriginal / 100) * percentualDesconto);

        System.out.println("O preço era " + precoOriginal +
                ", com " + percentualDesconto + "% fica por: " + desconto);
    }
}