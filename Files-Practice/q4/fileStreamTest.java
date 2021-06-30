import java.io.*;
public class fileStreamTest{
    public static void main(String[] args) {
        try{
            byte bwrite[] = {2,3,4,5,6};
            OutputStream os = new FileOutputStream("test.txt");
            int x=0;
            for(x=0;x<bwrite.length;x++){
                os.write(bwrite[x]);
            }
            os.close();
            InputStream is = new FileInputStream("test.txt");
            int size = is.available();
            for(x=0;x<size;x++){
                System.out.print((char)is.read()+" ");
            }
            is.close();
            System.out.println();
        }
        catch(IOException e){
            System.out.println("Exception");
        }
    }
}