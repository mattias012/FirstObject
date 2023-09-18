public class Rectangle {

    int x;
    int y;
    int height;
    int width;


    //Default rectangle ()
    public Rectangle() {
        this.x = 0;
        this.y = 0;
        this.width = 0;
        this.height = 0;
    }

    //Create a rectangle based on what is selected (x and y, or height width).
    public Rectangle(int a, int b, boolean isPosition) {
        if (isPosition) {
            this.x = a;
            this.y = b;
            this.width = 0;
            this.height = 0;
        } else {
            this.width = a;
            this.height = b;
            this.x = 0;
            this.y = 0;
        }
    }

    public Rectangle(int x, int y, int height, int width) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    public double calculateArea() {

        double area = 0;
        area = this.height * this.width;

        return area;
    }

    public double calculatePerimeter(int x, int y, int height, int width) {

        double circ = x + y + height + width;

        return circ;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setHeightandWidth(int height, int width) {
        this.height = height;
        this.width = width;

    }

    public int getX() {

        return x;
    }

    public int getY() {

        return y;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
