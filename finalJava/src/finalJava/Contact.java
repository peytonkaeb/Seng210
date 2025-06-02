package finalJava;


public class Contact {
    private String name;
    private String password;
    private String email;
    private String phone;
    private boolean favorite;

    public Contact(String name, String password, String email, String phone, boolean favorite) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.favorite = favorite;
    }

    public static Contact fromString(String line) {
        String[] parts = line.split(",", -1); // -1 to preserve empty strings
        if (parts.length != 5) {
            System.err.println("Skipping malformed line: " + line);
            return null;
        }
        String name = parts[0].trim();
        String password = parts[1].trim();
        String email = parts[2].trim();
        String phone = parts[3].trim();
        boolean favorite = Boolean.parseBoolean(parts[4].trim());

        return new Contact(name, password, email, phone, favorite);
    }

    @Override
    public String toString() {
        return name + "," + password + "," + email + "," + phone + "," + favorite;
    }

    // Getters
    public String getName() { return name; }
    public String getPassword() { return password; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public boolean isFavorite() { return favorite; }
}