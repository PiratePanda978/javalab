import Anupam.MATRIX;
public class testMatrix{
    public static void main(String[] args) {
        MATRIX obj1 = new MATRIX();
        MATRIX obj2 = new MATRIX();
        MATRIX sum = new MATRIX();
        MATRIX diff = new MATRIX();
        System.out.println("\nEnter matrix1 elements : ");
        obj1.readArr();
        System.out.println("\nMatrix 1 elements are : ");
        obj1.printArr();
        System.out.println("\nEnter matrix2 elements : ");
        obj2.readArr();
        System.out.println("\nMAtrix 2 elements are : ");
        obj2.printArr();
        System.out.println("\nThe sum is : ");
        sum.arr = obj1.addArray(obj2.arr);
        sum.printArr();
        System.out.println("\nThe difference is : ");
        diff.arr = obj1.subArray(obj2.arr);
        diff.printArr();
    }
}