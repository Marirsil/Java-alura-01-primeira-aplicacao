import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        int num = new Random().nextInt(100);
        Scanner leitura = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um numero: ");
            int adv = leitura.nextInt();
            System.out.println(num);

            if (adv == num){
                System.out.println("Voce acertou");
                break;
            }
        }
    }
}
