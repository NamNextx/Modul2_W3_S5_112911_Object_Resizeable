public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(1, 1);
        System.out.println(rectangle);

        rectangle = new Rectangle(2, 3, "orange", true);

        System.out.println("Pre-Rectangle");
        System.out.println(rectangle);

        System.out.println("After-Resize");
        rectangle.resize(100);
        System.out.println(rectangle);
    }
}
