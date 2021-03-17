package mypack;

public class OnlineNewspaperSubscription extends NewspaperSubscription {
    public void setAddress(String a) {
        if (a.contains("@")) {
            rate = 9.00;
            address=a;
        } else {
            System.out.println("\nERROR : Invalid address\nRate set to zero\n");
            rate = 0.0;
        }
    }
}
