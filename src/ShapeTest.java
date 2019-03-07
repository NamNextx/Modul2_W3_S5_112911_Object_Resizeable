public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);

        Shape[] arrayShape = new Shape[3];
        arrayShape[0] = new Circle();
        arrayShape[1] = new Rectangle();
        arrayShape[2] = new Square();

        Circle circle;

        circle=(Circle)arrayShape[0];

        System.out.println("Pre-Circle");
        System.out.println(circle);
       // System.out.println(arrayShape[0]);

        circle.resize((Math.random()*100)+1);
        System.out.println("After-resize");
        System.out.println(circle);
       // System.out.println(arrayShape[0]);

        for (Shape shape1:arrayShape){
            if (shape1 instanceof Square){
                Square square;

                square=(Square) shape1;

                System.out.println("Pre-Square");
                System.out.println(square);
                // System.out.println(arrayShape[0]);

                square.resize((Math.random()*100)+1);
                System.out.println("After-resize");
                System.out.println(square);
                square.howToColor();
            }
        }

    }
}
