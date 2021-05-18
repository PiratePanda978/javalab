class Plumber{
    double balance,interest,rate;
    String[] months = {"Jan","Feb","March","April","May","June","July","Aug","Sept","Oct","Nov","Dec"};
    Plumber(){
        balance = 100000;
    }
    public void endOfMonth(){
        if(balance<110000)
        rate = 1;
        else if(balance<125000)
        rate = 1.5;
        else
        rate = 2;
        interest = (rate*balance)/100;
        balance = balance + interest;
        balance = balance + 1000;
        balance = Math.round(balance*100.0)/100.0;
        interest = Math.round(interest*100.0)/100.0;
    }
    public void display(int i){
        System.out.println(months[i-1]+"\t"+balance+"\t"+rate+"\t"+interest+"\n");
    }
}
public class Q2{
    public static void main(String[] args) {
        Plumber obj = new Plumber();
        System.out.println("Month\tBalance\t\tRate\tInterest\n...................................................................");
        for(int i=1;i<=12;i++){
            obj.endOfMonth();
            obj.display(i);
        }
    }
}