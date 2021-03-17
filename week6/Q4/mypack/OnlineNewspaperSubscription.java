package mypack;

public class OnlineNewspaperSubscription extends NewspaperSubscription {
    public void setAddress(String a) {
        if (a.contains("@")) {
            rate = 9.00;
        } else {
            System.out.println("\nERROR : Invalid address\nRate set to zero");
            rate = 0.0;
        }
    }
}
