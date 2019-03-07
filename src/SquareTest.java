public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(1);
        System.out.println(square);

        square = new Square(2, "yellow", true);
        System.out.println("Pre-Square");
        System.out.println(square);
        System.out.println("After-Resize");
        square.resize(100);
        System.out.println(square);
        square.howToColor();




    }
}
