

public class MyRectangle2D {
    private double x, y;
    private double width, height;

    public MyRectangle2D() {
        x = 0;
        y = 0;
        width = 1;
        height = 1;
    }

    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(double width, double height) {
        double area = width * height;
        return area;
    }

    public double getPerimeter(double width, double height) {
        double perimeter = (width * 2) + (height * 2);
        return perimeter;
    }

    public boolean contains( double x, double y) {
        if ((x >= 0 && x <= width) && (y >= 0 && x <= height)) {
            return true;
        }
        else {
            return false;
        }
    }

    //public boolean contains(MyRectangle2D r){

    //}

    //public boolean notOverlap(MyRectangle2D r){

    //}
}
