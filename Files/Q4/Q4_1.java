import java.io.*;

class Record implements Serializable {
    private int n;
    private double d;

    Record(int n, double d) {
        this.n = n;
        this.d = d;
    }

    @Override
    public String toString() {
        return "Item Number : " + n + " Price : " + d + "\n";
    }
}

public class Q4_1 {
    public static void main(String[] args) {
        try {
            int i;
            FileInputStream fi = new FileInputStream(new File("Files/test4.txt"));
            ObjectInputStream oi = new ObjectInputStream(fi);
            Record[] obj = new Record[5];
            for (i = 0; i < 5; i++) {
                try{
                    obj[i] = (Record) oi.readObject();
                    System.out.println(obj[i].toString());
                }
                catch(ClassNotFoundException e){
                    System.out.println(e);
                }
            }
            oi.close();
            fi.close();
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
