package lab06_Exceptions;

public class Program {
    public static void main(String[] args) {
        Account account = new Account(123, 100.00, "Conor");

        try {
            // Withdraw £50.00
            account.withdraw(50.00);
            System.out.println(account.getDetails());

            // Withdraw £60.00 (Exception expected)
            account.withdraw(60.00);
            System.out.println(account.getDetails());

        } catch (IllegalArgumentException ex) {
            System.err.println("Error: " + ex.getMessage());
        } finally {
            account.close();
        }
    }
}
