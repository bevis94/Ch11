class Shape{}
class Circle extends Shape{}
class Triangle extends Shape{}
class Coin extends Circle{}


public class Ch11_14 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Triangle t1 = new Triangle();
        Coin n1 = new Coin();
        System.out.println(c1 instanceof Coin);
    }
}