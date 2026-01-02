// Order.java
public class Order {
    private Item item;
    private Customer customer;
    private int quantity;

    public Order(Item item, Customer customer, int quantity) {
        if (quantity <= 0) throw new IllegalArgumentException("Quantity must be > 0");
        this.item = item;
        this.customer = customer;
        this.quantity = quantity;
    }

    public Item getItem() {
        return item;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return item.getPrice() * quantity;
    }

    public void displayOrder() {
        customer.displayInfo();
        item.displayInfo();
        System.out.println("Quantity: " + quantity);
        System.out.println("Total price: $" + getTotalPrice());
    }

    @Override
    public String toString() {
        return "Order{customer=" + customer.getName() + ", item=" + item.getName() + ", quantity=" + quantity + ", total=$" + getTotalPrice() + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Order)) return false;
        Order other = (Order) obj;
        return customer.equals(other.customer) && item.equals(other.item) && quantity == other.quantity;
    }

    @Override
    public int hashCode() {
        return customer.hashCode() + item.hashCode() + quantity;
    }
}
