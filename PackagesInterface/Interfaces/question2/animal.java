abstract class animal{
    protected int legs;
    protected animal(int l){
        legs = l;
    }
    public void walk(){
        System.out.println("Walking on "+legs+" legs");
    }
    public abstract void eat();
}