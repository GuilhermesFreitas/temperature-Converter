import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean condition = true;

        while (condition) {
            System.out.println("\n--- Conversor ---");
            System.out.println("(1) Celsius para Fahrenheit");
            System.out.println("(2) Fahrenheit para Celsius");
            System.out.println("(3) Sair");
            System.out.print("Escolha uma opção: ");

            int option = scanner.nextInt();

            if (option == 3) {
                condition = false;
                System.out.println("Saindo do programa...");
                break;
            }

            System.out.print("Adicione a temperatura desejada: ");
            double value = scanner.nextDouble();

            switch (option) {
                case 1:
                    double converterFahrenheit = (value * 9 / 5) + 32;
                    System.out.println("A temperatura em Fahrenheit é: " + converterFahrenheit);
                    break;

                case 2:
                    double converterCelsius = (value - 32) * 5 / 9;
                    System.out.println("A temperatura em Celsius é: " + converterCelsius);
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        scanner.close();
    }
}
