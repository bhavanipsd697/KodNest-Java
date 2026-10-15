import java.util.Scanner;
public class Usertype{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);// this is an object..
        System.out.println("enter ur name");
        String hello = scan.nextLine(); // the impt stored in one variable na//we should create one vatriavle..
        System.out.println("my name is: " + hello);
    }
}
class Example1{
    public static void main(String[]args){
        Scanner bannu = new Scanner(System.in);
        System.out.println("enter the age :");
        int age = bannu.nextInt();
        if(age >= 18){
            System.out.println("u are eglible");
        }else{
            System.out.println("noo u are not eglible");
        }
    }
}