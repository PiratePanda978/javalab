package Q4;
public abstract class NewspaperSubscription {
    String name;
    String address;
    double rate;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public String getAddress() {
        return address;
    }

    public double getRate() {
        return rate;
    }

    public abstract void setAddress(String s);
}