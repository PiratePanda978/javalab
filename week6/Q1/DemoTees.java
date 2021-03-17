import mypack.TeeShirt;
import mypack.customTees;
public class DemoTees {
    public static void main(String[] args) {
        TeeShirt obj1 = new TeeShirt();
        TeeShirt obj2 = new TeeShirt();
        obj1.setOrdNo(1);
        obj1.setSize("XXL");
        obj1.setColor("Red");
        obj2.setOrdNo(2);
        obj2.setSize("L");
        obj2.setColor("Yellow");
        System.out.println("Object 1 : ");
        System.out.println("Order number = "+obj1.getOrdNo());
        System.out.println("Size = "+obj1.getSize());
        System.out.println("Color = "+obj1.getColor());
        System.out.println("Price = "+obj1.getPrice());
        System.out.println("...........................");
        System.out.println("Object 2 : ");
        System.out.println("Order number = "+obj2.getOrdNo());
        System.out.println("Size = "+obj2.getSize());
        System.out.println("Color = "+obj2.getColor());
        System.out.println("Price = "+obj2.getPrice());
        System.out.println("...........................");
        customTees obj3 = new customTees();
        customTees obj4 = new customTees();
        obj3.setOrdNo(1);
        obj3.setSize("XXL");
        obj3.setColor("Green");
        obj3.setSlogan("YOLO");
        obj4.setOrdNo(2);
        obj4.setSize("L");
        obj4.setColor("Blue");
        obj4.setSlogan("Stay Happy");
        System.out.println("Object 3 : ");
        System.out.println("Order number = "+obj3.getOrdNo());
        System.out.println("Size = "+obj3.getSize());
        System.out.println("Color = "+obj3.getColor());
        System.out.println("Slogan = "+obj3.getSlogan());
        System.out.println("Price = "+obj3.getPrice());
        System.out.println("...........................");
        System.out.println("Object 4 : ");
        System.out.println("Order number = "+obj4.getOrdNo());
        System.out.println("Size = "+obj4.getSize());
        System.out.println("Color = "+obj4.getColor());
        System.out.println("Price = "+obj4.getPrice());
        System.out.println("Slogan = "+obj4.getSlogan());
    }
}
