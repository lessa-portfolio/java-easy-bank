import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
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
                    transferFunds();
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

    private static void transferFunds() {
        System.out.println("transferFunds");
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