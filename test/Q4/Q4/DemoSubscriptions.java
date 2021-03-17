package Q4;
// import mypack.PhysicalNewspaperSubscription;
// import mypack.OnlineNewspaperSubscription;
public class DemoSubscriptions {
    public static void main(String[] args) {
        PhysicalNewspaperSubscription obj1 = new PhysicalNewspaperSubscription();
        PhysicalNewspaperSubscription obj2 = new PhysicalNewspaperSubscription();
        obj1.setName("Rahul");
        System.out.println("..................\nCustomer Details : ");
        System.out.println("Customer Name = "+obj1.getName());
        obj1.setAddress("Pivet Drive");
        System.out.println("Customer Address = "+obj1.getAddress());
        System.out.println("Customer Rate = "+obj1.getRate());
        obj2.setName("Rohit");
        System.out.println("..................\nCustomer Details : ");
        System.out.println("Customer Name = "+obj2.getName());
        obj2.setAddress("");
        System.out.println("Customer Address = "+obj2.getAddress());
        System.out.println("Customer Rate = "+obj2.getRate());
        OnlineNewspaperSubscription obj3 = new OnlineNewspaperSubscription();
        OnlineNewspaperSubscription obj4 = new OnlineNewspaperSubscription();
        obj3.setName("Hitesh");
        System.out.println("..................\nCustomer Details : ");
        System.out.println("Customer Name = "+obj3.getName());
        obj3.setAddress("hitesh6969@hotmail.com");
        System.out.println("Customer Address = "+obj3.getAddress());
        System.out.println("Customer Rate = "+obj3.getRate());
        obj4.setName("Raghav");
        System.out.println("..................\nCustomer Details : ");
        System.out.println("Customer Name = "+obj4.getName());
        obj4.setAddress("");
        System.out.println("Customer Address = "+obj4.getAddress());
        System.out.println("Customer Rate = "+obj4.getRate());
    }
}