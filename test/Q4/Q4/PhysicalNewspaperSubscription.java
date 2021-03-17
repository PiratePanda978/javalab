package Q4;
public class PhysicalNewspaperSubscription extends NewspaperSubscription {
    public void setAddress(String a) {
        if(a.length()==0){
            System.out.println("\nERROR : Address Field cannot be empty\n");
            rate=0.0;
        }
        else{
            address=a;
            rate=15;
        }
    }
}
