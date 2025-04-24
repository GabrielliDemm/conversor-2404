import java.util.Scanner;

public class Conversor{

    public static void main(String[] args) {
        //declaração de variáveis
        double cel, fah; //cel - temperatura em graus celsius; temperatura em graus fahrenheit

        //criação e instâlação do objeto de entrada
        Scanner entrada = new Scanner(System.in);

        //apresentação do programa
        System.out.println("\n\t\t\t -- Convertor -- \n");

        //Entradas
        System.out.print("Informe a temperatura em °C: ");
        cel = entrada.nextDouble();

        //Processamento
        fah = cel * 9 / 5 + 32;

        //Saída
        System.out.println("\n" + cel + "°C = " + fah + "°F\n");
    }
}