import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to the Easy Bank\n");

        Client client = new Client("Lucas Lessa", "Checking", 1500);

        System.out.println(client.toString());

        int currentOption = 0;

        while (currentOption != 4) {
            exibirMenu();

            currentOption = input.nextInt();

            switch (currentOption) {
                case 1:
                    checkBalance(client.balance);
                    break;
                case 2:
                    receiveFunds();
                    break;
                case 3:
                    double value = transferFunds(client.balance);
                    client.setBalance(client.balance - value);
                    break;
                case 4:
                    System.out.println("Thank you! See you later.");
                    break;
                default:
                    System.out.println("Invalid option, please try again");
            }
        }
    }

    private static void checkBalance(double balance) {
        System.out.println("Your bank balance is $ " + balance);
    }

    private static void receiveFunds() {
        System.out.println("receiveFunds");
    }

    private static double transferFunds(double balance) {
        System.out.println("How much do you want to transfer?");
        double value = input.nextDouble();

        if (value > balance) {
            System.out.println("You don't have enough balance for this transfer");
            return 0;
        } else {
            System.out.println("transfer completed successfully");
            return value;
        }
    }

    public static void exibirMenu() {
        System.out.println("""
                Operations:
                                
                1- Check Balances
                2- Receive Funds
                3- Transfer Funds
                4- Exit
                                
                Enter the desired option:
               """);
    }
}