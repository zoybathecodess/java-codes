
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        for(int n:nums){
            System.out.print(n+" ");
        }
        int [][] arr={{1,2},{3,4}};
        for(int[] n:arr){
            for(int m:n){
                System.out.print(m+" ");
            }
        }

        int [][] arr1={{12,13,14},{10,20,30}};
        System.out.println(arr1[0].length+arr1[1].length);

        Scanner scn=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=scn.nextInt();
        int[] numbers=new int[size];
        System.out.println("enter "+size+"numbers: ");
        for(int i=0;i<size;i++){
            numbers[i]=scn.nextInt();

        }
        }
    }
    

