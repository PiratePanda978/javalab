public class testAnimals{
    public static void main(String[] args) {
        fish d = new fish();
        cat c = new cat("Fluffy");
        animal a = new fish();
        animal e = new spider();
        pet p = new cat();
        System.out.println();
        d.play();
        d.eat();
        d.walk();
        d.setName("Albert");
        System.out.println("Name = "+d.getName());
        System.out.println();
        c.play();
        c.eat();
        c.walk();
        System.out.println("Name = "+c.getName());
        c.setName("Tom");
        System.out.println("Name = "+c.getName());
        System.out.println();
        a.eat();
        a.walk();
        System.out.println();
        e.eat();
        e.walk();
        System.out.println();
        p.play();
        p.setName("Robin");
        System.out.println("Name = "+p.getName());
    }
}