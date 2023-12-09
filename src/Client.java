public class Client {

    String name = "Clark Kent";
    String accountType = "Checking";
    double balance = 1599.99;

    public Client(String name, String accountType, double balance) {
        this.name = name;
        this.accountType = accountType;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return """
                ***********************
                Client Initial Data:
                                
                Name: %s
                Account Type: %s
                Initial Balance: R$ %.2f
                ***********************
                """.formatted(name, accountType, balance);
    }
}
