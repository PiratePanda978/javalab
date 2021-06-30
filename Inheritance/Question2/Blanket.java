public class Blanket {
    String size, color, material;
    double price;

    public Blanket() {
        size = "Twin";
        color = "white";
        material = "cotton";
        price = 30.00;
    }

    public void setSize(String size) {
        this.size = size;
        if (size.toUpperCase().equals("DOUBLE BLANKET")) {
            price += 10;
        } else if (size.toUpperCase().equals("QUEEN BLANKET")) {
            price += 25;
        } else if (size.toUpperCase().equals("KING BLANKET")) {
            price += 40;
        } else {
            System.out.println("Error in setSize() size invalid");
            this.size = "Twin";
            color = "white";
            material = "cotton";
            price = 30.00;
        }
    }

    public void setColor(String color) {
        if (color.toUpperCase().equals("BLACK")) {
            System.out.println("Black colered is not available");
            size = "Twin";
            color = "white";
            material = "cotton";
            price = 30.00;
        } else {
            this.color = color;
        }
    }

    public void setMaterial(String material) {
        this.material = material;
        if (material.toUpperCase().equals("WOOL")) {
            price += 20;
        } else if (material.toUpperCase().equals("CASHMERE")) {
            price += 45;
        } else {
            System.out.println("Error in setMaterial() material invalid");
            size = "Twin";
            color = "white";
            material = "cotton";
            price = 30.00;
        }
    }

    public String toString(){
        return "\nBlanket Info\nSize: "+size+"\nColor: "+color+"\nMaterial: "+material+"\nPrice: "+price;
    }
}