

public class Identification {
    private String name;
    private String email;
    private char gender;

    public Identification(String name1, String email1, char gender1) {
        this.name = name1;
        this.email = email1;
        this.gender = gender1;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        return name + "(" + gender + ") at " + email;
    }
}