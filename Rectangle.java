public class Rectangle {
    private float length = 1.0f;
    private float width = 1.0f;


    public Rectangle () {
        this.length = 1.0f;
        this.width = 1.0f;
    }
    public Rectangle (float length, float width) {
        this.length = length;
        this.width = length;
    }

    public float getLength() {
        return length;
    }
    public void setLength(float length) {
        this.length = length;
    }
    public float getWidth() {
        return width;
    }
    public void setWidth(float width) {
        this.width = width;
    }
    public double getArea() {
        double area;
        area = this.length * this.width;
        return area;
    }
    public double getPerimeter() {
        double perimeter;
        perimeter = 2 * (this.length + this.width);
        return perimeter;
    }
    public String toString() {
        return("Rectangle[length=" + this.length + ",width=" + this.width + "]");
    }

}
