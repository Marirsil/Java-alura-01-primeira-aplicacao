import java.util.Scanner;

public class Exercicios2 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = leitura.nextInt();

        if (num >= 0) {
            System.out.println("Numero positivo");
        } else {
            System.out.println("Numero negativo");
        }
    }
}

class Inteiros {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite dois numeros: ");
        int num1 = leitura.nextInt();
        int num2 = leitura.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " é maior");
        } else if (num2 > num1) {
            System.out.println(num2 + " é maior");
        } else {
            System.out.println("São iguais");
        }
    }
}

class opcoes{
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println(
                """
                Digite a opção desejada:
                1 - Calcular a área do quadrado
                2 - Calcular área do circulo
                """);
        int op = leitura.nextInt();

        if(op == 1){
            System.out.println("Digite dois numeros: ");
            double num1 = leitura.nextDouble();
            double num2 = leitura.nextDouble();
            double resul = num1*num2;
            System.out.println(resul);
        } else if (op == 2){
            System.out.println("Digite o valor do raio: ");
            double raio = leitura.nextDouble();
            double resul = Math.PI * Math.pow(raio, 2);
            System.out.println(resul);
        } else {
            System.out.println("Digite um numero válido");
        }
    }
}

class tabuada{
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um numero");
        int num = leitura.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " +num*i);
        }
    }
}

class imparpar{
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int num = leitura.nextInt();

        if(num>0 && num/2==0){
            System.out.println("É par");
        } else if (num>0 && num/2 !=1) {
            System.out.println("É ímpar");
        } else{
            System.out.println("Digite um numero valido");
        }
    }
}

class fatorial{
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int num = leitura.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + num + " é " + fatorial);
    }
}