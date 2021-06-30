import java.io.File;
import java.io.IOException;

public class Q1 {
    public static void main(String[] args) {
        try{
            File myObj = new File("Files/test1.txt");
            if(myObj.createNewFile()){
                System.out.println("File Created.");
            }
            else{
                System.out.println("File not created.");
            }
            System.out.println("File Exists : "+myObj.exists());
            System.out.println("Is Directory ? : "+myObj.isDirectory());
            System.out.println("Is File ? : "+myObj.isFile());
            System.out.println("File Name : "+myObj.getName());
            System.out.println("File Absolute Path : "+myObj.getAbsolutePath());
        }
        catch(IOException e){
            System.out.println("Error Occured : "+e);
        }
    }
}
