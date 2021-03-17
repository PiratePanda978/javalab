import mypack.*;

public class DemoSubscriptions {
    public static void main(String[] args) {
        PhysicalNewspaperSubscription obj1 = new PhysicalNewspaperSubscription();
        PhysicalNewspaperSubscription obj2 = new PhysicalNewspaperSubscription();
        obj1.setName("Rahul");
        obj1.setAddress("Pivet Drive");
        System.out.println("..................\nCustomer Details : ");
        System.out.println("Customer Name = "+obj1.getName());
        System.out.println("Customer Address = "+obj1.getAddress());
        System.out.println("Customer Rate = "+obj1.getRate());
        obj2.setName("Roht");
        obj2.setAddress("");
        System.out.println("..................\nCustomer Details : ");
        System.out.println("Customer Name = "+obj2.getName());
        System.out.println("Customer Address = "+obj2.getAddress());
        System.out.println("Customer Rate = "+obj2.getRate());
        OnlineNewspaperSubscription obj3 = new OnlineNewspaperSubscription();
        OnlineNewspaperSubscription obj4 = new OnlineNewspaperSubscription();
        obj3.setName("Hitesh");
        obj3.setAddress("Kapasiya Chowk");
        System.out.println("..................\nCustomer Details : ");
        System.out.println("Customer Name = "+obj3.getName());
        System.out.println("Customer Address = "+obj3.getAddress());
        System.out.println("Customer Rate = "+obj3.getRate());
        obj4.setName("Raghav");
        obj4.setAddress("");
        System.out.println("..................\nCustomer Details : ");
        System.out.println("Customer Name = "+obj4.getName());
        System.out.println("Customer Address = "+obj4.getAddress());
        System.out.println("Customer Rate = "+obj4.getRate());
    }
}