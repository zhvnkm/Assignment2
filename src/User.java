// User.java (абстрактный класс)
public abstract class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract void displayInfo();

    @Override
    public String toString() {
        return "User{name='" + name + "', email='" + email + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof User)) return false;
        User other = (User) obj;
        return name.equals(other.name) && email.equals(other.email);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + email.hashCode();
    }
}

