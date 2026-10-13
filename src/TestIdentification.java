
public class TestIdentification {
    public static void main(String[] args) {
        Identification student = new Identification(
                "cyn",
                "cyn@upm.edu.my",
                'm'
        );

        System.out.println("Name: " + student.getName());
        System.out.println("Email: " + student.getEmail());
        System.out.println("Gender: " + student.getGender());
        System.out.println(student);

        student.setEmail("cyn@fsktm.upm.edu.my");

        System.out.println("\nAfter changing email:");
        System.out.println("Name: " + student.getName());
        System.out.println("Email: " + student.getEmail());
        System.out.println("Gender: " + student.getGender());
        System.out.println(student.toString());
    }
}