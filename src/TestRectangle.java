

public class TestRectangle {
    public static void main(String[] args) {
    	Rectangle r1 = new Rectangle(4, 40);
    	Rectangle r2 = new Rectangle(3.5, 35.9);

        displayRectangle(r1);
        displayRectangle(r2);
    }

    public static void displayRectangle(Rectangle r) {
        System.out.println("Width: " + r.getWidth());
        System.out.println("Height: " + r.getHeight());
        System.out.println("Area: " + r.getArea());
        System.out.println("Perimeter: " + r.getPerimeter());
        System.out.println();
    }
}