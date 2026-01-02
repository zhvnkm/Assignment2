// Shop.java
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Shop {
    private List<Order> orders;

    public Shop() {
        orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
        System.out.println("Order added successfully!");
    }

    public void showAllOrders() {
        if (orders.isEmpty()) {
            System.out.println("No orders yet.");
            return;
        }
        for (Order o : orders) {
            System.out.println(o);
        }
    }

    public void searchOrdersByCustomerName(String name) {
        boolean found = false;
        for (Order o : orders) {
            if (o.getCustomer().getName().equalsIgnoreCase(name)) {
                System.out.println(o);
                found = true;
            }
        }
        if (!found) System.out.println("No orders found for customer: " + name);
    }

    public void filterOrdersByMinPrice(double minPrice) {
        boolean found = false;
        for (Order o : orders) {
            if (o.getTotalPrice() >= minPrice) {
                System.out.println(o);
                found = true;
            }
        }
        if (!found) System.out.println("No orders found with total price >= $" + minPrice);
    }

    public void sortOrdersByTotalPrice() {
        orders.sort(Comparator.comparingDouble(Order::getTotalPrice));
        System.out.println("Orders sorted by total price.");
    }

    public void sortOrdersByQuantity() {
        orders.sort(Comparator.comparingInt(Order::getQuantity));
        System.out.println("Orders sorted by quantity.");
    }
}

