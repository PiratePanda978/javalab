package Anupam;

import java.util.Scanner;

public class MATRIX {
    public int[][] arr = new int[3][3];
    int i, j;

    public MATRIX() {
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                arr[i][j] = 0;
            }
        }
    }

    public void readArr() {
        Scanner in = new Scanner(System.in);
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                arr[i][j] = in.nextInt();
            }
        }
    }

    public void printArr() {
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int[][] addArray(int[][] arr2) {
        int[][] sum = new int[3][3];
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                sum[i][j] = arr[i][j] + arr2[i][j];
            }
        }
        return sum;
    }

    public int[][] subArray(int[][] arr2) {
        int[][] diff = new int[3][3];
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                diff[i][j] = arr[i][j] - arr2[i][j];
            }
        }
        return diff;
    }
}