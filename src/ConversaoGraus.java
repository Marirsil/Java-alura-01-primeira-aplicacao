public class ConversaoGraus {
    public static void main(String[] args){
        //conversao:
        double celcius = 24;
        double conv = (celcius * 1.8) + 32;

        System.out.println(conv);
        System.out.println(String.format("Temperatura de %.2f Celsius é %.2f Fahrenheit", celcius, conv));
    }
}
