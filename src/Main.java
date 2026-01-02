// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Scanner scanner = new Scanner(System.in);

        // --- Примеры заказов ---
        Customer c1 = new Customer("Alice", "alice@mail.com");
        Customer c2 = new Customer("Bob", "bob@mail.com");

        Item item1 = new Item("Laptop", 1200);
        Item item2 = new Item("Phone", 800);
        Item item3 = new Item("Headphones", 150);

        Order o1 = new Order(item1, c1, 1);
        Order o2 = new Order(item2, c2, 2);
        Order o3 = new Order(item3, c1, 3);

        // Добавляем примеры в магазин
        shop.addOrder(o1);
        shop.addOrder(o2);
        shop.addOrder(o3);

        System.out.println("\n--- Примеры заказов уже добавлены ---\n");

        // --- Scanner-меню для интерактивной работы ---
        while (true) {
            System.out.println("\n--- Online Shopping System ---");
            System.out.println("1. Add order");
            System.out.println("2. Show all orders");
            System.out.println("3. Search orders by customer name");
            System.out.println("4. Filter orders by minimum total price");
            System.out.println("5. Sort orders by total price");
            System.out.println("6. Sort orders by quantity");
            System.out.println("7. Exit");
            System.out.print("Choose option: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String cname = scanner.nextLine();
                    System.out.print("Enter customer email: ");
                    String cemail = scanner.nextLine();
                    Customer customer = new Customer(cname, cemail);

                    System.out.print("Enter item name: ");
                    String iname = scanner.nextLine();
                    System.out.print("Enter item price: ");
                    double iprice = scanner.nextDouble();

                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine(); // consume newline

                    Item item = new Item(iname, iprice);
                    Order order = new Order(item, customer, quantity);
                    shop.addOrder(order);
                    break;
                case 2:
                    shop.showAllOrders();
                    break;
                case 3:
                    System.out.print("Enter customer name to search: ");
                    String searchName = scanner.nextLine();
                    shop.searchOrdersByCustomerName(searchName);
                    break;
                case 4:
                    System.out.print("Enter minimum total price: ");
                    double minPrice = scanner.nextDouble();
                    scanner.nextLine(); // consume newline
                    shop.filterOrdersByMinPrice(minPrice);
                    break;
                case 5:
                    shop.sortOrdersByTotalPrice();
                    break;
                case 6:
                    shop.sortOrdersByQuantity();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
