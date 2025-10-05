
import java.util.Scanner;

public class matrixmultiply {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int size=scn.nextInt();
        int size2=scn.nextInt();
        int arr[][]=new int[size][size2];
        int arr2[][]=new int[size][size2];
        int product[][]=new int [size][size2];
        
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

        
        //matrix multiply 
        for(int i=0;i<size;i++){
            for(int j=0;j<size2;j++){
                product[i][j]=0;
            
            for(int k=0;k<size;k++){
                product[i][k]+=arr[i][k]*arr2[k][j];
            }
        }
    }


       //print the matrix
       for(int i=0;i<size;i++){
        for(int j=0;j<size2;j++){
            System.out.print(product[i][j]+" ");
        }
        System.out.println();
       }
scn.close();
    }
}
