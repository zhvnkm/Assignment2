// Customer.java
public class Customer extends User {

    public Customer(String name, String email) {
        super(name, email);
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
        if (!(obj instanceof Customer)) return false;
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

