import java.util.Scanner;

public class Conversor{

    public static void main(String[] args) {
        //declaração de variáveis
        double cel, fah; //cel - temperatura em graus celsius; temperatura em graus fahrenheit
        int op; //Opção do usuário

        //criação e instâlação do objeto de entrada
        Scanner entrada = new Scanner(System.in);

        do{
            //Apresentação do programa
            System.out.println("\n\t\t\t -- Convertor -- \n");

            //Menu
            System.out.println("1. °C para °F");
            System.out.println("2. °F para °C");
            System.out.println("3. Sair");

            //Ler a opção escolhida pelo usuário
            System.out.print("\nOpção: ");
            op = entrada.nextInt();

            if(op == 1){

                //Entradas
                System.out.print("Informe a temperatura em °C: ");
                cel = entrada.nextDouble();

                //Processamento
                fah = cel * 9 / 5 + 32;

                //Saída
                System.out.println("\n" + cel + "°C = " + fah + "°F\n");
            }else if(op == 2){
                //Converter Farenheit para Celsius
                System.out.println("Em construção... Vaza...");
            }else if(op == 3){
                System.out.println("\nTchauzinho :D!");
            }else {
                System.out.println("Opção " + op + "não existe, animal.");
            }
        }while (op >= 3);
    }
}