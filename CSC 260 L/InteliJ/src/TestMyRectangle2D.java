public class TestMyRectangle2D {
    public static void main(String[] args) {

        MyRectangle2D r1 = new MyRectangle2D(1, 3, 5.5, 4.9);

        System.out.println("The object r1 with 5.5 width and 4.9 height, has area  " + r1.getArea(5.5, 4.9) + ", has perimeter " + r1.getPerimeter(5.5, 4.9));
        System.out.println("The object rl contains the point (3.0, 3.0)? " + r1.contains(3, 3));
        //System.out.println("The object rl contains the object r? " + r1.contains( new MyRectangle2D(2, 2, 1.5, 1.2)));
        //System.out.println("The object rl does not overlap the object r? " + r1.notOverlap( new MyRectangle2D(5, 5, 2.3, 5.4)));


    }
}
