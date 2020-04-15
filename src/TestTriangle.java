public class TestTriangle {

    public static void main(String[] args) {

        Triangle triangle1 = new Triangle(3,4,5,"red");
        System.out.println(triangle1.toString());
        System.out.println(triangle1.getPerimeter());
        System.out.println(triangle1.getArea());
    }
}
