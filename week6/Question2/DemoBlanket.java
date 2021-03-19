import java.util.Scanner;

public class DemoBlanket {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        ElectricBlanket obj1 = new ElectricBlanket();

        System.out.print("Enter the size of the blanket: ");
        String size = input.nextLine();
        obj1.setSize(size);

        System.out.print("Enter the color of the blanket: ");
        String color = input.next();
        obj1.setColor(color);

        System.out.print("Enter the material of the blanket: ");
        String material = input.next();
        obj1.setMaterial(material);

        System.out.print("Enter the automatic switch off of the blanket: ");
        boolean automaticSwitchOff = input.nextBoolean();
        obj1.setAutomaticSwitchOff(automaticSwitchOff);

        System.out.print("Enter the heat settings of the blanket: ");
        int heatSetting = input.nextInt();
        obj1.setHeatSetting(heatSetting);

        System.out.println(obj1);

        Blanket obj2 = new Blanket();

        System.out.print("Enter the size of the blanket: ");
        size = input.nextLine();
        size = input.nextLine();
        obj2.setSize(size);

        System.out.print("Enter the color of the blanket: ");
        color = input.next();
        obj2.setColor(color);

        System.out.print("Enter the material of the blanket: ");
        material = input.next();
        obj2.setMaterial(material);

        System.out.println(obj2);
    }

}