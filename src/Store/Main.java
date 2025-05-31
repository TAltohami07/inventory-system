package Store;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        InventoryManager manager = new InventoryManager();
        Scanner scanner = new Scanner(System.in);

        while(true){

            System.out.println("\n📋 Inventory Menu:");
            System.out.println("1️⃣ Add Product");
            System.out.println("2️⃣ View Products");
            System.out.println("3️⃣ Remove Product");
            System.out.println("4️⃣ Update Quantity");
            System.out.println("0️⃣ Exit");
            System.out.print("👉 Choose an option: ");

            int choice= scanner.nextInt();


            switch(choice){

                case 1:
                    System.out.print("🆔 Enter product ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("📝 Enter product name: ");
                    String name = scanner.nextLine();

                    System.out.print("🔢 Enter quantity: ");
                    int qty = scanner.nextInt();

                    System.out.print("💵 Enter price: ");
                    double price = scanner.nextDouble();

                    Product newProduct = new Product(id, name, qty, price);
                    manager.addProduct(newProduct);
                    break;

                case 2:
                    manager.viewProducts();
                    break;

                case 3:
                    System.out.print("❌ Enter product ID to remove: ");
                    int removeId = scanner.nextInt();
                    manager.removeProduct(removeId);
                    break;

                case 4:
                    System.out.print("🔄 Enter product ID to update: ");
                    int updateId = scanner.nextInt();
                    System.out.print("✏️ Enter new quantity: ");
                    int newQty = scanner.nextInt();
                    manager.updateQuantity(updateId, newQty);
                    break;

                case 0:
                    System.out.println("👋 Exiting... Goodbye!");
                    return;

                default:
                    System.out.println("⚠️ Invalid option. Try again.");

            }

        }
    }
}