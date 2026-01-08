// Customer.java
public class Customer extends User {

    public Customer(String name, String email) {
        // super(name, email);          // родительский конструктор
    }

    @Override
    public void displayInfo() {
        System.out.println("Customer: " + getName() + ", Email: " + getEmail());
    }

    @Override
    public String toString() {
        return "Customer{name='" + getName() + "', email='" + getEmail() + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Customer)) return false; // если это не Customer — не равны
        return super.equals(obj);  // иначе вызываем equals родителя (User)
}
    }

    @Override
    public int hashCode() {  //быстро найти ячейку
        return super.hashCode();
    }
}

