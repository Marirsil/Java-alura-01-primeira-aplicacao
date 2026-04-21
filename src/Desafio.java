import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double saldo = 2500;
        String conta = "Corrente";
        String nome = "Mariana Silva Oliveira";

        int op = 0;
        System.out.println(String.format("""
            ******************************
            Dados do cliente:
            
            Nome: %s
            Tipo conta: %s
            Saldo inicial: %.2f
            ******************************
            """, nome, conta, saldo));

        while(op != 4){
            System.out.println(
                    """
                    
                    1 - Consultar saldos
                    2 - Receber valor
                    3 - Transferir valor
                    4 - Sair
                    
                    Digite a opção desejada:
                    """
            );

            op = leitura.nextInt();
            if(op == 1){
                System.out.println("Seu saldo atual é de " + saldo);
            } else if (op == 2) {
                System.out.println("Quanto deseja depositar? ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Saldo atualizado: "+ saldo);
            } else if (op == 3) {
                System.out.println("Quanto deseja transferir? ");
                double valor = leitura.nextDouble();
                if (valor <= saldo){
                    saldo -= valor;
                    System.out.println("Saldo atualizado: "+ saldo);
                }else {
                    System.out.println("Valor maior que seu saldo");
                }
            } else if (op < 0 || op > 4){
                System.out.println("Digite uma opção valida");
            }
        }
        System.out.println("Programa finalizado");
    }
}
