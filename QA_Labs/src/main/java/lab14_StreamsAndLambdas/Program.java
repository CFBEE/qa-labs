package lab14_StreamsAndLambdas;


import java.io.IOException;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        String jsonFile = "C:\\labs\\qa-labs\\QA_Labs\\customers.json";

        try {
            // Read the JSON file
            List<Customer> customers = JSONReader.readCustomers(jsonFile);

            // Filter customers by city
            String targetCity = "London";
            List<Customer> filteredCustomers =
                    CustomerFilter.filterByCity(customers, targetCity);

            // Display the filtered customers
            System.out.println("Customers in " + targetCity + ":");
            filteredCustomers.forEach(customer ->
                    System.out.println(customer.getName() + " (ID: " + customer.getId() + ")")
            );
        } catch (IOException e) {
            System.err.println("Error reading the JSON file: " + e.getMessage());
        }
    }
}
