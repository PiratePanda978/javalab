public class ElectricBlanket extends Blanket{
    boolean automaticSwitchOff;
    int heatSetting;

    public ElectricBlanket(){
        super();
        automaticSwitchOff = false;
        heatSetting = 1;
    }

    public void setAutomaticSwitchOff(boolean automaticSwitchOff){
        this.automaticSwitchOff = automaticSwitchOff;

        if (automaticSwitchOff){
            price+=5.75;
        }
    }

    public void setHeatSetting(int heatSetting){
        if (heatSetting>=1 && heatSetting<=5){
            this.heatSetting = heatSetting;
        }else{
            System.out.println("Not a valid heat setting");
        }
    }

    public String toString(){
        return "\nBlanket Info\nSize: "+size+"\nColor: "+color+"\nMaterial: "+material+"\nPrice: "+price+"\nAutomatic switch: "+automaticSwitchOff+"\nHeat Setting: "+heatSetting;
    }
}