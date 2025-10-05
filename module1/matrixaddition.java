
import java.util.Scanner;

public class matrixaddition {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int size=scn.nextInt();
        int size2=scn.nextInt();
        int arr[][]=new int[size][size2];
        int arr2[][]=new int[size][size2];
        int sum[][]=new int [size][size2];
        
        System.out.println("enter the elements of the matrix 1:");
        for(int i=0;i<size;i++){
            for(int j=0;j<size2;j++){
                arr[i][j]=scn.nextInt();
            }
        }

        System.out.println("enter the elements of the matrix 2:");
        for(int i=0;i<size;i++){
            for(int j=0;j<size2;j++){
                arr2[i][j]=scn.nextInt();
            }
        }

        

       //addition of matrix:
       for(int i=0;i<size;i++){
        for(int j=0;j<size2;j++){
            sum[i][j]+=arr[i][j]+arr2[i][j];

        }
       }

       //print the matrix
       for(int i=0;i<size;i++){
        for(int j=0;j<size2;j++){
            System.out.print(sum[i][j]+" ");
        }
        System.out.println();
       }
scn.close();
    }
}
