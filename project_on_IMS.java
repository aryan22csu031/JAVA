package IMS_GPPR;
import java.io.*;
import java.util.*;

class Product {
    private String name;
    private int quantity;

    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

class InventoryManagementSystem {
    private Product[] products;
    private int numProducts;

    public InventoryManagementSystem() {
        products = new Product[100];
        numProducts = 0;
    }

    public void addProduct(Product product) {
        products[numProducts] = product;
        numProducts++;
        System.out.println("Product added successfully!");
    }

    public void removeProduct(String productName) {
        for (int i = 0; i < numProducts; i++) {
            if (products[i].getName().equals(productName)) {
                for (int j = i; j < numProducts - 1; j++) {
                    products[j] = products[j + 1];
                }
                numProducts--;
                System.out.println("Product removed successfully!");
                return;
            }
        }
        System.out.println("Product not found in inventory.");
    }

    public void updateQuantity(String productName, int quantity) {
        for (int i = 0; i < numProducts; i++) {
            if (products[i].getName().equals(productName)) {
                products[i].setQuantity(quantity);
                System.out.println("Quantity updated successfully!");
                return;
            }
        }
        System.out.println("Product not found in inventory.");
    }

    public void viewInventory() {
        System.out.println("\n--- Inventory ---");
        System.out.println("|Product:\t|\tQuantity:|");
        for (int i = 0; i < numProducts; i++) {
            System.out.println("|" + products[i].getName() + "\t\t|\t" + products[i].getQuantity() + "\t |");
        }
    }

    public void saveInventoryToFile(String filename) {
        try {
            PrintWriter writer = new PrintWriter(filename);
            for (int i = 0; i < numProducts; i++) {
                writer.println(products[i].getName() + "," + products[i].getQuantity());
            }
            writer.close();
            System.out.println("Inventory data saved to file: " + filename);
        } catch (FileNotFoundException e) {
            System.out.println("Unable to save inventory data to file: " + filename);
        }
    }

    public void loadInventoryFromFile(String filename) {
        try {
            Scanner fileScanner = new Scanner(new File(filename));
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");
                String productNameFromFile = parts[0];
                int quantityFromFile = Integer.parseInt(parts[1]);
                addProduct(new Product(productNameFromFile, quantityFromFile));
            }
            fileScanner.close();
            System.out.println("Inventory data loaded from file: " + filename);
        } catch (FileNotFoundException e) {
            System.out.println("Unable to load inventory data from file: " + filename);
        }
    }
}

public class IMS {
    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();
        String username = "Raghav";
        String password = "GPPR";
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        int loginAttempts = 0;
        boolean accessGranted = false;
        while (loginAttempts < 3 && !accessGranted) {
            System.out.println("Enter Username: ");
            String enteredUsername = input1.next();
            System.out.println("Enter Password: ");
            String enteredPassword = input2.next();

            if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
                accessGranted = true;
                System.out.println("\n\t*..Access Granted! Welcome!..*");
            } else {
                loginAttempts++;
                int remainingAttempts = 3 - loginAttempts;
                System.out.println("\n\t*..Invalid Username or Password!..* ");
                System.out.println("\n\t" + remainingAttempts + " <-- attempts remaining. ");
            }
        }

        if (!accessGranted) {
            System.out.println("Maximum login attempts exceeded. Exiting...Please try again after sometime");
            return;
        }

        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("\n\t--- Inventory Management System ---");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Update Quantity");
            System.out.println("4. View Inventory");
            System.out.println("5. Save Inventory to File");
            System.out.println("6. Load Inventory from File");
            System.out.println("7. Exit");
            System.out.print("Enter command: ");
            String command = sc.nextLine();
            int quantity;

            switch (command) {
                case "1":
                    while (true) {
                        System.out.print("\nEnter product name (or type 'exit' to go back to main menu): ");
                        String name = sc.nextLine();
                        if (name.equalsIgnoreCase("exit")) {
                            break;
                        }
                        System.out.print("Enter quantity: ");
                        quantity = Integer.parseInt(sc.nextLine());
                        ims.addProduct(new Product(name, quantity));
                    }
                    break;
                case "2":
                    System.out.print("\nEnter product name: ");
                    String productName = sc.nextLine();
                    ims.removeProduct(productName);
                    break;

                case "3":
                    System.out.print("\nEnter product name: ");
                    productName = sc.nextLine();
                    System.out.print("Enter new quantity: ");
                    quantity = Integer.parseInt(sc.nextLine());
                    ims.updateQuantity(productName, quantity);
                    break;

                case "4":
                    ims.viewInventory();
                    break;

                case "5":
                    System.out.print("\nEnter filename to save inventory data: ");
                    String filename = sc.nextLine();
                    ims.saveInventoryToFile(filename);
                    break;

                case "6":
                    System.out.print("\nEnter filename to load inventory data: ");
                    String loadFilename = sc.nextLine();
                    ims.loadInventoryFromFile(loadFilename);
                    break;

                case "7":
                    exit = true;
                    System.out.println("\t*..Thank You..*");
                    break;

                default:
                    System.out.println("\nInvalid choice. Please try again.");
                    break;
            }
        }
        sc.close();
    }
}
