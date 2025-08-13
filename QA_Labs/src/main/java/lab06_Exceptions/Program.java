package main.java.lab06_Exceptions;

import java.util.ArrayList;
import java.util.Collections;

public class Program {
    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();

        accounts.add(new Account(123, 100.00, "Conor"));
        accounts.add(new Account(456, 250.00, "Dave"));
        accounts.add(new Account(789, 2000.00, "Mike"));

        Collections.sort(accounts);

        for (Account account : accounts) {
            System.out.println(account.getDetails());
        }


        Account account = accounts.get(0);

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
