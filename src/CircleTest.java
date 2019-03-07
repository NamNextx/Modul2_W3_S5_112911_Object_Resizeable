public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(2);
        System.out.println(circle);

        circle = new Circle(3, "indigo", false);

        System.out.println("Pre-Circle");
        System.out.println(circle);

        System.out.println("After-Resize");
        circle.resize(30);
        System.out.println(circle);






    }
}
