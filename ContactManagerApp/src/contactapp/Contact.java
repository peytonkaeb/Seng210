package contactapp;

public class Contact {
    private String name;
    private String password;
    private String email;
    private String phone;
    private String birthday;

    public Contact(String name, String password, String email, String phone, String birthday) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.birthday = birthday;
    }

    public String toFileString() {
        return name + ";" + password + ";" + email + ";" + phone + ";" + birthday;
    }

    public static Contact fromFileString(String line) {
        String[] parts = line.split(";");
        return new Contact(parts[0], parts[1], parts[2], parts[3], parts[4]);
    }

    @Override
    public String toString() {
        return name + " | " + email + " | " + phone + " | " + birthday;
    }

    public String getName() { return name; }
}
