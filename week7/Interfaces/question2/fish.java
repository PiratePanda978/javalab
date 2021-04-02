public class fish extends animal implements pet{
    public fish(){
        super(0);
    }
    public void walk(){
        System.out.println("Fish can't walk.They have "+legs+" legs");
    }
    public String getName(){
        return null;
    }
    public void setName(String n){
        
    }
    public void play(){
        System.out.println("Fish is playing.");
    }
    public void eat(){
        System.out.println("Fish is eating.");
    }
}