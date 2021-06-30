interface volume{
    public void innerVolume();
    public void outerVolume();
}

class part implements volume{
    double s1,s2,s3,iV,oV;
    public part(double side1,double side2,double side3){
        s1 = side1;
        s2 = side2;
        s3 = side3;
        iV = 0.0;
        oV = 0.0;
    }
    public void innerVolume(){
        iV = (1.0/3.0)*(22.0/7.0)*s1*s2*s3;
    }
    public void outerVolume(){
        oV = (4.0/3.0)*(22.0/7.0)*s1*s2*s3;
    }
    public void show(){
        System.out.println("Inner volume = "+iV);
        System.out.println("Outer Volume = "+oV);
    }
}

public class q1 {
    public static void main(String[] args) {
        part obj = new part(2,3,4);
        obj.innerVolume();
        obj.outerVolume();
        obj.show();
    }
}
