// Item.java
public class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        if (price < 0) throw new IllegalArgumentException("Price must be >= 0");
        this.name = name;  //присваиваем им значения, которые передали в конструктор
        this.price = price;
    }

    public String getName() { 
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) throw new IllegalArgumentException("Price must be >= 0");
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Item: " + name + ", Price: $" + price);
    }

    @Override
    public String toString() {  //возвращает удобное текстовое представление объекта
        return "Item{name='" + name + "', price=$" + price + "}";
    }

    @Override
    public boolean equals(Object obj) {  //сравнение по содержимому 
        if (!(obj instanceof Item)) return false;
        Item other = (Item) obj;
        return name.equals(other.name) && price == other.price;
    }

    @Override
    public int hashCode() {  //быстро найти ячейку
        return name.hashCode() + Double.valueOf(price).hashCode();
    }
}

