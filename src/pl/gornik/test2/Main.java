package pl.gornik.test2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        double wynikKola = circle.calculateArea();
        System.out.println("Pole koła wynosi: " + wynikKola);
        Rectangle rectangle = new Rectangle(2, 5);
        double wynikRectangle = rectangle.calculateArea();
        System.out.println("Pole prostokąta wynosi: " + wynikRectangle);

    }
}
