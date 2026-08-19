import java.util.Scanner;
public class ThreeDim {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a[][][] = new int[3][3][3];
        System.out.println("Enter Arry Elements :");
        for(int i = 0;i <= a.length-1;i++){
            for(int j =0;j<=a[i].length-1;j++){
                for(int k = 0;k <=a[i][i].length-1;k++){
                    a[i][j][k] = scan.nextInt();
                }
            }
            System.out.println("Array Elements are :");
            for(int i =0;i<=a.length-1; i++){

            }
        }
    }
    
}
