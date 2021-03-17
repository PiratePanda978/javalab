package mypack;
public class PhysicalNewspaperSubscription extends NewspaperSubscription {
    public void setAddress(String a) {
        if(a.length()==0){
            System.out.println("\nERROR : Address Field cannot be empty");
            rate=0.0;
        }
        else{
            rate=15;
        }
    }
}
