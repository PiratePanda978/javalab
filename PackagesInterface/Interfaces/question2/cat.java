public class cat extends animal implements pet{
    String name;
    public cat(String n){
        super(4);
        name = n;
    }
    public cat(){
        this("");
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public void play(){
        System.out.println("Cat is playing.");
    }
    public void eat(){
        System.out.println("Cat is eating.");
    }
}