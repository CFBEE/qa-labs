package lab12_AccessingFiles;

import com.google.gson.Gson;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;


public class JSONapp {

    public static class Customer {
        String CustomerID, CompanyName, ContactName, ContactTitle, Address, City, Region, PostalCode, Country;

        public String getCustomerID() {
            return CustomerID;
        }
    }

    public static void main(String[] args) throws Exception {

        Gson gson = new Gson();

        String fileName = "C:\\Users\\Conor.Bennett\\OneDrive - ECOTRICITY GROUP LTD\\Documents\\QA Apprenticeship\\Level 4 -Software Engineer\\1.6 Live Session - Introduction to Software Development\\Course Materials v2\\Resources\\customers.json";

        String content = new String(Files.readAllBytes(Paths.get(fileName)));

        Customer[] customers = gson.fromJson(content, Customer[].class);


        // Null/empty guard
        if (customers == null || customers.length == 0) {
            System.out.println("No customers found.");
        } else {
            for (int i = 0; i < customers.length; i++) {
                Customer c = customers[i];
                if (c == null) continue;

                // Prefer getter if available
                String id = (c.getCustomerID() != null) ? c.getCustomerID() : c.CustomerID;
                System.out.printf("Customer %d ID: %s%n", i + 1, id);
            }

        }


    }
}