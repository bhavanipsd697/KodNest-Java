import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter the array element: ");
        for(int i = 0;i < a.length;i ++){
            a[i] =scan.nextInt();
        }
        System.out.println("Array Element are: ");
        for(int i = 0;i < a.length; i++){
            System.out.println(a[i]);   
        }
    }
}
// reverse order
class reverseorder{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int b[] = new int[5];
        System.out.println("Enter array element: ");
        for(int i = 0;i <b.length; i++){
            b[i] =scan.nextInt();
        }
        System.out.println("Arrays elemnets are: ");
        for(int i =4; i>=0; i--){
            System.out.println(b[i]);
        }
    }
}