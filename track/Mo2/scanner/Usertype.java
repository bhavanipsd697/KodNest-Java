import java.util.Scanner;
public class Usertype{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);// this is an object..
        System.out.println("enter ur name");
        String hello = scan.nextLine(); // the impt stored in one variable na//we should create one vatriavle..
        System.out.println("my name is: " + hello);
    }
}