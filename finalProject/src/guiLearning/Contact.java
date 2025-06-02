package guiLearning;

public class Contact {
    private String name;
    private String password;
    private String email;
    private String phone;
    private boolean isFavorite;

    public Contact(String name, String password, String email, String phone, boolean isFavorite) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.isFavorite = isFavorite;
    }

    public String getName() { return name; }
    public String getPassword() { return password; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public boolean isFavorite() { return isFavorite; }

    public void setPassword(String password) { this.password = password; }
    public void setEmail(String email) { this.email = email; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setFavorite(boolean favorite) { this.isFavorite = favorite; }

    @Override
    public String toString() {
        return name + "," + password + "," + email + "," + phone + "," + isFavorite;
    }

    public static Contact fromString(String line) {
        String[] parts = line.split(",");
        return new Contact(parts[0], parts[1], parts[2], parts[3], Boolean.parseBoolean(parts[4]));
    }

	/*public static Contact fromString(String nextLine) {
		// TODO Auto-generated method stub
		  String[] parts = line.split(",");
	        return new Contact(parts[0], parts[1], parts[2], parts[3], Boolean.parseBoolean(parts[4]));
	} */
}

