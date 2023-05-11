public class RectangleDemo {
    
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5, 10);

        System.out.println(r1);
        System.out.println(r2);

        
        System.out.println(r1.getLength());
        System.out.println(r2.getLength());


        System.out.println(r1.getWidth());
        System.out.println(r2.getWidth());


        System.out.println(r1.getPerimeter());
        System.out.println(r2.getPerimeter());

    }
}
