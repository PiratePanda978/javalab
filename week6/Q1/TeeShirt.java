package mypack;
public class TeeShirt{
    int ordNo;
    String size;
    String color;
    double price;
    public void setOrdNo(int o){
        ordNo = o;
    }
    public void setSize(String s){
        size = s;
    }
    public void setColor(String c){
        color = c;
    }
    public int getOrdNo(){
        return ordNo;
    }
    public String getSize(){
        return size;
    }
    public String getColor(){
        return color;
    }
    public double getPrice(){
        if(size.equals("XXL")||size.equals("XXXL")){
            price = 22.99;
        }
        else{
            price = 19.99;
        }
        return price;
    }
}